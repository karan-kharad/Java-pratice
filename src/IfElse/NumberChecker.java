package IfElse;

import java.util.Scanner;

public class NumberChecker {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = in.nextInt();

        if (num < 0){
            System.out.println("the number is Negative"+num);
        } else if (num>0) {
            System.out.println("the number is Positive"+num);
        } else if (num == 0) {
            System.out.println("the number is Zero"+num);
        }
    }
}
