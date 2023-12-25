
import java.util.ArrayList;

public class Lists {
	public static void main(String args[]) {
		ArrayList al=new ArrayList();
		ArrayList alist=new ArrayList(30);
		//ArrayList alist1=new ArrayList()
		al.add("John");
		al.add(true);
		al.add(10);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.remove(new Integer(10));
		System.out.println(al);
		//--boolean b=al.get(1);//not possible as compiler cannot understand whether it is boolean
		System.out.println(al.get(1));//getting the element at position 1
		ArrayList<String> strlist=new ArrayList<String>();//no type casting required,if any element is added to this no error is obtained
		
		
		
	}

}
