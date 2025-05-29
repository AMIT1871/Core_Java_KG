import java.util.Scanner;          // if show gray that mean this is not used
public class A3_User_Input {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your long name ");     //Print until you do not enter
        String longName = scan.nextLine();
        System.out.println(longName);

        System.out.println("Enter your short name ");   //Print until space is found
        String shortName = scan.next();
        System.out.println(shortName);

        System.out.println("Enter your marks");         // Print integer
        int marks = scan.nextInt();
        System.out.println(marks);


    }
}
