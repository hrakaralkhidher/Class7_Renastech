package Day17_ArrayCont;

import java.util.Scanner;

public class Topic1_ArraySumElements {
    public static void main(String[] args) {
        // write a code with following requirements
        // user should be asked about how many numbers that is going add to array
        // user should be asked for each element for the array
        // find the sum of all the elements un array

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number of elements would you like to add to Array:");
        int size = sc.nextInt();
        double[] number = new double[size];

        for (int i = 0; i < size; i++) { // or i could put i < numbers.length
            System.out.println("Please enter the "+(i+1)+". number: ");
            double num = sc.nextDouble();
            number[i] = num; // this loop will run based on the user for putting whats the size so if its 5 it will run 5 times;

        }
        double sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];

        }
        System.out.println("The sum of all the number in the arrays is: "+sum);



    }//end main
}//end class
