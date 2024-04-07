package com.example.lambda;
interface Function{
	public int Calc(String s);
}
public class Lambda4 {

	public static void main(String[] args) {
		Function f=(s)->s.length();
		System.out.println("Length of String:"+(f.Calc("Hello")));
	}
}
