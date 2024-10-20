import java.io.*;
import java.util.*;
import java.util.function.Predicate;

public class predicateSample {

    public static int getChoice(Scanner P) {
        System.out.println("\nChoose a condition to remove numbers:");
        System.out.println("1. Remove even numbers");
        System.out.println("2. Remove odd numbers");
        System.out.println("3. Remove numbers greater than a value");
        System.out.println("4. Remove numbers less than a value");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        return P.nextInt();
    }

    public static void main(String args[]) throws IOException {
        Scanner P = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();

        System.out.println("Enter the number of elements:");
        int n = P.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            al.add(P.nextInt());
        }

        System.out.println("Original ArrayList: " + al);

        while (true) {
            int choice = getChoice(P);
            Predicate<Integer> p = null;

            switch (choice) {
                case 1:
                    break;
                case 2:
                    p = num -> num % 2 != 0;
                    break;
                case 3:
                    System.out.print("Enter the value: ");
                    int val = P.nextInt();
                    p = num -> num > val;
                    break;
                case 4:
                    System.out.print("Enter the value: ");
                    int val1 = P.nextInt();
                    p = num -> num < val1;
                    break;
                case 5:
                    System.out.println("Exiting and saving the ArrayList...");
                    saveArrayList(al, "arraylist.ser");

                    ArrayList<Integer> deserializedList = loadArrayList(
                        "arraylist.ser"
                    );
                    System.out.println(
                        "ArrayList after Deserialization: " + deserializedList
                    );

                    P.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }

            if (p != null) {
                al.removeIf(p);
                System.out.println("Updated ArrayList: " + al);
            }
        }
    }

    public static void saveArrayList(ArrayList<Integer> al, String filename) {
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(al);
            oos.close();
            fos.close();
            System.out.println(
                "\nArrayList has been serialized to " + filename
            );
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e);
        }
    }

    public static ArrayList<Integer> loadArrayList(String filename) {
        ArrayList<Integer> al = null;
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            if (obj instanceof ArrayList<?>) {
                @SuppressWarnings("unchecked")
                ArrayList<Integer> temp = (ArrayList<Integer>) obj; // Safe cast
                al = temp;
            } else {
                System.out.println(
                    "Error: Deserialized object is not an ArrayList."
                );
            }
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e);
        }
        return al;
    }
}
