package Day30_Exceptions;

import java.util.Scanner;

public class Topic7_CatchOrder {
    public static void main(String[] args) {
        // the order of the catches have to be in order for example start from the back
        //like arithmetic comes from the java runtime and java run time comes from exceptions
        //look into the file for java there is a picture
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Please enter a number: ");
            int Value = scan.nextInt();

            double MyDouble = 10 / Value;

            int[] MyArray = {1, 2, 3, 6, 5, 4};

            System.out.println("Please enter an Index : ");
            int AnIndex = scan.nextInt();
            System.out.println(MyArray[AnIndex]);

            String s = null;
            System.out.println(s.length());

        } catch (ArrayIndexOutOfBoundsException MyError) {
            System.out.println("We don't have a value at given Index");
        } catch (ArithmeticException e) {
            System.out.println("You can not divide by zero");
        } catch (NullPointerException e) {
            System.out.println("You have null value");
        } catch (Exception e) {
            System.out.println("Something Happened");
            e.printStackTrace();
        }
    }
}
