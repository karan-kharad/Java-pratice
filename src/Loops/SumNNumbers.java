package Loops;

import java.util.Scanner;

public class SumNNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range :");
        int num = in.nextInt();
        int total =0 ;
        if(num >= 1){
            for(int i =1 ; i <= num; i++){
                total = i+ total ;
            }
            System.out.println(" total is :"+total);
        }
        else{
            System.out.println("The number is not natural");
        }

    }
}
