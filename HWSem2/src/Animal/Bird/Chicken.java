package Animal.Bird;

import Animal.AnimalInterface;

public class Chicken extends Bird implements AnimalInterface, BirdInterface{

    /**
     * Конструктор курицы
     * @param height рост животного
     * @param weight вес животного
     * @param eyeColor цвет глаз
     * @param heightFly высота полета
     */
    public Chicken(double height, double weight, String eyeColor, double heightFly) {
        super(height, weight, eyeColor, heightFly);
    }

    @Override
    public void makeSound() {
        System.out.println("\nКо-ко-ко\n");
    }

    @Override
    public String toString() {
        return "Chicken{} " + super.toString();
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
