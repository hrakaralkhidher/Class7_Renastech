package Day6_IfElseSatatments;

public class Topic3_Ternary {
    public static void main(String[] args) {
        /*
        if(a>0) {
       Print ("a is Positive")
       }
       else {
       print ("Ais not positive")
       }
       String result;
       int a = 10;
       result = (condition)? the number is positive" : "the number is not positive";
         */
        int num1 = 90;
        int num2 = 100;
        int big ;
        big = (num1>num2)?num1:num2; //ternary
        System.out.println("the max number is  : " +big);

        if(num1>num2){
            big = num1;
        }else {
            big = num2;
        }
        System.out.println("the max number is: "+big);
    }
}
