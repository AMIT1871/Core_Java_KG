import java.util.Scanner;
public class A8_If_else {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        if(age>=18)
            System.out.println("You are eligible for voting");
        else
            System.out.println("You are not eligible for voting");

//------------------------- Nested if ----------------------------------------
//          if(age<0)
//              System.out.println("Invalid Input");
//        else if(age>=18)
//            System.out.println("You are eligible for voting");
//        else
//            System.out.println("You are not eligible for voting");

//-----------------------------------------------------------------------------
//        if(true)
//            System.out.println("Jetha loves Babita");
//        if(false)
//            System.out.println("Kuch bhi likho");

//------------------else if ladder -------------------------------------------
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your marks");
//        int marks = scan.nextInt();
//
//        if(marks>60)
//            System.out.println("First division");
//        else if(marks>45)
//            System.out.println("Second division");
//        else if(marks>35)
//            System.out.println("Third division");
//        else
//            System.out.println("Failed");

    }
}
