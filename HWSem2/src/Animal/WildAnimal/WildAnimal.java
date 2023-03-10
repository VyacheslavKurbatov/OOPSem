package Animal.WildAnimal;

import Animal.Animal;

public abstract class WildAnimal extends Animal {
    String habitat; // место обитания
    String birthDate; // дата рождения

    /**
     * Конструктор дикого животного
     * @param height рост
     * @param weight вес
     * @param eyeColor цвет глаз
     * @param habitat место обитания
     * @param birthDate дата рождения
     */
    public WildAnimal(double height, double weight, String eyeColor, String habitat, String birthDate) {
        super(height, weight, eyeColor);
        this.habitat = habitat;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
                "habitat='" + habitat + '\'' +
                ", birthDate='" + birthDate + '\'' +
                "} " + super.toString();
    }
}
