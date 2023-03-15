package Figure;

public abstract class Figure implements Comparable<Figure> {
    public abstract double squareFigure();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": Площадь равна " + this.squareFigure();
    }

    @Override
    public int compareTo(Figure o) {
        return Double.compare(this.squareFigure(), o.squareFigure());
    }
}
