package Loops;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = in.nextInt();
        int rev = 0;
        for (int i = 0; i<=num; i++){
            int digit = num%10;
            rev =  (rev * 10)+digit;
            num = num / 10;
        }
        System.out.println(rev);
    }
}
