import java.util.*;
public class Treemap {
	public static void main(String args[]) {
		TreeMap m=new TreeMap();
		TreeMap m1=new TreeMap(new MySorting());
		SortedMap sm=new TreeMap();
		TreeMap m2=new TreeMap(sm);
		Map m4=new HashMap();
		TreeMap m3=new TreeMap(m4);
		m.put("Hello",24);
		m.put("Allo", 2);
		m.put("Hola", 15);
		m1.put("Max", 15);
		m1.put("Alex", 10);
		m1.put("John", 45);
		System.out.println(m);
		System.out.println(m1);
	}
}
