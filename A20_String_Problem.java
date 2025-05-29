import java.util.*;

public class A20_String_Problem {
    public static void main(String[] agrs){
        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count1=0, count2=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='*')
                count1++;
            else if(str.charAt(i)=='#')
                count2++;
        }
        System.out.println(count1-count2);
    }
}
