package Day7_SwitchStatements;

import java.util.Scanner;

public class Topic5_Scanners {
    public static void main(String[] args) {
        //Scanner is a class in java liberary
        // Scanner has multiple methods that can be used
        // in order to have a scanner you need to create an objects form that class
        // in order to use Scanner we need to import the class to our class.
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey user enter a number: ");
        int number = scan.nextInt();// this will wait for the user to enter int number to assign it to the variable
        System.out.println("the value of the variable number is: "+number);

        System.out.println("hey user enter a double type number");
        double dnumber = scan.nextDouble();// this will wait for the user to enter double number
        // to assign it to the variable

        System.out.println("the double number is: "+dnumber);

        System.out.println("hey user enter abyte data type number: ");
        byte bnumber = scan.nextByte();// this will wait for the user to enter int number to assign it to the variable
        System.out.println("the byte number is:"+bnumber);

        System.out.println("hey user enter float data type number: ");
        float fnumber = scan.nextFloat();// this will wait for the user to enter int number to assign it to the variable
        System.out.println("the float number is : "+fnumber);

        short snumber = scan.nextShort();
        long lnumber = scan.nextLong();

    }
}
