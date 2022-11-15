package Day22_MethodOverLoadAndWrapperClass;

import java.util.ArrayList;

import static Day22_MethodOverLoadAndWrapperClass.Topic1_RecapMethodOverLoad.line;

public class Topic4_Parsing {
    // parse method: convert string or text
    public static void main(String[] args) {
//IMPORTANT
        String str = "1900";
        System.out.println(str+55);

        line();

        int number = Integer.parseInt(str);
        System.out.println(number+55);
        line();

        String str2 = "5.55";
        double d = Double.parseDouble(str2);
        System.out.println(d+2.2);
        line();

        //parseBooleaan
        String str3 = "TrUe";
        boolean bool1 = Boolean.parseBoolean(str3);
        System.out.println(bool1);

        int primitive = 5;
        Integer wrapper = new Integer(5);
        Integer wrapper2 = 5;


    }
}
