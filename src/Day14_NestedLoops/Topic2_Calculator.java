package Day14_NestedLoops;

import java.util.Scanner;

public class Topic2_Calculator {
    public static void main(String[] args) {
        /*
        write a calculator program where it will do following:
        1) user will be asked to mae a decision 1 for sum, 2 for sub, 3  for div, 4 for mult, any other numbers to exit.
        2) after user make the decision user should be asked to enter the first number;
        3) after that user should be asked to enter second number.
        4) perform the calculation and print the result.
        5) Perform the calculation for different enteries
         */
        System.out.println("*****Welcome Calculator*****");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please make the selection: 1 for Sum, 2 for Sub, 3 for Div, 4 for Multi, any other EXIT ");
        int selection = scan.nextInt();
        while(selection ==1 || selection == 2 || selection == 3 || selection == 4){

            System.out.println("Please enter the first number: ");
            double num1 = scan.nextDouble();
            System.out.println("Please enter the second number: ");
            double num2 = scan.nextDouble();
            double result = 0;
            if(selection == 1){
                result = num1+num2;
            } else if (selection == 2) {
                result = num1-num2;
            } else if (selection == 3) {
                result = num1/num1;
            }else{
                result = num1*num2;
            }
            System.out.println("The result of the operation is: "+result);
            System.out.println("Please make the selection: 1 for Sum, 2 for Sub, 3 for Div, 4 for Multi, any other numbers ");
            selection = scan.nextInt();
        }
        System.out.println(" THank You For Using Calculator You Are Exited Now ");

    }
}
