import java.util.*;
public class MySorting implements Comparator {
	public int compare(Object o1,Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
	}
}
