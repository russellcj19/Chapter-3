import java.util.Scanner;

public class BookstoreCredit
{
    public static void main(String[] args){
        double gradePointAvg;
        double bookStoreCred;
        String studentName;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Student Name >>>>");
        studentName = input.nextLine();
        System.out.println("Please enter GPA >>>>");
        gradePointAvg = input.nextDouble();

        bookStoreCred = gradePointAvg * 10;

        System.out.println(studentName + " gets $" + bookStoreCred +
                " in the school book store becauce of their " + gradePointAvg + " GPA.");
    }
}
