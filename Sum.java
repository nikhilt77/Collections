import java.util.ArrayList;
import java.util.Scanner;
public class Sum {
	public static void main(String args[]) {
		int tot=0;
		ArrayList<Integer> l=new ArrayList();
		l.add(2);
		l.add(3);
		l.add(43);
		l.add(543);
		for(int sum:l) {
			tot+=sum;
		}
		System.out.println(tot);
		
	}

}
