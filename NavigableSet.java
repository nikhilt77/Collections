import java.util.*;
public class Navigables {

	public static void main(String[] args) {
		Scanner P=new Scanner(System.in);
		NavigableSet<Integer> d=new TreeSet<Integer>();
		System.out.println("Enter Limit: ");
		int n=P.nextInt();
		System.out.println("Enter Numbers: ");
		for(int i=0;i<n;i++) {
			int e=P.nextInt();
			d.add(e);
		}
		System.out.println(d);
		System.out.println("Enter number: ");
		int l=P.nextInt();
		System.out.println(d.floor(l));
		System.out.println(d.lower(l));
		System.out.println(d.higher(l));
		System.out.println(d.pollFirst());
		System.out.println(d.pollLast());
		System.out.println(d.descendingSet());

	}

}
