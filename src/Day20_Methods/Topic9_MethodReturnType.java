package Day20_Methods;

public class Topic9_MethodReturnType {
    public static void main(String[] args) {


        System.out.println("The food is: "+     Kitchen("Tomatos ","SeaSalt"," OliveOils"));
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
       int result=  Sum2Nums(45,23);
        System.out.println("the result is: "+result);

        System.out.println("+++++++++++++++++++++++++++++++");

        System.out.println("The result also: "+Sum2Nums(2,67));

    }

    public static String Kitchen(String Veggies,String Salt,String oil){
        String food = Veggies + Salt + oil;
        return food;
        /*
        Access Modifiiers Specifiers Return Type(String,Int,Object,Array,list) MethodName(Params){
        Code block

        return a value ora variable which is the same data type with your Return type
        }
         */
    }

    public static int Sum2Nums(int a, int b){

        //int sum = a+b; ===> same

        return a+b;
    }






}
