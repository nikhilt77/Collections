import java.util.*;
public class Palindrome{
	public static void main(String args[]){
		Scanner P=new Scanner(System.in);
		System.out.print("Enter String:");
		String str=P.nextLine();
		boolean palindrome=true;
		int l=str.length();
		str=str.toLowerCase();
		for(int i=0;i<l;i++){
			if(str.charAt(i)!=str.charAt(l-i-1)){
				palindrome=false;
			}
		}
		if(palindrome){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}
}
