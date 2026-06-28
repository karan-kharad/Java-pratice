package IfElse;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your marks :");
        int marks = in.nextInt();
        if (marks>=80){
            System.out.println("your grade is O");
        } else if (marks>=70) {
            System.out.println("your grade is A");
        }
        else if (marks>=60) {
            System.out.println("your grade is b");
        }
        else if (marks>=45) {
            System.out.println("your grade is b");
        }
        else {
            System.out.println("your grade is f");
        }

    }
}
