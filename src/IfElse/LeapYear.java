package IfElse;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the year :");
        int year = in.nextInt();
        if (year % 4 ==0){
            if(year%100==0){
                 if(year%400==0){
                     System.out.println("this the leap year :"+year);
                 }else {
                    System.out.println("this year is not leap year:"+year);
                }

            }else {
                System.out.println("this year is not leap year:"+year);
            }
        }else {
            System.out.println("this year is not leap year:"+year);
        }
    }
}
