import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {


        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("What type of triangle are you solving for?");
        System.out.println("1. Right Triangle");
        ;
        System.out.println("2. Isoceles Triangle");
        System.out.println("1. Equalateral Triangle");

        choice = input.nextInt();

        if (choice == 1)
            rightTriangle();
        else if (choice == 2)
            isocelesTriangle();
        else if (choice == 3)
            equalteralTriangle();


    }
    public static void isocelesTriangle(){
        //triangle with two equal sides always try to find the base and area
    }
    public static void equalteralTriangle(){
        //all sides are equal find the parimeter and hieght
    }
    public static void rightTriangle(){
        Scanner input = new Scanner(System.in);
        double sideA;
        double sideB;
        double sideC;
        String sideChoice;

        System.out.println("What side of the triangle are you trying to solve for? A, B, or C");
        sideChoice = input.next();

        if (sideChoice.equals("A")) {
            System.out.println("What is side B? >>>");
            sideB = input.nextDouble();
            System.out.println("What is side C? >>>");
            sideC = input.nextDouble();
        } else if (sideChoice.equals("B")) {

        } else if (sideChoice.equals("c")) {

        } else
            triangleDoesNotExit();
    }

    public static void calculateSideA(double b, double c, String choice) {
        double a;

        a = Math.sqrt(c * c - b * b);
        System.out.println("The side " + choice + " = " + a);

    }

    public static void calculateSideB(double c, double a, String choice) {
        double b;

        b = Math.sqrt(c * c - a * a);
        System.out.println("The side " + choice + " = " + b);
    }

    public static void calculateSideC(double a, double b, String choice) {
        double c;

        a = Math.sqrt(a * a + b * b);
        System.out.println("The side " + choice + " = " + a);
    }
    public static void triangleDoesNotExit(){
        System.out.println("The side does not exist on a triangle!");
    }
}
