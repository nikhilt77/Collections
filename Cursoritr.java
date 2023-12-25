import java.util.ArrayList;
import java.util.Iterator;
public class Cursoritr {
	public static void main(String args[]) {
		ArrayList<Integer> data=new ArrayList<>();
		data.add(12);
		data.add(24);
		data.add(36);
		data.add(43);
		Iterator itr=data.iterator();
		while(itr.hasNext()) {
			Integer i=(Integer)itr.next();
			if(i%3==0) {
				System.out.println(i);
			}else {
				itr.remove();
			}			
		}
		System.out.println(data);
		
	}

}
