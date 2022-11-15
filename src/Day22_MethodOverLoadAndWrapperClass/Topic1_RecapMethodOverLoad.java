package Day22_MethodOverLoadAndWrapperClass;

public class Topic1_RecapMethodOverLoad {
    public static void main(String[] args) {

        makeOrder("Double Double Burger");
        line();
        makeOrder("Cheese Burger");
        line();
        makeOrder("Double Double Burger","Strawberry Shakes");
        line();
        makeOrder("Cheese Burger","Vanilla Shake","French Fries");
        line();
        makeOrder("Double Double Burger","Strawberry Shakes","French Fries",2);
    }//End Main





    //In-N-Out
    //MakeOrder

    private static void makeOrder(String burger){
        System.out.println(burger+" is ready to Enjoy");
    }
    private static void makeOrder(String burger, String shakes) {
        System.out.println(burger+" and "+shakes+" are ready to Enjoy");
    }
    public static void makeOrder(){

    }
    private static void makeOrder(String burger, String shakes, String fries) {
        System.out.println(burger+" and "+shakes+" and "+fries+" are ready to Enjoy");
    }

    private static void makeOrder(String burger, String shakes, String fries, int numberOfOrder) {


        for (int i = 0; i < numberOfOrder; i++) {
            System.out.println("Order Number: "+(i+1)+" "+burger+" and "+shakes+" and "+fries+" are ready to Enjoy");
            line();
        }

    }







    public static void line() {
        System.out.println("_________________________________________");
    }



}//End Class
