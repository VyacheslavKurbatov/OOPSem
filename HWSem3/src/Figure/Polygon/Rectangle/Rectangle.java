package Figure.Polygon.Rectangle;

import Figure.Polygon.PoligonInterface;
import Figure.Polygon.Polygon;

public class Rectangle extends Polygon implements PoligonInterface {
    /**
     * Конструктор прямоугольника
     * @param sideA сторона А
     * @param sideB сторона В
     * @throws Exception
     */
    public Rectangle(double sideA, double sideB) throws Exception{
        super(sideA, sideB);
        this.sides.add(sideA);
        this.sides.add(sideB);
        this.sides.add(sideA);
        this.sides.add(sideB);

        for (double side : sides) {
            if (side <= 0){
                throw new Exception("Прямоугольник с такими сторонами не может существовать.");
            }
        }
    }
    @Override
    public double squareFigure() {
        return this.sides.get(0) * this.sides.get(1);
    }
    @Override
    public String toString() {
        return super.toString() + ", периметр: " + this.perimeter();
    }
}
