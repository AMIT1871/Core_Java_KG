//************************************* STRING *********************************************
// String is a class in java

public class A6_String {
    public static void main(String[] arg) {
        String name = "amit";
        String attribute = "Handsome Boy";
        System.out.println(name);
        System.out.println(attribute);
        System.out.println(name + attribute);
        System.out.println(name + " is a " + attribute);

//     1) -------int lenght() ------------------------------------------------------
        System.out.println(name.length());


//     2) -------char charAt(int index) --------------------------------------------
        System.out.println(name.charAt(3));
        //System.out.println(name.charAt(4)); //(error because null not count )


//     3)---------concat(String string1) -------------------------------------------
        String name1 = "Anuj";
        String name2 = "Kumar";
        name1 = name1 + name2;
        //name1 += name2;
        //name1 = name1.concat(name2);
        System.out.println(name1);
        //System.out.println(name1.concat(name2));
        //System.out.println(name1 + " " + name2);

//     4)--------String substring(int beginIndex) ---------------------------------
        String statement  = "Welcome to Java Tutorials by Yash Sir";
        String statement1 = statement.substring(11);
        System.out.println("The Substring is: " + statement1);
        String statement2 = statement.substring(11,15);  // begin to 15-1
        System.out.println("The New Substring is:" + statement2);
        System.out.println(statement.substring(13));


//      5)------- Compare String ---------------------------------------------------
         String string1 = "Hellow Amit";
         String string2 = "Hellow Amit";
         String string3 = "how are you";
         String string4 = "Your name ";
         System.out.println(string1.compareTo(string2));   //No difference so output 0
         //System.out.println(string1.compareTo("Hellow Amit"));
        System.out.println(string3.compareTo(string4));  // s1>s2 = positive ans (acording to assici)
        System.out.println(string4.compareTo(string3));  // s1<s2 = negative ans


//      6)--------- Upper Case -----------------------------------------------------
        String temp1 = "Amit";
        System.out.println(temp1.toUpperCase());

//      7)--------- Lower Case -----------------------------------------------------
        String temp2 = "Amit";
        System.out.println(temp2.toLowerCase());

//      8)--------- Trim function --------------------------------------------------
        String temp3 = "  Amit Kumar   ";
        System.out.println(temp3);
        System.out.println(temp3.trim());    //remove blank from space begin and end both




    }
}
