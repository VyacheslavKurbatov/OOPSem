import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> array2 = new MyArrayList<>();
        Integer[] arr = { 1, 5, 6, 4, 3 };
        String[] arrStr = { "aa", "aa", "aaa", "b", "bb", "bbb" };

        MyArrayList<Integer> array = new MyArrayList<>(arr);
        MyArrayList<String> arrayStr = new MyArrayList<>(arrStr);
        array.add(2);
        array.add(2);
        arrayStr.add("!");

//        System.out.println(arrayStr);
//        System.out.println(arrayStr.getLength());
//        arrayStr.remove(0);
        System.out.println(arrayStr);
//        System.out.println(arrayStr.getLength());

//        System.out.println(array);
//        System.out.println(array.getLength());
//        array.remove(0);
        System.out.println(array);
//        System.out.println(array.getLength());

//        arrayStr.bubbleSort();
//        array.selectionSort();
        array.setElement(15, 4);
        array.print();



    }
}
