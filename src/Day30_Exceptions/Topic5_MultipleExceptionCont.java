package Day30_Exceptions;

import java.util.Scanner;

public class Topic5_MultipleExceptionCont {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try{

            System.out.println("Please enter a number: ");
            int ValueA = scan.nextInt();

            System.out.println("Please enter another number: ");
            int ValueB = scan.nextInt();

            double ValueC = ValueA / ValueB;
        }catch(ArithmeticException e){
            System.out.println("You Can not divide by zero");
        }


        int[] MyArray = {1,5,9,6};
        System.out.println("Please enter an index");
        int MyIndex = scan.nextInt();


         try{
             System.out.println(MyArray[MyIndex]);
         }catch(ArrayIndexOutOfBoundsException e){
             System.out.println("We dont have a Value on index : "+MyIndex);
         }


        System.out.println("Reset of the code");
    }
}
