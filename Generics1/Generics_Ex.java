import java.util.*;

class Generics_Ex{

    @SafeVarargs
    static <T> void arg(T... V) {
        System.out.println("Length of array is: " + V.length);
        for (T x : V) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Integer arr1[] = { 1, 2, 3, 4, 5 };
        Double arr2[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Character arr3[] = { 'H', 'E', 'L', 'L', 'O' };
        arg(arr1);
        arg(arr2);
        arg(arr3);
    }
}
