import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class A17_client {
    public static void main(String[] args) throws Exception{
        int n, temp;
        Scanner sc = new Scanner(System.in);
        Socket s = new Socket("192.168.137.1",1211);
        Scanner sc1 = new Scanner(s.getInputStream());
        System.out.println("Enter the number....");
        n = sc.nextInt();
        PrintStream p = new PrintStream(s.getOutputStream());
        p.println(n);
        temp = sc1.nextInt();
        System.out.println(temp);

    }
}
