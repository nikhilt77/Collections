import java.util.Scanner;
import java.util.Vector;
import java.util.Enumeration;
public class Cursors {
	public static void main(String args[]) {
		Vector<Integer> v=new Vector<Integer>();
		for(int i=0;i<=9;i++) {
			Scanner p=new Scanner(System.in);
			Integer data=p.nextInt();
			v.addElement(data);
		}
		System.out.println("vector: "+v);
		Enumeration<Integer> e=v.elements();
		while(e.hasMoreElements()) {
			Integer element=(Integer)e.nextElement();
			if(element%3==0) {
				System.out.println(element);
			}
		}
		
	}

}
