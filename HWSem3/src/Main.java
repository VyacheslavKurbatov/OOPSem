import Figure.Circle.Circle;
import Figure.Figure;
import Figure.Polygon.Rectangle.Rectangle;
import Figure.Polygon.Rectangle.Square.Square;
import Figure.Polygon.Triangle.Triangle;


public class Main {
    public static void main(String[] args) throws Exception {
        Figure circle = new Circle(2);

        Figure triangle = new Triangle(2, 5, 4);

        Figure rectangle = new Rectangle(3, 2);

        Figure square = new Square(2);

        ArrayFigures arrayFigures = new ArrayFigures();
        arrayFigures.add(circle);
        arrayFigures.add(triangle);
        arrayFigures.add(rectangle);
        arrayFigures.add(square);

        arrayFigures.showAllInfo();
        System.out.println();

        arrayFigures.sortBySquareFigure();
        arrayFigures.showAllInfo();

        arrayFigures.remove(2);
        arrayFigures.showAllInfo();
        System.out.println();

        arrayFigures.set(0, rectangle);
        arrayFigures.showAllInfo();
    }
}
