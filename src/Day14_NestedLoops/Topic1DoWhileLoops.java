package Day14_NestedLoops;

import java.util.Scanner;

public class Topic1DoWhileLoops {
    public static void main(String[] args) {

        //do {
        // code block
        // }while(condition)

        //Print all the numbers from 1 to 10
        int i = 1; //
        do{
            System.out.println("The number is "+i);// this bloc gets executed even if the condition
                                                    // in the while condition is false.
            i++;
        }while(i<10);

        System.out.println("******************************************");

        //write a code where the users is being asked to enter a one letter String but even if the String has more than
        //one char print only the first char
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 char String: ");
        String st = scan.next();
        int j = 0;
        do{
            System.out.println("the first char of the String is: "+st.charAt(j));
            j++;
        }while(j<2);










    }//end main
}//end class
