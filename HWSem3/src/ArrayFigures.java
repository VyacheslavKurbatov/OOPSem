import Figure.Figure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayFigures {
    private final List<Figure> figures = new ArrayList<>();

    public void add(Figure figure){
        this.figures.add(figure);
    }
    public void showAllInfo(){
        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }
    public void remove(int i){
        this.figures.remove(i);
    }

    public void set(int i, Figure figure){
        this.figures.set(i, figure);
    }

    public void sortBySquareFigure(){
        Collections.sort(this.figures);
    }
}
