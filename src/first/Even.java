package first;

import java.util.Scanner;

public class Even {

    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num  = input.nextInt();
        if(num%2==0) {
            System.out.println("number is Even");
        }
        else {
            System.out.println("Odd number");
        }


    }
}
