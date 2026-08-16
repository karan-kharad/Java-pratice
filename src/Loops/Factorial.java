package Loops;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fact = 1;
        int result = 1;
        System.out.println("Enter  the number :");
        int num = in.nextInt();

        for(int i =num; i>=1;i--){
            fact*= i;
        }
        System.out.println("the Factorial is :" +fact);
    }
}
