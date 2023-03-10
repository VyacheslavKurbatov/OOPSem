package Animal.Bird;

import Animal.Animal;

public abstract class Bird extends Animal {
    private double heightFly; // высота полета

    /**
     * конструктор птицы
     * @param height рост животного
     * @param weight вес животного
     * @param eyeColor цвет глаз
     * @param heightFly высота полета
     */
    public Bird(double height, double weight, String eyeColor, double heightFly) {
        super(height, weight, eyeColor);
        this.heightFly = heightFly;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "heightFly=" + heightFly +
                "} " + super.toString();
    }

    protected void fly(){
        System.out.printf("Я лечу на %f метрах\n", heightFly);
    }

}
