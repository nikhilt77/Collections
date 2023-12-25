import java.util.Vector;
public class Vectors {
	public static void main(String args[]) {
		Vector v=new Vector();
		Vector vec=new Vector(60);
		Vector vec1=new Vector(100,5);
		v.addElement("John");
		System.out.println(v);
		v.remove(0);
		System.out.println(v);
		v.add("Nandu");
		v.addElement("is a pottan");
		System.out.println(v);
		System.out.println(v.elementAt(1));
		System.out.println(v.firstElement());
		System.out.println(v.capacity());
		System.out.println(v.size());
	}

}
