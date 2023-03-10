import Animal.Animal;
import Animal.Bird.Chicken;

public class Main {
    public static void main(String[] args) {
        Animal chicken = new Chicken(53.5, 3.75, "желтый", 2.5);
        Animal chicken2 = new Chicken(55.5, 3.75, "желтый", 2.5);

//        ((Chicken) chicken).fly();
//        ((Chicken) chicken).printInfo();
//        ((Chicken) chicken).makeSound();
        Zoo zoo = new Zoo();
        zoo.addAnimal(chicken);
        zoo.addAnimal(chicken2);
//        zoo.removeAnimal(0);
//        System.out.println(zoo.getInfo(0));
//        System.out.println(zoo);
//        zoo.makeSound(0);
//        zoo.getAll();
//        zoo.makeAllSound();
        Menu menu = new Menu();
        menu.mainMenu(zoo);


    }
}
