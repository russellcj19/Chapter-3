import java.util.Scanner;

public class FahrenheittoCelsius {
    public static void main(String[] args){
        int userEntrytempOne;
        int userEntrytempTwo;
        int userEntrytempThree;

        double degCelsuisOne;
        double degCelsuisTwo;
        double degCelsuisThree;

        System.out.println("Welcome to the Farenhiet to Celsius converter");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the tempture at 8:00 am (in degrees Farenhiet) >>>>");
        userEntrytempOne = input.nextInt();
        System.out.println("Please enter the tempture at 12:00 pm (in degrees Farenhiet) >>>>");
        userEntrytempTwo = input.nextInt();
        System.out.println("Please enter the tempture at 5:00 pm (in degrees Farenhiet) >>>>");
        userEntrytempThree = input.nextInt();

        degCelsuisOne = (userEntrytempOne - 32) * .5556;
        degCelsuisTwo = (userEntrytempTwo - 32) * .5556;
        degCelsuisThree = (userEntrytempThree - 32) * .5556;


        System.out.println(" At 8:00 am it was " + userEntrytempOne + " degrees Farenhiet and "
                + degCelsuisOne + " degrees Celsuis");
        if (userEntrytempOne <= 32)
            System.out.println(" (It's cold, Grab a coat)");
        if (userEntrytempOne >= 100)
            System.out.println(" (It's hot, you might wanna stay inside)");
        System.out.println(" At 12:00 pm it was " + userEntrytempTwo + " degrees Farenhiet and "
                + degCelsuisTwo + " degrees Celsuis" );
        if (userEntrytempTwo <= 32)
            System.out.println(" (It's cold, Grab a coat)");
        if (userEntrytempTwo >= 100)
            System.out.println(" (It's hot, you might wanna stay inside)");
        System.out.println(" At 5:00 pm it was " + userEntrytempThree + " degrees Farenhiet and "
                + degCelsuisThree + " degrees Celsuis" );
        if (userEntrytempThree <= 32)
            System.out.println(" (It's cold, Grab a coat)");
        if (userEntrytempThree >= 100)
            System.out.println(" (It's hot, you might wanna stay inside)");



    }

}