package Animal.Pet;

import Animal.AnimalInterface;

public class Dog extends Pet implements AnimalInterface, PetInterface, DogInterface {
    boolean trained; // дрессированный

    /**
     * Конструктор собаки
     * @param height рост
     * @param weight вес
     * @param eyeColor цвет глаз
     * @param name кличка
     * @param breed порода
     * @param availabilityVaccinations наличие прививок
     * @param coatColor цвет шерсти
     * @param birthDate дата рождения
     * @param trained дрессированный
     */
    public Dog(double height, double weight, String eyeColor, String name, String breed,
               boolean availabilityVaccinations, String coatColor, String birthDate, boolean trained) {
        super(height, weight, eyeColor, name, breed, availabilityVaccinations, coatColor, birthDate);
        this.trained = trained;
    }

    @Override
    public void makeSound() {
        System.out.println("\nГав\n");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "trained=" + trained +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", availabilityVaccinations=" + availabilityVaccinations +
                ", coatColor='" + coatColor + '\'' +
                ", birthDate='" + birthDate + '\'' +
                "} " + super.toString();
    }

    @Override
    public void printInfo() {
        System.out.println(this);
    }

    public boolean isTrained() {
        return trained;
    }

    @Override
    public void training(){
        if (!trained){
            trained = true;
            System.out.println("Теперь я дрессированный\n\n");
        }
    }

    @Override
    public void showAffection() {
        System.out.println("потерся об ногу и облизал лицо\n\n");
    }
}
