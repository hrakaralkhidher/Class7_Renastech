package Day6_IfElseSatatments;

public class Topic4_MultipleTernary {
    public static void main(String[] args) {
        /*
        (condition)?first:(condition)?:second:(condition)?third; ===> so basically if, else if, else if, else
         */
        //write a code where it checks if number is even or odd or zero
        // (a%2==0)? "the number is even":(a%2!=0)? "the number is odd": "the nuber is 0;

        int number1 = 70;
        String result = (number1==0)?"te number is Zero":(number1%2!=0)?"the number is odd":"the number is Even";
        System.out.println(result);
    }
}
