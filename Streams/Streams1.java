package com.example.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;
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
		System.out.println("filter="+li2);
		//map is used when you apply a specific condition
		List<Integer> li3=li.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println("map="+li3);
	    //count is used to count the number of elements
		long count=li.stream().count();
		System.out.println("count="+count);
		//forEach is used to print the elements
		li.stream().map(i->i*3).forEach(i->System.out.print(i+" "));
		System.out.println("forEach="+li);
		//reduce is used to perform the operation on the elements
		int res=li.stream().reduce(0,(sum,i)->sum+i);
		System.out.println("reduce()= "+res);
		List<Integer> li5=li.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted="+li5);
		List<Integer> li6=li.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(li6);
	}

}
