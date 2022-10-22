package Day12_BreakandContinueStatement;

import java.util.Scanner;

public class Topic4_BreakSExamples {
    public static void main(String[] args) {

        //user is being asked to enter a name and restructure the name but as soon as it sees the "l" you should
        //stop restructure
        //Kyle ==> ky
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name = sc.nextLine();

        String rename = " ";
        for (int i = 0; i < name.length(); i++) {
            //rename=rename+name.charAt(i); this will add l then break.
            if(name.charAt(i)=='l'|| name.charAt(i)=='L'){
                break;
            }
            rename=rename+name.charAt(i); // this will break right where it gets to 'l' #break;
        }
        System.out.println("The Rename value is: "+rename);
    }
}
