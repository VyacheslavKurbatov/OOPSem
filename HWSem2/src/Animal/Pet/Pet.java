package Animal.Pet;


import Animal.Animal;

public abstract class Pet extends Animal {
    String name; // Кличка
    String breed; // порода
    boolean availabilityVaccinations; // наличие прививок
    String coatColor; // цвет шерсти
    String birthDate; // дата рождения

    /**
     * конструктор домашнего животного
     * @param height рост
     * @param weight вес
     * @param eyeColor цвет глаз
     * @param name кличка
     * @param breed порода
     * @param availabilityVaccinations наличие прививок
     * @param coatColor цвет шерсти
     * @param birthDate дата рождения
     */
    public Pet(double height, double weight, String eyeColor, String name, String breed,
               boolean availabilityVaccinations, String coatColor, String birthDate) {
        super(height, weight, eyeColor);
        this.name = name;
        this.breed = breed;
        this.availabilityVaccinations = availabilityVaccinations;
        this.coatColor = coatColor;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", availabilityVaccinations=" + availabilityVaccinations +
                ", coatColor='" + coatColor + '\'' +
                ", birthDate='" + birthDate + '\'' +
                "} " + super.toString();
    }
}
