package Day18_ArraysUtil;

import java.util.Arrays;

public class Topic1_Split {
    public static void main(String[] args) {
        //Split()metod in Arrays Util, It creates a String Array based on the given String Expression

        String names = "Ziya Hrakar Nilfuer Sena";
        System.out.println("The String Name is: "+names);
        String [] nm = names.split(" ");

        System.out.println("nm contains :"+ Arrays.toString(nm));
        System.out.println("The length of nm array is: "+nm.length);
        System.out.println("The first element: "+nm[0]);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++=");

        String nums = "1234517619871";
        String [] numbers = nums.split("1"); // everytime it sees one 1 it will count as a space lie the examp above

        System.out.println("The numbers array is: "+Arrays.toString(numbers));
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        String var = "ThisisjustaString";
        String [] var1 = var.split(""); // if you dont put anything in the split it will create a element for each character.
        System.out.println("the var1 values: "+Arrays.toString(var1));

        String forbid = "Thisisjust a TEST";
        String [] tst = forbid.split(""); // you can NOT use (*,?,+,/,\,...etc) on the split
        System.out.println("++++++++++++++++++++++++++++++");
        String var2 = "THISISATESTFORALI";
        String [] test = var2.split("",5); // this is the other split version it will divide into that many elements
        System.out.println("The test array is: "+Arrays.toString(test));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        String var3 = "This is just a testbut i want to try again";
        String [] test1 = var3.split(" ",11);
        System.out.println("The test1 values: "+Arrays.toString(test1));



    }
}
