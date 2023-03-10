package Animal.WildAnimal;

import Animal.AnimalInterface;

public class Wolf extends WildAnimal implements AnimalInterface {
    boolean alpha; // вожак стаи

    /**
     * Конструктор волка
     * @param height рост
     * @param weight вес
     * @param eyeColor цвет глаз
     * @param habitat зона обитания
     * @param birthDate дата рождения
     * @param alpha вожак стати
     */
    public Wolf(double height, double weight, String eyeColor, String habitat, String birthDate, boolean alpha) {
        super(height, weight, eyeColor, habitat, birthDate);
        this.alpha = alpha;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "alpha=" + alpha +
                ", habitat='" + habitat + '\'' +
                ", birthDate='" + birthDate + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makeSound() {
        System.out.println("\nУууууууууууууу\n");
    }

    @Override
    public void printInfo() {
        System.out.println(this);
    }

    public boolean isAlpha() {
        return alpha;
    }
}
