package SwitchCase;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the unite");
        double unite = in.nextDouble();
        double bill = 0.0;
        System.out.println("Enter the your meter type : \n 1.Residential \n 2.Commercial \n 3.Industrial \n 4.Agricultural ");
        int choice = in.nextInt();

        switch (choice){
            case 1:
               bill = unite * 4.43;
               break;
            case 2:
                bill = unite * 10;
                break;

            case 3:
                bill = unite * 13.7;
                break;

            case 4:
                bill = unite * 8.56;
                break;

            default:
                System.out.println("YOU choice is wrong");

        }
        System.out.println("YOU Bill is :"+bill);
    }
}
