package SwitchCase;

import java.util.Scanner;

public class WeekDay {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number from 1 to 7 :");
        int num = in.nextInt();

        switch (num){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;

            case 3 :
                System.out.println("Tuesday");
                break;

            case 4 :
                System.out.println("Wednesday");
                break;

            case 5 :
                System.out.println("Friday");
                break;

            case 6 :
                System.out.println("Saturday");
                break;

            case 7 :
                System.out.println("Sunday");
                break;

            default:
                System.out.println("you enter the  wrong number ");
                break;
        }
    }
}
