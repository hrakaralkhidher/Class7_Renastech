package Day11_ForLoopCont;

import java.util.Scanner;

public class Topic1_ForLoops {
    public static void main(String[] args) {
        /*
        recap for loop formula : (int i = starting; condition(endpoint); iteration(increase or decrease)){
        code block
        }
         */

        //write a code where users enters 2 different numbers and counts the numbers that
        //can be divided by 3 those are between those numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first integer number: ");
        int num1 = sc.nextInt();
        System.out.println("Please enter the second integer number: ");
        int num2 = sc.nextInt();
        int count = 0; //this will set the count from 0 for the loop below we cant put this inside the loop needs to be here
        for (int i = num1; i<=num2;i++)//i++ = i=i+1;
        {
            //int count = 0; this will set the count to be zero everytime code get executed
            if(i%3==0)
            {
                count++; // count = count +1;
            }
        }
        System.out.println("The count of all the numbers that can be divided by 3 is: "+count);


    }//end main

}// end class
