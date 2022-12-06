package Day34_InterviewPracticeString;

public class Topic3_SwapTwoStringWithoutUsingThirdVariable {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Renastech";

//        String c = a;  <-- Temp String or dummy String
//      a  = b;
//      b = c;

        System.out.println(a);

        //do something
        //a+b-a = b

        //appending 2nd string into 1st string
        a = a + b;
        //a = HelloRnastech; length = 14
        //b = Renastech; Length = 9

        //substring(0,5)

        b = a.substring(0,a.length() - b.length());

//         a = HelloRenastech
//         b = Hello
        //substring(5)

        a = a.substring(b.length());
        System.out.println("*************************");
        System.out.println(a);



    }
}
