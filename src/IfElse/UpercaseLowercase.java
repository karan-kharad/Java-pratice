package IfElse;

import java.util.Scanner;

public class UpercaseLowercase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Character :");
        char c = in.next().charAt(0);

        if (c>='A'&& c<='Z'){
            System.out.println("The character is uppercase :"+c);
        } else if (c>='a'&& c<='z') {
            System.out.println("The character is lowercase :"+c);
        }
    }
}
