import java.util.Scanner;

public class MetricConversion {
    public static void main(String[] args){
        double centimetersInINCH = 2.54;
        int userEntryinch;
        double cen;
        double liter;
        double litersinGall = 3.7854;
        int userEntryInGall;


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of inches >>>>");
        userEntryinch = input.nextInt();
        System.out.println("Please enter the number of gallons >>>>");
        userEntryInGall = input.nextInt();

        cen = userEntryinch * centimetersInINCH;
        liter = userEntryInGall * litersinGall;

        System.out.println("You have " + liter + " liters and " + cen + " centimeters.");
    }
}
