package Animal.Pet;

import Animal.AnimalInterface;

public class Cat extends Pet implements AnimalInterface, PetInterface {
    boolean presenceWool; // наличие шерсти

    /**
     * Конструктор кота
     * @param height рост
     * @param weight вес
     * @param eyeColor цвет гдаз
     * @param name кличка
     * @param breed порода
     * @param availabilityVaccinations наличие прививок
     * @param coatColor цвет шерсти
     * @param birthDate дата рождения
     * @param presenceWool наличие шерсти
     */
    public Cat(double height, double weight, String eyeColor, String name, String breed,
               boolean availabilityVaccinations, String coatColor, String birthDate, boolean presenceWool) {
        super(height, weight, eyeColor, name, breed, availabilityVaccinations, coatColor, birthDate);
        this.presenceWool = presenceWool;
    }

    @Override
    public void makeSound() {
        System.out.println("\nБезразличен я к тебе, по команде не мяукую\n");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "presenceWool=" + presenceWool +
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

    public boolean isPresenceWool() {
        return presenceWool;
    }

    @Override
    public void showAffection() {
        System.out.println("Мур-мур-мур\n\n");
    }
}


