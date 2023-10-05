import java.util.TreeSet;
import java.util.Scanner;
import java.util.SortedSet;
public class Sorteds {

	public static void main(String[] args) {
		SortedSet s=new TreeSet();
		Scanner P=new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n=P.nextInt();
		System.out.println("Enter the limit: ");
		int l=P.nextInt();
		System.out.println("Enter final limit: ");
		int f=P.nextInt();
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++)
		{
			int e=P.nextInt();
			s.add(e);
		}
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.comparator());
		System.out.println(s.headSet(l));
		System.out.println(s.tailSet(f));
		}

}
