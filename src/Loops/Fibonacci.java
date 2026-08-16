package Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f0 =0;
        int f1=1;
        System.out.println("Enter the number :");
        int num = in.nextInt();
        for(int i=0; i<=num; i++){
            System.out.println(f0+"");
            int fn = f0+f1;
            f0 = f1;
            f1 = fn;


        }


    }
}
