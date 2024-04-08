import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaCollections1 {

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();

        li.add(10);
        li.add(25);
        li.add(4);
        li.add(14);
        li.add(27);

		    Collections.sort(li,(o1,o2)-> {		if(o1>o2) {
			    return -1;
		    }
		    else if(o1<o2) {
			    return 1;
		    }
		    else {
			    return 0;
		    }
		    });

        List<Integer> evenNumbers = li.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        int sum = li.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum: " + sum);

        int max = li.stream().mapToInt(Integer::intValue).max().orElse(-1);
        System.out.println("Max: " + max);

        int min = li.stream().mapToInt(Integer::intValue).min().orElse(-1);
        System.out.println("Min: " + min);

        double average = li.stream().mapToInt(Integer::intValue).average().orElse(-1);
        System.out.println("Average: " + average);
    }
}
