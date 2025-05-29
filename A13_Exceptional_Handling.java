public class A13_Exceptional_Handling {
    public static void main(String[] arg) {

//        String family[] = {"Jethalal", "Tsppu", "Champaklal", "Dayaben"};
//            System.out.println(family[10]);      //error index out of bounded


        String family[] = {"Jethalal", "Tsppu", "Champaklal", "Dayaben"};
        try{
            System.out.println(family[10]);     //inside of try something buggy
        }
        catch(Exception e){
            System.out.println(e);       //Print error
        }
        System.out.println("Are Bhai, Meri kya Galti hai");

    }
}
