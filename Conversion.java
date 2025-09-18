/**
   Partner Lab
   Description: This program uses method and use input to covert either reals to dollars or dollars to reals.
   @author Charlie Kavich
   @since 09-18-25]
*/
import java.util.Scanner;

public class Conversion{
    private static final double DOLLAR_REAL_RATIO = 5.45;
    private static final double DOLLAR_YEN_RATIO = 147.32;
    public static double dollarToReal(double quant)
    {
        return quant * DOLLAR_REAL_RATIO;
    }
    public static double realToDollar(double quant)
    {
        return quant / DOLLAR_REAL_RATIO;
    }    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type 1 to convert USD to BRZ, Type 2 to convert BRZ to USD.");

        int userIn = in.nextInt();
        while (userIn != 1 && userIn !=2)
        {   
            System.out.println("The value entered does not correlate with the provided options, please input either 1 or 2");
            userIn = in.nextInt();
        }
        
        switch (userIn) {
            case 1:
                System.out.println("How much USD would you like to convert?");
                double usd = in.nextDouble();
                System.out.printf("%s%.2f%s%n", "That is ", dollarToReal(usd), " Reals.");
                break;
            default:
                System.out.println("How much BRZ would you like to convert?");
                double brz = in.nextDouble();
                System.out.printf("%s%.2f%s%n", "That is ", realToDollar(brz), " Dollars.");
                break;
        }
    }
}