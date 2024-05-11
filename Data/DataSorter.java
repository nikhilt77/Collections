package com.example.mypackage;

import java.util.List;

public class DataSorter<T> {
	private List<T> list;
	public DataSorter(List<T> list) {
		this.list=list;
	}
	public void getSorted() {
		list.sort(null);
		for(T t:list) {
			System.out.println(t);
		}
	}
}
