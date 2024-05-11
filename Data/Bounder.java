package com.example.mypackage;

import java.util.Arrays;
import java.util.List;

public class Bounder {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(new Integer[] {7,1 ,3,0,-1,8,9});
		List<String> slist=Arrays.asList(new String[] {"Hello","My","Name","is","Nikhil"});
		DataSorter<Integer> s1=new DataSorter<>(list);
		DataSorter<String> s2=new DataSorter<>(slist);
		s1.getSorted();
		s2.getSorted();
	}

}
