package Day32_Maps;

import java.util.ArrayList;

public class Topic1_IntroToMaps {
    public static void main(String[] args) {
        ArrayList<String> MyEmployeeInformation = new ArrayList<>();

        MyEmployeeInformation.add("Hrakar");
        MyEmployeeInformation.add("Khidher");
        MyEmployeeInformation.add("25");
        MyEmployeeInformation.add("120459863");

        PrintEmployee(MyEmployeeInformation);
    }

    // please create a method that takes an Arraylist of String as parameter
    //No Return Type
    //Method name = PrintEmployee
    //This method will print employee's name and age

    //publicOrprivate StaticOrNot ReturnType method name(Paramete1Type parameter1Name)
    public static void PrintEmployee (ArrayList<String> param1){
        System.out.println(param1.get(0));
        System.out.println(param1.get(2));
    }
}
