package com.test;

import java.util.Scanner;

public class chapter2scanner {
    public static void main(String[] args) {
        
        // Using Integers 
        int a=0;
        int b=0;

        Scanner a_input=new Scanner(System.in);
        System.out.println("Enter a(int):");;
        a=a_input.nextInt();

        Scanner b_input=new Scanner(System.in);
        System.out.println("Enter b(int):");;
        b=b_input.nextInt();

        System.out.println("Sum = "+(a+b));
        System.out.println("Subtract = "+(a-b));
        System.out.println("Multiply = "+(a*b));
        System.out.println("Divide = "+(a/b));

        // Using double 

        double x=0;
        double y=0;

        Scanner x_input=new Scanner(System.in);
        System.out.println("Enter x(double):");
        x=x_input.nextDouble();


        Scanner y_input=new Scanner(System.in);
        System.out.println("Enter y(double):");
        y=y_input.nextDouble();


        System.out.println("Sum = "+(x+y));
        System.out.println("Subtract = "+(x-y));
        System.out.println("Multiply = "+(x*y));
        System.out.println("Divide = "+(x/y));
    }
}
