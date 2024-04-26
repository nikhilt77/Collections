package com.example.Generics;

import java.util.List;

public class Rawtype {

	public static void main(String[] args) {
		Box<Integer> B=new Box<>(List.of(1,2,3));
		for(Integer a:B.getA()) {
			System.out.println(a);
		}
	}

}
