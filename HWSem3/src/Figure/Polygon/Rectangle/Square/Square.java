package Figure.Polygon.Rectangle.Square;

import Figure.Polygon.Rectangle.Rectangle;

public class Square extends Rectangle {
    /**
     * Конструктор квадрата
     * @param side сторона
     * @throws Exception
     */
    public Square(double side) throws Exception{
        super(side, side);

        if (side <= 0){
            throw new Exception("Квадрат с такими сторонами не может существовать.");
        }
    }
}

