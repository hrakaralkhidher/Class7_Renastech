package Day21_MethodsAndMethodOverLoad;

public class Topic3_MethodOverloading {
    /*
    There are three ways to overload method
    In order to overload a method, the parameters list of the method must different in either of those
    1) Number of parameters
    Valid case for overloading
    Public static int add(int, int) // like add(1,2)
    public static int add(int, int, int)//like add(1,2,3)
    2) Data types of parameters
    Public static int add(int, int) // like add(1,2)
    public static int add(int, float)//like add(1, 1.3f)
    3) Sequence of parameters
    Public static int add(float, int) // like add(1.3f,2)
    public static int add(int, float)//like add(1,2,1.3f)
     */
    public static void main(String[] args) {
        calculateNumbers(1,2);
        calculateNumbers(1,2,3);
        System.out.println(calculateNumbers(1, 1.5));
        System.out.println(calculateNumbers(2.5,3));
    }
    private static void calculateNumbers(int number1,int number2){
        int sum = number1+number2;
        System.out.println(sum);
    }
    private static void calculateNumbers(int number1,int number2,int number3) {
        int sum = number1 + number2+number3;
        System.out.println(sum);
    }
    private static String calculateNumbers(int number1, double number2){

        double sum = number1+number2;
        return "Total is:"+sum;
    }
    private static String calculateNumbers(double number1, double number2) {

        double sum = number1 + number2;
        return "Total is: " + sum;
    }
}
