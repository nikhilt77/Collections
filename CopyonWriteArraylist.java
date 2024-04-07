package com.example.mypackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyonWriteArraylist {
	static boolean isPalindrome(String str) {
		String rev="";
		str=str.toUpperCase();
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	static CopyOnWriteArrayList<String> li=new CopyOnWriteArrayList<>();
	public static void main(String[] args) {
		li.add("React");
		li.add("HTML");
		li.add("CSS");
		li.add("JS");
		li.add("Malayalam");
		System.out.println(li);
		Iterator itr=li.iterator();
		while(itr.hasNext()) {
			String name=(String) itr.next();
			if(isPalindrome(name)) {
				System.out.println(name);
				li.remove(name);				
			}
			System.out.println(li);
		}
	}

}
