package IfElse;

import java.util.Scanner;

public class EligibleVoter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the age :");
        int age = in.nextInt();

        if (age>=18){
            System.out.println("your Eligible for vote");
        }
        else {
            System.out.println("your Not Eligible for vote");
        }
    }
}
