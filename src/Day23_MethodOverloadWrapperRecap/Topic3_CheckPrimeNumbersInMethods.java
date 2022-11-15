package Day23_MethodOverloadWrapperRecap;

import java.util.Scanner;

public class Topic3_CheckPrimeNumbersInMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the lowest number");
        int low = scan.nextInt();

        System.out.println("Please enter the highest number");
        int high = scan.nextInt();

        for (int i = low; i <= high; i++) {
            if(CheckPrimeNumber(i) == true){
                System.out.print(i + " ");
            }

        }


    }//end main
    public static boolean CheckPrimeNumber(int pram1){
        boolean IsItPrimeNumber = true;
        for (int i = 2; i < pram1; i++) {
            if (pram1 % i == 0){
                IsItPrimeNumber = false;
                break;
            }
        }
        return IsItPrimeNumber;
    }
}
