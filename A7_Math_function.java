public class A7_Math_function {
    public static void main(String[] arg) {
        int p=5, q=10;
        System.out.println(Math.max(p,q));    // O/P:- Int
        System.out.println(Math.max(5,10));   // O/P:- Int
        System.out.println(Math.min(p,q));    // O/P:- Int
        System.out.println(Math.sqrt(49));    // O/P:- all below output as a double
        System.out.println(Math.sqrt(47));
        System.out.println(Math.abs(-5));     //absolute value |5| = 5
        System.out.println(Math.abs(5));
        System.out.println(Math.pow(3,2));
        System.out.println(Math.log(2));      // base e
        System.out.println(Math.log10(100));  // base 10
        System.out.println(Math.log10(2));


    //---------- Random value generate(between 0 to 1 exclude 1) -------------------------------------------------
        System.out.println("*****************************");
        System.out.println(Math.random());

    //--------- Trigonometric Function(Math function) ----------------------------------
    // value convert to radians(angle)
        double a = 90;
        double b =Math.toRadians(a);  //Radians value I/O as a double
        System.out.println(b);        //

    //----------Returns Trigonometric Value ---------------------------------------------
        int z=40;
        System.out.println(Math.sin(z));
        System.out.println(Math.cos(z));
        System.out.println(Math.tan(z));

    //----------Returns Trigonometric arc values ------------------------------------------
        System.out.println(Math.asin(z));
        System.out.println(Math.acos(z));
        System.out.println(Math.atan(z));

    //----------Returns Trigonometric Hyperbolic value ----------------------------------
        System.out.println(Math.sinh(z));
        System.out.println(Math.cosh(z));
        System.out.println(Math.tanh(z));

    ////---------ceil (Return only integer part (O/P as a double))--------------------------
        System.out.println();
        System.out.println(Math.ceil(2.45));
        System.out.println(Math.ceil(2.73));
        System.out.println(Math.ceil(2.00001));
        System.out.println(Math.ceil(2));
        System.out.println(Math.ceil(2.99));

    ////---------floor (Return next value(O/P as a double))-------------------------------
        System.out.println();
        System.out.println(Math.floor(2.45));
        System.out.println(Math.floor(2.73));
        System.out.println(Math.floor(2.00001));
        System.out.println(Math.floor(3));
        System.out.println(Math.floor(2.99));

    }
}
