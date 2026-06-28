package first;

import java.util.Scanner;

public class RpeesToUSD {
    public static void main(String[] agrs){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the RS:");
        float rs = in.nextFloat();
        double usd = 94.41 ;

        double convert = rs / usd;
         System.out.println("USD:"+convert);

    }
}
