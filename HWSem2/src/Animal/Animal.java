package Animal;

public abstract class Animal {
    double height; // рост
    double weight; // вес
    String eyeColor; // цвет глаз

    /**
     * Конструктор животного
     * @param height рост
     * @param weight вес
     * @param eyeColor цвет глаз
     */
    protected Animal(double height, double weight, String eyeColor) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "height=" + height +
                ", weight=" + weight +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }
}
