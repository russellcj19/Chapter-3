import java.util.Scanner;

public class Percentages {
    public static void main(String[] args){
        double a;
        double b;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a decimal >>>>");
        a = input.nextDouble();
        System.out.println("Please enter another decimal >>>>");
        b = input.nextDouble();

        computePercentage(a, b);
    }
    public static void computePercentage(double a, double b){
        double percent = (a/b) * 100;
        System.out.println(a + " is " + percent + " Percent of " + b);

    }
}
