package Figure.Polygon.Triangle;

import Figure.Polygon.PoligonInterface;
import Figure.Polygon.Polygon;

import java.util.ArrayList;
import java.util.List;

public class Triangle extends Polygon{
    /**
     * Конструктор треугольника
     * @param sideA сторона А
     * @param sideB сторона B
     * @param sideC сторона С
     * @throws Exception
     */
    public Triangle(double sideA, double sideB, double sideC) throws Exception {
        this.sides.add(sideA);
        this.sides.add(sideB);
        this.sides.add(sideC);

        if (sideA <= 0 || sideB <= 0 || sideC <= 0){
            throw new Exception("Hе может быть треугольника со стороной <= 0");
        }

        if (!((sideA + sideB) > sideC &&
                (sideB + sideC) > sideA &&
                (sideC + sideA) > sideB)){
            throw new Exception("Треугольник существует только тогда, " +
                    "когда сумма любых двух его сторон больше третьей.");
        }
    }

    @Override
    public double squareFigure() {
        double halfP = this.perimeter() / 2;
        return Math.sqrt(halfP *
                ((halfP - this.sides.get(0)) *
                        (halfP - this.sides.get(1)) *
                        (halfP - this.sides.get(2))));
    }

    @Override
    public String toString() {
        return super.toString() + ", периметр: " + this.perimeter();
    }
}
