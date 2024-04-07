package com.example.lambda;
import java.util.*;
public class Lambdademo {

	public static void main(String[] args) {
		MyFunctionalInterface fr=() -> System.out.println("Hello World");
		fr.funmethod();		
	}

}
interface MyFunctionalInterface{
	public void funmethod();
}
