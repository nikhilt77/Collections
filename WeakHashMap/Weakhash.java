import java.util.*;

public class Weakhash {
	public static void main(String args[]) throws InterruptedException{
		WeakHashMap m=new WeakHashMap();
		Temp t=new Temp();
		m.put(t,"element");
		System.out.println(m);
		t=null;
		System.gc();
		Thread.sleep(3000);
	}

}
/*In hashmap objects have mre reference than garbage collection 
  while it is the opposite in weakHashMap*/
