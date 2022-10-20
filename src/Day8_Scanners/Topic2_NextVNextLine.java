package Day8_Scanners;

import java.util.Scanner;

public class Topic2_NextVNextLine {

    public static void main(String[] args) {
        // Next() ==> It will read a word from the console it will stop at the space
        //Java Class
        //NextLine()==> It reads the whole line on the console. It will stop at the next line
        // Java Class (whole line "Java Class" will be scanned
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your first name and last name: ");
        String name = sc.nextLine();

        System.out.println("your first and last name is: "+name);

        System.out.println("please enter your phone number: ");
        String phone = sc.nextLine();
        System.out.println("Your name is :"+name+ " your phone number is: "+phone);
    }
}
