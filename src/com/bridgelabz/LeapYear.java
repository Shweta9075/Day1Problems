package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int year = sc.nextInt();
        if(year >= 1582) {

            if (year == 400 && year == 100 || year == 4 && year != 100) {
                System.out.println(year + " is leap year");
            } else {
                System.out.println(year + " is not leap year");
            }
            }else{
            System.out.println("The year is no more then 1582");
        }
    }
}
