package com.example.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams1 {

	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		ArrayList li1=new ArrayList();
		for(Integer i:li) {
			if(i>=30) {
				li1.add(i);
			}
		}
		System.out.println(li1);
		List<Integer> li2=li.stream().filter(i->i>=30).collect(Collectors.toList());
		System.out.println(li2);
		List<Integer> li3=li.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(li3);
	}
	
}
