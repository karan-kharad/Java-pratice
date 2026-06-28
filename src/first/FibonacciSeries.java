package first;

import java.util.Scanner;

public class FibonacciSeries {
    public static void  main(String[] args){
        Scanner in = new Scanner(System.in);
        int intal = 0;
        int intal2 =1;
        System.out.println("Enter the number :");
        int num = in.nextInt();


        for(int i=0; i<num ;i++){
           int fs= intal+intal2;
           intal = intal2;
           intal2 = fs;
        }
        System.out.println( );
    }
}
