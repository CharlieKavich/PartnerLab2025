/**
   Partner Lab
   Description: This program uses method and use input to covert either reals to dollars or dollars to reals.
   @author Charlie Kavich
   @since 09-18-25
*/
import java.util.Scanner;

public class Conversion{
    private static final double DOLLAR_REAL_RATIO = 5.45;
    private static final double DOLLAR_YEN_RATIO = 147.32;

    /**
   This method donverts USD to BRZ
   @param USD Is the inputted quantity of USD to convert
    */
    public static double dollarToReal(double quant)
    {
        return quant * DOLLAR_REAL_RATIO;
    }
    /**
   This method donverts BRZ to USD
   @param BRZ Is the inputted quantity of BRZ to convert
    */
    public static double realToDollar(double quant)
    {
        return quant / DOLLAR_REAL_RATIO;
    }    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int userIn = 1000;
            while(userIn != 3) {
            System.out.println("Type 1 to convert USD to BRZ, Type 2 to convert BRZ to USD. \n If you would like to quit type 3");

            userIn = in.nextInt();

            while ((userIn != 1 && userIn !=2 && userIn != 3))
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
                case 2:
                    System.out.println("How much BRZ would you like to convert?");
                    double brz = in.nextDouble();
                    System.out.printf("%s%.2f%s%n", "That is ", realToDollar(brz), " Dollars.");
                    break;
                default:
                    System.out.println("Goodbye!");
                    in.close();
            }
        }
    }
}