import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class squareFilter {

    public static void main(String args[]) {
        System.out.println("Enter the no. of elements:");
        int n;
        Scanner P = new Scanner(System.in);
        n = P.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int ele = P.nextInt();
            arr.add(ele);
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
        ArrayList<Integer> squares = (ArrayList<Integer>) arr
            .stream()
            .filter(i -> i % 2 == 0)
            .map(i -> i * i)
            .collect(Collectors.toList());
        for (int x : squares) {
            System.out.print(x + " ");
        }
        ArrayList<String> names = new ArrayList<String>();
        System.out.println("Enter no. of names:");
        int m = P.nextInt();
        System.out.println("Enter names:");
        for (int i = 0; i < m; i++) {
            String name = P.next();
            names.add(name);
        }
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
        char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
        ArrayList<String> vowelNames = (ArrayList<String>) names
            .stream()
            .filter(i -> {
                char fr = Character.toLowerCase(i.charAt(0));
                for (char vow : vowels) {
                    if (fr == vow) {
                        return true;
                    }
                }
                return false;
            })
            .collect(Collectors.toList());
        for (String name : vowelNames) {
            System.out.print(name + " ");
        }
    }
}
