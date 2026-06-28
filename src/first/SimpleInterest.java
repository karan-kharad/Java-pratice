package first;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the principal amount and rate , time :");
        float principal = in.nextFloat();
        float time = in.nextFloat();
        float rate = in.nextFloat();
        float si = principal * time * rate / 100;



        System.out.println("Simple interest is "+si);
    }

}
