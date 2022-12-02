package Day25_Classes;

public class Topic4_StaticMethods {
    public static void main(String[] args) {

        CupcakeMold MyCupCake = new CupcakeMold();
        MyCupCake.GetSyle();


//        CupcakeMold.GetSyle();
//        MyCupCake.School
    }
}
class CupcakeMold{
    //Field
    static String School = "RenasTech";
    /*
    static means that the fiels or method marked as such is available at the class level
    In other words, you don't need to create an instance of the class to access it.

    so, instead of creating a copy of cupcakeMold then calling GetSyle() like this;
    CupcakeMold MyCupCake = new CupcakeMold();
    MyCupCake.GetSyle();

    you can call the method directly against the class, like so;
     CupcakeMold.GetSyle();

     The class is a CupcakeMold
     and the object is the copy made with cupcake mold
     A static method belongs to the CupcakeMold and can be accessed directly without making any copies;
     hence, the example above
     */


    public static void GetSyle(){
        System.out.println("Tornado");
    }
}
