import java.util.*;
public class IdentityHash{
	public static void main(String args[]){
		IdentityHashMap<Integer,String> m=new IdentityHashMap<>();
		Integer a=new Integer(10);
		Integer b=new Integer(10);
		m.put(a,"Maths");
		m.put(b,"History");
		System.out.println(m);
		}
	}	
	
/*Here object refernece is different so it prints duplicate values 
which is the opposite in HashMap*/	
