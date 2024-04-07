package com.example.lambda;
import java.util.*;
public class Lambda2 {

	public static void main(String[] args) {
		Functional i=()->System.out.println("Function without argument and return type using lambda");
		i.fun();	
	}
}
interface Functional{
	public void fun();
}

//Below is how the code is done without Lambda
/*class implementer implements Functional{
	public void fun() {
		System.out.println("Function without argument and return type");
	}
}*/
