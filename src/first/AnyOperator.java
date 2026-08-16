package first;

import java.util.Scanner;

public class AnyOperator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num1 = in.nextInt();
        System.out.println("Enter the Number2 :");
        int num2 = in.nextInt();
        System.out.println("Enter the Operator :");
        char op = in.next().charAt(0);
        if(op == '+'){
                int result = num1 + num2;
                System.out.println(result);
        }
        if(op == '-'){
            int result = num1 - num2;
            System.out.println(result);
        }
        if(op == '*'){
            int result = num1 * num2;
            System.out.println(result);
        }
        if(op == '/'){
            int result = num1 / num2;
            System.out.println(result);
        }
        if(op == '%'){
            int result = num1 % num2;
            System.out.println(result);
        }
    }
}
