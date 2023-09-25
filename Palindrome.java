import java.io.*;
import java.util.Scanner;
public class Palindrome {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s,rev="";
		int n;
		char r;
		//Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		s=sc.nextLine();
		
		n=s.length();
		sc.close();
		for(int i=n-1;i>=0;i--) {
			r=s.charAt(i);
			rev=rev+r;
		}
		if(s.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}