package Day30_Exceptions;

import java.util.Scanner;

public class Topic2_ExceptionsCont {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int ValueA = scan.nextInt();

        System.out.println("Please enter another number: ");
        int ValueB= scan.nextInt();
        try{
            double ValueC= ValueA / ValueB;
        }catch(Exception MyParamName){
            System.out.println("Can't devided by Zero");
        }
        System.out.println("Reset of the Code");
    }
}
