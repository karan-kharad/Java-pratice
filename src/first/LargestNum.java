package first;

import java.util.Scanner;

public class LargestNum {

    public static void main(String[] agrs){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number1 :");
        int num1 = in.nextInt();
        System.out.println("Enter the number2 :");
        int num2 = in.nextInt();
        if(num1>num2){
            System.out.println("greater number is this :" + num1);
        }
        else {
            System.out.println("greater number is this :" + num2);
        }
    }
}
