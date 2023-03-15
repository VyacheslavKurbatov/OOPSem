package Figure.Circle;

import Figure.Figure;

public class Circle extends Figure implements CircleInterface {
    private double radius;

    /**
     * Конструктор круга
     * @param radius радиус
     * @throws Exception
     */
    public Circle(double radius) throws Exception {
        this.radius = radius;
        if (radius <= 0){
            throw new Exception(String.format("Hе может быть круга с радиусом %f", radius));
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", длинна окружности: " + this.circumferenceLength() +
                ", радиус: " + radius;
    }


    @Override
    public double squareFigure() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double circumferenceLength() {
        return 2 * Math.PI * radius;
    }
}
