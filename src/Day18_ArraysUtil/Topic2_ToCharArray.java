package Day18_ArraysUtil;

import java.util.Arrays;

public class Topic2_ToCharArray {
    public static void main(String[] args) {

        String name = "This is + * ?  Ziya Yilmaz";
        char [] ch = name.toCharArray(); // it returns to a char array with every single charters in the String;
        System.out.println("This is char arrays: "+ Arrays.toString(ch));
        System.out.println("++++++++++++++++");

        String test = "This is a Test";
        String [] StrArray = test.split(""); // {"T", "h", "i","s","", ....}
        char[] ChaArray = test.toCharArray();//{'T','h','i',.....}
        char a = ChaArray[0];

    }
}
