import java.io.*;
import java.net.*;
import java.util.Scanner;

public class A18_Server {
    public static  void main(String[] args) throws IOException{
           int n, temp;
           ServerSocket obj = new ServerSocket(1211);
           Socket s = obj.accept();
           Scanner sc = new Scanner(s.getInputStream());
           n = sc.nextInt();

           temp = n * 2;
           PrintStream p = new PrintStream(s.getOutputStream());
           p.println(temp);


    }
}
