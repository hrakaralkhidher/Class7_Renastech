package Day3_OperationsandString;

public class Topic2_Strings {
    public static void main(String[] args) {

        //String are not Primitive data types they are Non-primitive data type
        //Datatype name = a value;

        String name ="Hrakar";
        System.out.println(name);

        String prag = "This is a paragraph. I wanted to put this as well";
        System.out.println(prag);

        String spc = "281-673-7051.*!@#$%^&*()-++=";
        System.out.println(spc);

        String numbers="5678";  //this is not a number anymore, its just Text
        System.out.println(numbers);
        //combine 2 text ( do not use quotes)
        String txt1 = "This is text 1 ";
        String txt2 = "This is the text 2";
        String txt3 = txt1+txt2;
        System.out.println(txt3);

        String number2 = "98";
        String number3 ="80";
        String number4 = number2+number3;
        System.out.println(number4);

        System.out.println("This is Hello World\n"+"This is the second Hello World\t"+"This is the third Hello World");

        // we can do this to all the variables. notes plus the variables.
        int num = 89;
        System.out.println("This is the number from int: "+num);
    }
}
