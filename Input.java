import java.util.ArrayList;
import java.util.Scanner;

public class Sum {
    public static void main(String args[]) {
        ArrayList<Integer> l = new ArrayList<>();
        System.out.println("Enter elements and terminate array by entering -1 as last element: ");
        int inp;
        Scanner s = new Scanner(System.in);

        while (true) {
            inp = s.nextInt();
            if (inp == -1) {
                break; // Exit the loop when -1 is entered
            }
            l.add(inp);
        }

        s.close();

        int tot = 0;
        for (int sum : l) {
            tot += sum;
        }

        System.out.println("Sum of input Elements is " + tot);
    }
}