package Day22_MethodOverLoadAndWrapperClass;

import java.util.ArrayList;

import static Day22_MethodOverLoadAndWrapperClass.Topic1_RecapMethodOverLoad.line;

public class Topic2_WrapperClasses {
    public static void main(String[] args) {
        //Primitive Data Types,
        //byte
        //int
        //short
        //long
        //float
        //double
        //boolean
        //char
        //Non Primitive object and object are getting created by classes
        //Primitive classes     //Wrapper
        //byte                  //Byte
        //int                   //Integer
        //short                 //Short
        //long                  //Long
        //float                 //Float
        //double                //Double
        //boolean               //Boolean
        //char                  //Character

        int number = 5; //Primitive data type
        System.out.println(number);
        Integer numbers = 5;// Non primitive data type
        System.out.println(numbers);
        numbers.toString();

        //Example
//        ArrayList<int> myNumber = new ArrayList<int>(); //invalid
//        ArrayList<Integer> myNumber = new ArrayList<Integer>();//valid

        String name = "";

        Character myChar = 'A'; // wrapper

        Byte b1 = 11;//wrapper
        byte b2 = 12;//Primitive
        Byte b3 = b2;// Wrapper

        line();

        //toString
        Integer myInt = 5;
        System.out.println(myInt);
        String myString = myInt.toString();
        System.out.println(myString.length());

    }
}
