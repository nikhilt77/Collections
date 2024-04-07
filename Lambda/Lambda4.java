package com.example.lambda;

interface StringFunction {
    public String apply(String s);
}

interface IntFunction {
    public int apply(String s);
}

public class Lambda4 {

    public static void main(String[] args) {
        IntFunction lengthFunction = s -> s.length();
        StringFunction uppercaseFunction = s -> s.toUpperCase();
        StringFunction reverseFunction = s -> new StringBuilder(s).reverse().toString();

        String input = "Hello";

        System.out.println("Length of String: " + lengthFunction.apply(input));
        System.out.println("Uppercase String: " + uppercaseFunction.apply(input));
        System.out.println("Reversed String: " + reverseFunction.apply(input));
    }
}
