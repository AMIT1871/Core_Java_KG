public class A10_Array {
    public static void main(String[] arg) {
        int runs[] = {15,5, 64, 98,44};
        //int []runs = {15,5, 64, 98,44};     //both are true
        System.out.println(runs[0]);
        System.out.println(runs[3]);
        System.out.println(runs.length);
        runs[3] = 99;
        System.out.println(runs[3]);

        //for(int i=0; i<5; i++)
            System.out.println("\n*************");
        for(int i=0; i<runs.length;i++){
            System.out.println(runs[i]);
        }

//------------------Tow Dimension -----------------------------------------------------------
        int [][]matrix1 = { {12, 34},
                            {85, 95} };
             System.out.println("---Tow Dimension arr ---\n"+matrix1[1][1]);

        int matrix[][] = { {12, 34, 56},
                           {85, 95, 23},
                           {90, 87, 57} };
             System.out.println("---Tow Dimension arr ---\n"+matrix[2][2]);

        int matrix2[][] = { {12, 34, 56, 97, 87},
                           {85, 95, 23, 65, 32},
                           {90, 87, 57, 23, 12} };
        System.out.println("---Tow Dimension arr ---\n"+matrix2[2][2]);


//------------------Array of String ----------------------------------------------------------
        String family[] = {"Jethalal", "Champaklala","Tappu", "Dayaben"};
        for(int i=0; i<family.length; i++)
            System.out.println(family[i]);


    }
}
