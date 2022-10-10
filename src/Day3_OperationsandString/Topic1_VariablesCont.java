package Day3_OperationsandString;

public class Topic1_VariablesCont {


    public static void main(String[] args) {
         /*
        primitive Data Types:
        1) boolean==> holds 2 values, true or false
        2) byte==> holds the whole number in range of -128 to 127
        3) char ==> holds the characters for instance c, or R, or" or }
        4) short==>holds whole number in range of -327768 to 327767
        5) int==> holds whole number
        6) longs ==> holds the whole numbers also
        7) flat==> holds decimal number up to 7 decimal digits
        8) double==> holds decimal number up to 16 decimal digit
         */

        //short==>holds whole number in range of -327768 to 327767

        // datatype name= a value
        short aNumber = -10000;
        System.out.println(aNumber);

        //int==> holds whole number(integer)
        int intNumber = 90000;
        System.out.println(intNumber);

        //longs ==> holds the whole numbers also
        long lnNumber = 789098L;
        System.out.println(lnNumber);

        int Number2 = 789;

        //lat==> holds decimal number up to 7 decimal digits

        float fNumber = 89.45f;
        System.out.println(fNumber);

        // double==> holds decimal number up to 16 decimal digit

        double bnumber=90.34537;
        System.out.println(bnumber);

        //double number = 78,98; will give you error. you can not use comma for the decimal point.

        //declaring multiple variables on the same line.

        //data type name = a value

        int number4 = 70,number5=90,number6=98;
        double dnumber4,dnumber5,dnumber7;
        dnumber4=90.3456;
        System.out.println(number5);
        System.out.println(dnumber4);

    }
}
