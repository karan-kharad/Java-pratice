package IfElse;

import java.util.Scanner;

public class DivBy5and11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = in.nextInt();
        if (num%5==0 && num%11==0){
            System.out.println("perfect number :"+num);
        }
        else {
            System.out.println("not perfect number :"+num);
        }
    }
}
