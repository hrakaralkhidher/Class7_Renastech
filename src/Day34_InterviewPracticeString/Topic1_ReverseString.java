package Day34_InterviewPracticeString;

public class Topic1_ReverseString {
    public static void main(String[] args) {
        System.out.println(USingStringBuilder("This is an example"));
        System.out.println("************************");
        System.out.println(RegularWay("This is an example"));
        System.out.println("*******************");
        System.out.println(RegularEayWithForEach("This is an example"));
    }
    //can we use the String builder?
    public static String USingStringBuilder(String param1){
        StringBuilder SB = new StringBuilder(param1);
        SB.reverse();
        return SB.toString();
    }
    ///regularr way to reverse String
    public static String RegularWay(String param1){
        char[] MyCharArray = param1.toCharArray();
        String ReversedString = "";
        for (int i = 0; i < MyCharArray.length; i++) {
//            "This is an example"
//                    T
//                hT
//                   ihT
            ReversedString = MyCharArray[i] + ReversedString;
        }
        return ReversedString;
    }

    public static String RegularEayWithForEach(String param1){
        char[] MyCharArray = param1.toCharArray();

        String ReveresedString ="";

        for (char MyChar:MyCharArray) {
            //MyChar = MyCharArray[i] no this is for the for lop
            ReveresedString = MyChar + ReveresedString;
        }
        return ReveresedString;
    }


}
