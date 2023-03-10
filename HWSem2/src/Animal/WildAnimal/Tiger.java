package Animal.WildAnimal;

import Animal.AnimalInterface;

public class Tiger extends WildAnimal implements AnimalInterface {
    /**
     * Конструктор тигра
     * @param height рост
     * @param weight вес
     * @param eyeColor цвет глаз
     * @param habitat место обитания
     * @param birthDate дата рождения
     */
    public Tiger(double height, double weight, String eyeColor, String habitat, String birthDate) {
        super(height, weight, eyeColor, habitat, birthDate);
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "habitat='" + habitat + '\'' +
                ", birthDate='" + birthDate + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makeSound() {
        System.out.println("\nр-р-р-р\n");
    }

    @Override
    public void printInfo() {
        System.out.println(this);
    }
}
