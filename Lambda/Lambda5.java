package com.example.lambda;

interface Functioner{
    public int calc(int x);
}

interface FunctionerDouble{
    public double calc(int x);
}

public class Lambda5 {

    public static void main(String[] args) {
        Functioner f = x -> {
            int a = x * 10;
            a = a / 2;
            return a;
        };

        Functioner square = x -> x * x;
        Functioner cube = x -> x * x * x;
        FunctionerDouble sqrt = x -> {
            if(x >= 0) {
                return Math.sqrt(x);
            } else {
                System.out.println("Cannot calculate square root of negative number");
                return -1;
            }
        };

        Functioner factorial = x -> {
            int result = 1;
            for(int i = 2; i <= x; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println("Original calculation: " + f.calc(50));
        System.out.println("Square: " + square.calc(50));
        System.out.println("Cube: " + cube.calc(50));
        System.out.println("Square root: " + sqrt.calc(50));
        System.out.println("Factorial: " + factorial.calc(10)); 
    }
}
