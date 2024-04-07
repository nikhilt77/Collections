package com.example.lambda;
import java.util.*;

interface Functionalinterface{
    public void fun(int a,int b);
}

public class Lambda3 {
    public static void main(String args[]) {
        Functionalinterface f=(a,b)->System.out.println("Area:"+(a*b));
        Functionalinterface f1=(a,b)->System.out.println("Perimeter:"+(2*(a+b)));
        Functionalinterface f2=(a,b)->System.out.println("Sum:"+(a+b));
        Functionalinterface f3=(a,b)->System.out.println("Difference:"+(a-b));
        Functionalinterface f4=(a,b)->System.out.println("Product:"+(a*b));
        Functionalinterface f5=(a,b)->{
            if(b != 0) {
                System.out.println("Quotient:"+(a/b));
            } else {
                System.out.println("Cannot divide by zero");
            }
        };

        f1.fun(2,3);
        f.fun(2,3);
        f2.fun(2,3);
        f3.fun(2,3);
        f4.fun(2,3);
        f5.fun(2,3);
    }
}
