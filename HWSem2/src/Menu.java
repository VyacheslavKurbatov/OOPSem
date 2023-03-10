import Animal.Animal;
import Animal.Bird.BirdInterface;
import Animal.Bird.Chicken;
import Animal.Bird.Stork;
import Animal.Pet.Cat;
import Animal.Pet.Dog;
import Animal.Pet.DogInterface;
import Animal.Pet.PetInterface;
import Animal.WildAnimal.Tiger;
import Animal.WildAnimal.Wolf;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public void mainMenu(Zoo zoo){
        clearsScreen();
        System.out.println("Добро пожаловать в зоопарк.");
        System.out.println();
        System.out.println("""
                1. Добавить животное в зоопарк.
                2. Убрать животное из зоопарка.
                3. Посмотреть информацию обо всех животных.
                4. Посмотреть информацию о конкретном животном.
                5. Заставить животное издать звук.
                6. Заставить издать звук всех животных.
                7. Выход.
                """);
        int inputData = inputDataInt("Введите команду: ", "Такой команды нет.", 8);

        switch (inputData){
            case 1:
                menuAddAnimal(zoo);
            case 2:
                menuDeleteAnimal(zoo);
            case 3:
                menuInfoAllAnimal(zoo);
            case 4:
                menuInfoAnimal(zoo);
            case 5:
                menuMakeSound(zoo);
            case 6:
                menuMakeAllSound(zoo);
            case 7:
                System.exit(0);
        }
    }
    private void clearsScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }
    private Integer inputDataInt(String text1, String text2, int maxValue) {
        Scanner iScanner = new Scanner(System.in);
        boolean flag = false;
        int inputData = 0;
        while (!flag) {
            System.out.print(text1);

            inputData = iScanner.nextInt();

            if (inputData < 0 || inputData >= maxValue) {
                System.out.println(text2);
            } else {
                flag = true;
            }
        }
        return inputData;
    }
    private Animal createAnimal(){
        Scanner iScanner = new Scanner(System.in);
        int choosAnimal = inputDataInt("""
                1. Курица
                2. Аист
                3. Кот
                4. Собака
                5. Тигр
                6. Волк

                Выберите какое животно вы хотите добавить:\s""","Такой команды нет.", 6);
        Animal newAnimal = null;

        System.out.print("Введите рост: ");
        double height = iScanner.nextDouble();
        System.out.print("Введите вес: ");
        double weight = iScanner.nextDouble();
        System.out.print("Введите цвет глаз: ");
        String eyeColor = iScanner.next();

        String name = "";
        String breed = "";
        boolean availabilityVaccinations = false;
        String coatColor = "";
        String birthDate = "";
        String habitat = "";

        if (choosAnimal == 3 || choosAnimal == 4){
            System.out.print("Введите кличку : ");
            name = iScanner.nextLine();
            name = iScanner.nextLine();
            System.out.print("Введите породу : ");
            breed = iScanner.nextLine();
            breed = iScanner.nextLine();
            System.out.print("Введите наличие прививок (true/false): ");
            availabilityVaccinations = iScanner.nextBoolean();
            System.out.print("Введите цвет шерсти : ");
            coatColor = iScanner.nextLine();
            coatColor = iScanner.nextLine();
            System.out.print("Введите дату рождения : ");
            birthDate = iScanner.nextLine();
            birthDate = iScanner.nextLine();
        }
        if (choosAnimal == 5 || choosAnimal == 6){
            System.out.print("Введите среду обитания : ");
            habitat = iScanner.nextLine();
            habitat = iScanner.nextLine();
            System.out.println("Введите дату рождения : ");
            birthDate = iScanner.nextLine();
            birthDate = iScanner.nextLine();
        }

        switch (choosAnimal) {
            case 1:
                System.out.print("Введите высоту полета: ");
                double heightFlyChiken = iScanner.nextDouble();

                newAnimal = new Chicken(height, weight, eyeColor, heightFlyChiken);
                return newAnimal;
            case 2:
                System.out.print("Введите высоту полета: ");
                double heightFlyStork = iScanner.nextDouble();

                newAnimal = new Stork(height, weight, eyeColor, heightFlyStork);
                return newAnimal;
            case 3:
                System.out.print("Введите наличие шерсти (true/false): ");
                boolean pressenceWool = iScanner.nextBoolean();

                newAnimal = new Cat(height, weight, eyeColor,
                        name, breed, availabilityVaccinations, coatColor, birthDate,
                        pressenceWool);

                return newAnimal;
            case 4:
                System.out.print("Тренированный (true/false): ");
                boolean trained = iScanner.nextBoolean();

                newAnimal = new Dog(height, weight, eyeColor,
                        name, breed, availabilityVaccinations, coatColor, birthDate,
                        trained);
                return newAnimal;
            case 5:

                newAnimal = new Tiger(height, weight, eyeColor, habitat, birthDate);
                return newAnimal;
            case 6:
                System.out.print("Вожак стаи (true/false): ");
                boolean alpha = iScanner.nextBoolean();
                newAnimal = new Wolf(height, weight, eyeColor, habitat, birthDate, alpha);
        }
        return newAnimal;
    }
    private String inputDataString(String text){
        Scanner iScanner = new Scanner(System.in);
        System.out.print(text);
        return iScanner.nextLine();
    }

    private void menuAddAnimal(Zoo zoo){
        Animal animal = createAnimal();
        zoo.addAnimal(animal);
        System.out.println("Животное дабавлено");
        mainMenu(zoo);
    }
    private void menuDeleteAnimal(Zoo zoo){
        if (zoo.size() > 0) {
            int i = inputDataInt("Введите номер животного, которого необходимо убрать: ",
                    "Такого животного нет", zoo.size());
            zoo.removeAnimal(i);
        } else {
            System.out.println("Зоопарк пуст");
        }
        System.out.println("\nЖивотное убрано\n");
        mainMenu(zoo);
    }
    private void menuInfoAllAnimal(Zoo zoo){
        zoo.getAll();
        inputDataString("Для возврата в главное меню введите что-угодно: ");
        mainMenu(zoo);
    }
    private void menuInfoAnimal(Zoo zoo){
        String question;
        if (zoo.size() > 0) {
            int i = inputDataInt("Введите номер животного, которого хотите посмотреть: ",
                    "Такого животного нет", zoo.size());
            Animal infoAnimal = zoo.getInfo(i);
            System.out.println(infoAnimal);

            if (infoAnimal instanceof BirdInterface){
                System.out.println("У этого животного есть особая способность: летать\n");
                question = inputDataString("Чтобы оно полетело введите fly, для возврата в главное меню " +
                        "введите что-угодно другое: ");
                if (question.equals("fly")){
                    System.out.println();
                    ((BirdInterface) infoAnimal).fly();
                }
            }
            if (infoAnimal instanceof PetInterface){
                System.out.println("У этого животного есть особая способность: проявить ласку\n");
                question = inputDataString("Чтобы оно проявило ласку введите affection, " +
                        "для возврата в главное меню введите что-угодно другое: ");
                if (question.equals("affection")){
                    System.out.println();
                    ((PetInterface) infoAnimal).showAffection();
                }
            }
            if (infoAnimal instanceof DogInterface){
                System.out.println("У этого животного есть особая способность: дрессировать\n");
                question = inputDataString("Чтобы оно стало дрессированным введите training, " +
                        "для возврата в главное меню введите что-угодно другое: ");
                if (question.equals("training")){
                    System.out.println();
                    ((DogInterface) infoAnimal).training();
                }
            }

            inputDataString("Для возврата в главное меню введите что-угодно: ");

        } else {
            System.out.println("Зоопарк пуст");
        }
        mainMenu(zoo);
    }
    private void menuMakeSound(Zoo zoo){
        if (zoo.size() > 0) {
            int i = inputDataInt("Введите номер животного, которому издать звук: ",
                    "Такого животного нет", zoo.size());
            zoo.makeSound(i);
            inputDataString("Для возврата в главное меню введите что-угодно: ");
        } else {
            System.out.println("Зоопарк пуст");
        }
        mainMenu(zoo);
    }
    private void menuMakeAllSound(Zoo zoo){
        if (zoo.size() > 0) {
            zoo.makeAllSound();
            inputDataString("Для возврата в главное меню введите что-угодно: ");
        } else {
            System.out.println("Зоопарк пуст");
        }
        mainMenu(zoo);
    }
}
