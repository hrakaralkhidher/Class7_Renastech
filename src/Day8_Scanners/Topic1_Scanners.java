package Day8_Scanners;

import java.util.Scanner;

public class Topic1_Scanners {
    public static void main(String[] args) {
        // Next() ==> It will read a word from the console
        //Java Class
        //NextLine()==> It reads the whole line on the console.
        // Java Class

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstname = scan.next();
        System.out.println("Your firstname is: "+firstname);
        System.out.println("Please enter you age: ");
        String age = scan.next();
        System.out.println("Your age is: "+age);
        System.out.println("Please enter your zipcode: ");
        String zipcode = scan.next();
        String zipcodeAge = age+zipcode;
        System.out.println(" the age + Zipcode: "+zipcodeAge);


    }

}
