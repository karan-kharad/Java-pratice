package IfElse;

import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Character :");
        char c = in.next().charAt(0);
        if(c=='a'){
            System.out.println("This Character is Vowel"+c);
        } else if (c=='e') {
            System.out.println("This Character is Vowel"+c);
        }
        else if (c=='i') {
            System.out.println("This Character is Vowel"+c);
        }
        else if (c=='o') {
            System.out.println("This Character is Vowel"+c);
        }
        else if (c=='u') {
            System.out.println("This Character is Vowel"+c);
        }
        else {
            System.out.println("This Character is Consonant:"+c);
        }
    }
}
