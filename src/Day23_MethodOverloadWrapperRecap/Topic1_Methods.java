package Day23_MethodOverloadWrapperRecap;

public class Topic1_Methods {
    public static void main(String[] args) {
        /*
        Define two numbers and print sum of two numbers

        define a string variable and print lowwercase of it

        define two numbers and pring numbers from 1 to sum of them

        define String and print lowecase of it
         */

        int a = 5;
        int b = 6;

        //int sum = a+b;
        int sum = Add(a,b);
        System.out.println(sum);

//        String s1 = "RenasTech";
//        System.out.println(s1.toUpperCase());
        PrintLowerCase("RenasTECH");


        int c = 7;
        int d = 3;

        //int sum2 = c + d;
        int sum2=Add(c,d);
        for (int i = 1; i <= sum2 ; i++) {
            System.out.println(i);
        }

//        String s2 = "WhatEVer";
//        System.out.println(s2.toLowerCase());
        PrintLowerCase("WhatEVer");


    }//end of main
// can you do static public instead of public static? important for interview, yes we can because the java compiler understand the code
    //static public int Add ==> same we can do it this way because java complier understand the code

    public static int Add(int param1, int param2){
        return param1 * param2;
    }
    public static void PrintLowerCase(String param1){
        System.out.println(param1.toUpperCase());
    }

}
