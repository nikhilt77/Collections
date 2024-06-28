import java.util.*;
import java.util.stream.Collectors;

public class StringFilter {

    public static void main(String args[]) {
        Scanner P = new Scanner(System.in);
        List<String> li = new ArrayList<>();
        System.out.println("Enter the number of strings:");
        int n = P.nextInt();
        P.nextLine();
        System.out.println("Enter character:");
        char ch = P.next().charAt(0);
        P.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter string " + (i + 1) + ":");
            String str = P.nextLine();
            str.toUpperCase();
            li.add(str);
        }
        System.out.println("Original list: " + li);

        String chr = String.valueOf(ch);
        chr.toUpperCase();
        List<String> filteredList = li
            .stream()
            .filter(s -> s.startsWith(chr))
            .collect(Collectors.toList());
        System.out.println("Filtered list: " + filteredList);
    }
}
