import java.util.*;
public class Navigablemap {
	public static void main(String args[]) {
		NavigableMap<String,Integer> N=new TreeMap<>();
		N.put("Maths", 1);
		N.put("History", 2);
		N.put("Chem", 3);
		N.put("Analytics", 7);
		N.put("Micro", 14);
		N.put("Histology", 72);
		N.put("Chemical Science", 63);
		N.put("Anatomy", 7);
		System.out.println(N);
		System.out.println(N.ceilingEntry("History"));//Least key greater than or equal to
		System.out.println(N.ceilingEntry("Histology"));//Greatest key less than or equal to
		System.out.println(N.floorKey("Analytics"));//Least key greater than
		System.out.println(N.higherKey("Anatomy"));//returns least key greater than or equal
		System.out.println(N.lowerKey("Histology"));
		System.out.println(N.ceilingKey("Chem"));
		System.out.println(N.descendingKeySet());//descending order
		System.out.println(N.descendingMap());//return key value pairs
		System.out.println(N.headMap("Analytics"));//returns values just before
		System.out.println(N.headMap("Micro",true));//includes this
		System.out.println(N.subMap("Chem", "Chemical Science"));//includes start value but not end
		System.out.println(N.subMap("Anatomy", true, "History", false));//include first not second
		System.out.println(N.tailMap("Maths"));//values just after this is printed
		System.out.println(N.tailMap("Histology", false));//starting key not inluded
		System.out.println(N.higherEntry("Chem"));//key strictly greater than it
		System.out.println(N.navigableKeySet());//ascending order
	}
}
