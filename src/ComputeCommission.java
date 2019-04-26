import java.util.Scanner;

public class ComputeCommission {


    public static void main(String[] args){
        String vType;
        int value;
        double commRate;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the value of the vehicle >>>>");
        value = input.nextInt();
        System.out.println("Please enter the vehicle type >>>");
        vType = input.next();
        System.out.println("Please enter commission rate in decimals >>>>");
        commRate = input.nextDouble();


        computeCommision(value, commRate, vType);


    }
    public static void computeCommision(int value, double rate, String vehicle) {
        double commission;
        commission = value * rate;
        System.out.println("\nThe " + vehicle + " type vehicle is worth $" + value);

        System.out.println("With " + (rate * 100) + "% commission rate, the commision is $" + commission);
    }
}
