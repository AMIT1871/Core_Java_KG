import java.util.Scanner;
public class A9_Swithch_case {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year");
        int year = scan.nextInt();
//        switch(year){
//
//            case 1975:
//                System.out.println("West Indies");     //break use for stop program if any condition are true
//                break;                                 //so exit from switch and other cases not check.
//            case 1979:
//                System.out.println("West Indies");
//                break;
//            case 1983:
//                System.out.println("India");
//                break;
//            case 1987:
//                System.out.println("Australia");
//                break;
//            case 1992:
//                System.out.println("Pakistan");
//                break;
//            case 1996:
//                System.out.println("Sri Lanka");
//                break;
//            case 1999:
//                System.out.println("Australia");
//                break;
//            case 2003:
//                System.out.println("Australia");
//                break;
//            case 2007:
//                System.out.println("Australia");
//                break;
//            case 2011:
//                System.out.println("India");
//                break;
//            case 2015:
//                System.out.println("Australia");
//                break;
//            case 2019:
//                System.out.println("England");
//                break;
//            default:
//                System.out.println("There was no world cup happened in the year you enter");
//        }


// -------------------------- Merge Cases for better convenience -------------------------------------
        switch(year){

            case 1975:
            case 1979:
                System.out.println("West Indies");
                break;
            case 1983:
            case 2011:
                System.out.println("India");
                break;
            case 1987:
            case 1999:
            case 2003:
            case 2015:
            case 2007:
                System.out.println("Australia");
                break;
            case 1992:
                System.out.println("Pakistan");
                break;
            case 1996:
                System.out.println("Sri Lanka");
                break;
            case 2019:
                System.out.println("England");
                break;
            default:
                System.out.println("There was no world cup happened in the year you enter");
        }

    }
}


/*//------------------------------------------------------------------------------------------------------------
The expression provided in the switch should result in a constant value otherwise
it would not be valid. An expression must always execute to a result.
Note:- In JAVA even string are allowed in switch and case.

                        VALID EXPRESSION FOR SWITCH

Constant expression allowed
switch(1+2+23)
switch(a+b+c)       but a,b,c value are predefine not take from user 

1)  In JAVA  cases are valid :- int, char, string
    In C/C++ cases are valid :- int, char

2) The default statement is optional. Even if the switch cse statement do not have a default statement,
   it would run without any problem. only one default statement is allowed.

3) Nested switch are allowed, which means you can have switch statements inside another switch However
nested switch statement should be avoided as it makes program more complex and less readable.

4) Time  Complexity: O(1)
   Space Complexity: O(1)


 */