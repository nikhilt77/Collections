import java.util.*;
public class CollectionsFramework {

	public static void main(String[] args) {
		TreeSet s=new TreeSet(new ComparatorDemo());
		Scanner P=new Scanner(System.in);
		System.out.print("Enter elements: ");
		
		while(P.hasNext()) {
			int e=P.nextInt();
			if(e==-1) {
				break;
			}
			s.add(e);
		}
		System.out.print(s);
		
	}

}
