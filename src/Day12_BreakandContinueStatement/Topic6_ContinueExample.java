package Day12_BreakandContinueStatement;

import java.util.Scanner;

public class Topic6_ContinueExample {
    public static void main(String[] args) {
        //write a code where the user is being asked to enter a name restructure the name to not contain 'l' or 'L'
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name = scan.nextLine();
        String rename = " ";
        for (int i = 0; i < name.length(); i++) {

            if(name.charAt(i)=='l' || name.charAt(i)=='L'){
                continue;
            }
            rename = rename+name.charAt(i);

        }
        System.out.println("The rename is: "+rename);

    }//end main
}//end class
