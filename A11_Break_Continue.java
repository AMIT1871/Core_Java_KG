public class A11_Break_Continue{
    public static void main(String[] arg) {

//------------ Break statement ------------------------------------------------
        for(int i=0; i<=5; i++){
            if(i>3)
                break;
            else
                System.out.println(i);
        }

//----------- Break in nested loop ------------------------------------------
        for(int i=0; i<=5; i++){
            for(int j=0; j<=5; j++){
                if(j>3)
                    break;                          //exit only inner loop
                else
                    System.out.println(j);
            }
        }


    }
}

//************************************ Continue **********************************
//public class A11_Break_Continue{
//    public static void main(String[] arg) {
//        for(int i=0; i<=5; i++){
//            if(i==3)
//                continue;                     //skip only current iteration
//            else
//                System.out.println(i);
//        }
//
////-------------------- Continue in nested loop ------------------------------------
//        for(int i=0; i<=5; i++){
//            for(int j=0; j<=5; j++){
//                if(j>3)
//                    continue;                          //skip only current(inner) iteration
//                else
//                    System.out.println(j);
//            }
//        }
//
//        for(;;)
//            System.out.print("1");


//
//      } //for end
//    }// for end
