import java.net.InetAddress;
public class A16_Inet_Address {
    public static void main(String[] args){

        try{
            InetAddress ip =InetAddress.getByName("www.knowledgegate.in");
            System.out.println(ip.getHostName());
            System.out.println(ip.getHostAddress());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}
