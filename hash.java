import java.util.*;

public class hash {

    public static void main(String args[]) {
        Scanner P = new Scanner(System.in);
        HashMap<Integer, Integer> mpp = new HashMap<>();
        System.out.println("Enter array size:");
        int n = P.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = P.nextInt();
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
        }
        Map.Entry<Integer, Integer> max = mpp
            .entrySet()
            .stream()
            .max(Map.Entry.comparingByValue())
            .orElse(null);
        if (max != null) {
            System.out.println("Highest Freq element:" + max.getKey());
            System.out.println("Frequency:" + max.getValue());
        }
    }
}
