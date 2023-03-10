package Animal.Bird;

import Animal.AnimalInterface;

public class Stork extends Bird implements AnimalInterface, BirdInterface {
    /**
     * Конструктор Аиста
     * @param height рост
     * @param weight вес
     * @param eyeColor цвет глаз
     * @param heightFly высота полета
     */
    public Stork(double height, double weight, String eyeColor, double heightFly) {
        super(height, weight, eyeColor, heightFly);
    }

    @Override
    public String toString() {
        return "Stork{} " + super.toString();
    }

    @Override
    public void makeSound() {
        System.out.println("\nт-т-т-т-т-т-т-т-т-т\n");
    }

    @Override
    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public void fly() {
        super.fly();
    }
}
