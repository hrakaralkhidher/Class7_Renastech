package Day9_Strings;

import java.util.Scanner;

public class Topic2_Examples {
    public static void main(String[] args) {
        String name = "Baran Cavrim";// want BarCev
        String Newname = name.substring(0,3)+name.substring(6,9);
        System.out.println("The NewName value is : "+Newname);

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter first name: ");
        String FirsName = scan.next();
        System.out.println("Please enter Lastname: ");
        String LastName = scan.next();
        String Changed = (FirsName.replace('a','b') +LastName.replace('a','c')).toUpperCase();
        System.out.println("The value of changed now is: "+Changed);
        String name2 = "Andrew";
        System.out.println(name2.replace('z','a'));
    }
}
