package com.example.mypackage;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class Copyonwritearayset  {

	public static void main(String[] args) {
		CopyOnWriteArraySet<String> a=new CopyOnWriteArraySet<>();
        a.add("Java");
        a.add("C");
        a.add("C++");
        a.add("C#");

        System.out.println(a);
        a.remove("C++");
        System.out.println(a);
		ArrayList<String>li=new ArrayList<>();
		li.add("Java");
		li.add("C");
		li.add("C++");
		li.add("C#");

		CopyOnWriteArraySet<String> a1=new CopyOnWriteArraySet<>(li);
		System.out.println(a1);

	}

}
