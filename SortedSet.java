import java.util.TreeSet;
import java.util.Scanner;
import java.util.SortedSet;
public class Sorteds {

	public static void main(String[] args) {
		SortedSet s=new TreeSet();
		Scanner P=new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n=P.nextInt();
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++)
		{
			int e=P.nextInt();
			s.add(e);
		}
		System.out.println(s);
		}

}
