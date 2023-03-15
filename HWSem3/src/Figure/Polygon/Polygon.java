package Figure.Polygon;

import Figure.Figure;

import java.util.ArrayList;
import java.util.List;

public abstract class Polygon extends Figure implements PoligonInterface{
    protected List<Double> sides = new ArrayList<>();

    /**
     * Конструктор многоугольника
     * @param sides стороны
     * @throws Exception
     */
    protected Polygon(double... sides) throws Exception {

        for (double side : sides) {
            if (side <= 0){
                throw new Exception("Многоугольник с такими сторонами не может существовать.");
            }
        }
    }

    @Override
    public double perimeter() {
        double sum = 0;
        for (double side : this.sides) {
            sum += side;
        }
        return sum;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
