package com.bridgelabz;

import java.util.Scanner;

public class StringEquality {
    public static void main(String[] args) {
        String str1, str2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st string : ");
        str1= sc.next();
        System.out.println("Enter 2nd string : ");
        str2= sc.next();
        if(str1.equals(str2)){
            System.out.println("Both strings are equal.");
        }else{
            System.out.println("Both strings are not equal.");
        }
    }
}
