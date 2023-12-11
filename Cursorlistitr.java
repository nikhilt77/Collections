import java.util.ArrayList;
import java.util.ListIterator;
public class Cursorlistitr {

	public static void main(String[] args) {
		ArrayList<String> data=new ArrayList<>();
		data.add("Hey");
		data.add("Hello");
		data.add("Every");
		data.add("One");
		System.out.println(data);
		ListIterator li=data.listIterator();
		while(li.hasNext()) {
			String item=(String)li.next();
			if(item.equals("This")) {
				li.add("is a");
			}
			if(item.equals("Simple")) {
				li.remove();
			}
			if(item.equals("Java")) {
				li.set("Program");
			}
		}
		System.out.println(data);

	}

}
