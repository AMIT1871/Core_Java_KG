import java.util.Scanner;
public class A14_MP1_Calculater {
    public static void main(String[] arg) {
        float num1, num2;
        int num3;

        System.out.println("Enter first num");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextFloat();

        System.out.println("Enter second number");
        num2 = scan.nextFloat();

        System.out.println("Entered numbers are " + num1 + " " + num2);
        while (true) {
            System.out.println("\n*****************************************************************");
            System.out.println(" 1)Addition\n 2)Subtraction\n 3)Multiplication\n 4)Division\n 5)Exit ");
            System.out.println("  What you want to do choose any one");
            num3 = scan.nextInt();
            switch (num3) {

                case 1:
                    System.out.println("Addition :" + num1 + num2);
                    break;
                case 2:
                    System.out.println("Subtraction :" + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Multiplication :" + num1 * num2);
                    break;
                case 4:
                    System.out.println("Division :" + num1 / num2);
                    break;
                case 5:
                    System.exit(0);


            }//switch
        }//while

    }//main

}//main
