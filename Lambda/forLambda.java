import java.util.*;
import java.util.stream.*;

public class forLambda {

    public static void main(String args[]) {
        Scanner P = new Scanner(System.in);
        int n = P.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = P.nextInt();
        }
        /*List<Integer> li = Arrays.asList(arr);
        li
            .stream()
            .filter(x -> x % 2 == 0)
            .forEach(x -> System.out.println(x * x));*/
        List<Integer> li = Arrays.stream(arr)
            .boxed()
            .filter(x -> x > 10)
            .sorted(Comparator.reverseOrder())
            .filter(x -> x % 2 == 0)
            .collect(Collectors.toList());
        li.forEach(x -> System.out.println(x * x));
    }
}
