import javax.lang.model.util.Elements;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MyArrayList <T>{
    private T[] myArrayLIst;
    private int length;

    /**
     * Конструктор по умолчанию
     */
    public MyArrayList() {
        this.myArrayLIst = (T[]) new Object[0];
        this.length = 0;
    }

    /**
     * Конструктор
     * @param array массив, на основе которго создается динамический массив
     */
    public MyArrayList(T[] array) {
        this.myArrayLIst = Arrays.copyOf(array, array.length);
        this.length = array.length;

    }
    @Override
    public String toString() {
        return Arrays.toString(myArrayLIst);
    }

    /**
     * Добавление элемента в динамический массив
     * @param value элемент
     */
    public void add(T value){
        this.myArrayLIst = Arrays.copyOf(myArrayLIst, myArrayLIst.length + 1);
        myArrayLIst[myArrayLIst.length - 1] = value;
        this.length += 1;
    }

    /**
     * Длинна массива
     */
    public int getLength(){
        return length;
    }

    /**
     * Удаление элемента по индексу
     * @param i индекс элемента
     */
    public void remove(int i){
        if (i < 0 || i >= length){
            throw new RuntimeException("Элемента с индексом " + i + " нет в массиве");
        } else {
            final int newSize = length - 1;
            if (newSize > i) System.arraycopy(myArrayLIst, i + 1, myArrayLIst, i, newSize - i);
            myArrayLIst[length = newSize] = null;
            myArrayLIst = Arrays.copyOf(myArrayLIst, length);
        }
    }

    /**
     * Удаление элементов равных заданному
     * @param value удаляемый эллемет
     */
    public void removeAllSpecifiedElements(T value){
        int controll = length;
        for (int i = 0; i < length; i++) {
            if (myArrayLIst[i].equals(value)) {
                final int newSize = length - 1;
                if (newSize > i) System.arraycopy(myArrayLIst, i + 1, myArrayLIst, i, newSize - i);
                myArrayLIst[length = newSize] = null;
                myArrayLIst = Arrays.copyOf(myArrayLIst, length);
                i--;
            }
        }
    }

    /**
     * Поиск минимума
     * @return минимум
     */
    public T min(){
        T min = myArrayLIst[0];
        for (int i = 1; i < length; i++) {
            if (myArrayLIst[i] instanceof Comparable) {
                if (((Comparable) myArrayLIst[i]).compareTo(min) < 0) {
                    min = myArrayLIst[i];
                }
            }
        }
        return min;
    }

    /**
     * Поиск максимума
     * @return максимум
     */
    public T max(){
        T max = myArrayLIst[0];
        for (int i = 1; i < length; i++) {
            if (myArrayLIst[i] instanceof Comparable) {
                if (((Comparable) myArrayLIst[i]).compareTo(max) > 0) {
                    max = myArrayLIst[i];
                }
            }
        }
        return max;
    }

    /**
     * Сумма элементов массива
     *
     */
    public <T extends Number> T sum (){
        double sum = 0.0;

        for (int i = 0; i < length; i++) {
            if (myArrayLIst[i] instanceof Number) {
                sum += ((Number) myArrayLIst[i]).doubleValue();
            }
        }

        if (myArrayLIst[0] instanceof Integer) {
            return (T) Integer.valueOf((int) sum);
        } else if (myArrayLIst[0] instanceof Double) {
            return (T) Double.valueOf(sum);
        } else if (myArrayLIst[0] instanceof Float) {
            return (T) Float.valueOf((float) sum);
        } else if (myArrayLIst[0] instanceof Long) {
            return (T) Long.valueOf((long) sum);
        } else {
            return (T) Short.valueOf((short) sum);
        }
    }

    /**
     * Произведение элементов массива
     *
     */
    public <T extends Number> T multiplication (){
        double multiplication = 1.0;

        for (int i = 0; i < length; i++) {
            if (myArrayLIst[i] instanceof Number) {
                multiplication *= ((Number) myArrayLIst[i]).doubleValue();
            }
        }

        if (myArrayLIst[0] instanceof Integer) {
            return (T) Integer.valueOf((int) multiplication);
        } else if (myArrayLIst[0] instanceof Double) {
            return (T) Double.valueOf(multiplication);
        } else if (myArrayLIst[0] instanceof Float) {
            return (T) Float.valueOf((float) multiplication);
        } else if (myArrayLIst[0] instanceof Long) {
            return (T) Long.valueOf((long) multiplication);
        } else {
            return (T) Short.valueOf((short) multiplication);
        }
    }

    /**
     * Получение индекса заданного элемента
     * @param value искомый элемент
     * @return индекс
     */
    public List getIndex(T value) {
        List listIndex = new ArrayList();

        for (int i = 0; i < length; i++) {
            if (myArrayLIst[i].equals(value)) {
                listIndex.add(i);
            }
        }
        if (listIndex.size() > 0){
            return listIndex;
        } else {
            listIndex.add(-1);
        }
        return listIndex;
    }

    /**
     * Проверка наличия элемента в массиве
     * @param value Элемент
     * @return true\false
     */
    public boolean isThere(T value) {
        for (int i = 0; i < length; i++) {
            if (myArrayLIst[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Пузырьковая сортировка
     */
    public void bubbleSort(){
        if (myArrayLIst[0] instanceof Comparable){
            for (int i = 0; i < length-1; i++) {
                for (int j = 0; j < length - 1; j++) {
                    if (((Comparable) myArrayLIst[j]).compareTo(myArrayLIst[j+1]) > 0) {
                        T temp = myArrayLIst[j];
                        myArrayLIst[j] = myArrayLIst[j+1];
                        myArrayLIst[j+1] = temp;
                    }
                }
            }
        }
    }

    /**
     * Сортировка простыми вставками
     */
    public void insertionSort(){
        if (myArrayLIst[0] instanceof Comparable){
            for (int i = 1; i < length; i++) {
                T value = myArrayLIst[i];
                int j = i;
                while (j > 0 && ((Comparable) myArrayLIst[j-1]).compareTo(value) > 0){
                    myArrayLIst[j] = myArrayLIst[j-1];
                    j--;
                }
                myArrayLIst[j] = value;
            }
        }
    }

    /**
     * Сортировка выбором
     */
    public void selectionSort(){
        if (myArrayLIst[0] instanceof Comparable) {
            for (int i = 0; i < length - 1; i++) {
                int minElementIndex = i;
                for (int j = i + 1; j < length; j++) {
                    if (((Comparable) myArrayLIst[minElementIndex]).compareTo(myArrayLIst[j]) > 0) {
                        minElementIndex = j;
                    }
                }

                if (minElementIndex != i) {
                    T temp = myArrayLIst[i];
                    myArrayLIst[i] = myArrayLIst[minElementIndex];
                    myArrayLIst[minElementIndex] = temp;
                }
            }
        }
    }
    /**
     * Получение элемента массива по индексу
     * @param i индекс
     */
    public T getElement(int i){
        if (i < 0 || i >= length){
            throw new RuntimeException("Элемента с индексом " + i + " нет в массиве");
        } else {
            return myArrayLIst[i];
        }
    }
    /**
     * Задание значения элементу массива с заданным индексом
     */
    public void setElement(T value, int i){
        myArrayLIst[i] = value;
    }

    /**
     * Печать массива на экран
     */
    public void print(){
        System.out.println(Arrays.toString(myArrayLIst));
    }
}
