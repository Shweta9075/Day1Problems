package com.bridgelabz;

public class StaticDemo {
    static int a = 10;
    static int b;
    static void display(int c){
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
    }
    static {
        System.out.println("Static Block");
        b = a +5;
    }

    public static void main(String[] args) {
        display(20);

    }
}
