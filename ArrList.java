import java.util.*;
import java.util.stream.Collectors;

public class ArrList {

    public static void main(String args[]) {
        Scanner P = new Scanner(System.in);
        List<Integer> li = new ArrayList<>();
        System.out.println("Enter size: ");
        int n = P.nextInt();
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            int x = P.nextInt();
            li.add(x);
        }
        List<Integer> even = new ArrayList<>();
        even = li.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(even);
        List<String> sl = new ArrayList<>();
        List<String> s2 = new ArrayList<>();
        System.out.println("Enter size: ");
        int n1 = P.nextInt();
        for (int i = 0; i < n1; i++) {
            String s = P.nextLine();
            sl.add(s);
        }
        System.out.println(sl);
        sl = sl.stream().map(String::toUpperCase).collect(Collectors.toList());
        s2 = sl
            .stream()
            .filter(s -> s.startsWith("A"))
            .collect(Collectors.toList());
        System.out.println(sl + "\n" + s2);
    }
}
