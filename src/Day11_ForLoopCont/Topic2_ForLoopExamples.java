package Day11_ForLoopCont;

import java.util.Scanner;

public class Topic2_ForLoopExamples {
    public static void main(String[] args) {
        //write a code where it counts all the even numbers in between 2 numbers those have been entered by users

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number: ");//asuming 1st number is smaller
        int num1 = scan.nextInt();
        System.out.println("Please enter the second number: ");
        int num2 = scan.nextInt();
        int cnt = 0;
        int cnt1=0;
        for(int j = num1; j < num2; j++){
            if(j%2==0)
            {
                cnt++;
            }else
            {
            cnt1++;
            }
        }
        System.out.println("The total count of even numbers between "+num1+" and "+num2+" is "+cnt);
        System.out.println("The total count of odd numbers between "+num1+" and "+" is :"+cnt1);
    }// end main
}//end class
