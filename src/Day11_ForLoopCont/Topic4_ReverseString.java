package Day11_ForLoopCont;

import java.util.Scanner;

public class Topic4_ReverseString {
    public static void main(String[] args) {
        //write a code where user is bing asked to enter a string, reverse that string and print it
        // Ugur ==> rugU // Sena ==> aneS//

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter something on the console that you want to reverse");
        String input = scan.nextLine();
        //Ziya==> ayiZ
        String name = "Ziya";
        char ch = input.charAt(0);
        System.out.println("the first character: "+ch);
        char ch1 = input.charAt(1);
        System.out.println("the second character: "+ch1);
        System.out.println("The length of String is: "+input.length());
        System.out.println("the last character: "+input.charAt(input.length()-1));

        String reverse = " ";

        for (int i = input.length()-1; i >=0 ; i--) {
            reverse = reverse+input.charAt(i);// reverse = ""+l ==> l
                                                //reverse = l+e = le
                                                //reverse = le+y = ley
        }
        System.out.println("the Reverse of the input is: "+reverse);
    }
}
