package SwitchCase;

import java.util.Scanner;

public class Calulator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Opreation :");
        char ch = in.next().charAt(0);
        System.out.println("Enter the Number :");
        int num = in.nextInt();
        System.out.println("Enter the Number2 :");
        int num2 = in.nextInt();
        double result;
        switch (ch){
            case '+':
                result = num+num2;
                break;

            case '-':
                result = num-num2;
                break;

            case '*':
                 result = num*num2;
                break;
            case '/':
                result = num/num2;
                break;
            case '%':
                result = num%num2;
                break;

            default:
                result = 0;
        }
        System.out.println("The Answer is :"+ result);
    }
}
