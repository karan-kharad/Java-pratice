package SwitchCase;

import java.util.Scanner;

public class AtmMenu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float balance = 1000.0f;
        int pin = 1306;
        System.out.println("Enter the pin :");
        int entered_pin = in.nextInt();
        System.out.println("Enter you choice \n 1.Check Balance \n 2.Deposit Money \n 3.Withdraw Money \n 4.Exit");
        int choice = in.nextInt();

        if (entered_pin == pin){
            switch (choice){
                case 1 :
                    System.out.println("Your Balance is :"+balance);
                    break;
                case 2 :
                    System.out.println("Add the Cash ");
                    break;

                case 3 :
                    System.out.println("Enter the amount :");
                    float win = in.nextFloat();
                    float rem = win - balance;
                    System.out.println("Your Remming  Balance is :"+rem);
                    break;

                case 4 :
                    System.out.println("Thank You ");
                    break;

                default:
                    System.out.println("YOU Enter the Wrong Option");
                    break;
            }
        }
    }
}
