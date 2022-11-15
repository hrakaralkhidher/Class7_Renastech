package Day23_MethodOverloadWrapperRecap;

import java.util.ArrayList;

public class Topic5_FerreroRocherEX {
    public static void main(String[] args) {
//        int chocolate =5;
//        Integer WrappedChocolate = new Integer(chocolate);
//
//        ArrayList<Integer> myBox = new ArrayList<Integer>();
//
//        myBox.add(WrappedChocolate);
//
//        int unwrappedchocolate = WrappedChocolate.intValue();
//
////        myBox.add(chocolate);// it will work in version 5

        double d1 = 85.66;
        System.out.println("d1 without wrpper: "+d1) ;
        Double Wrappped_d1 = d1;
//        Double Wrappped_d1 = new double(d1); no need its

        PrintParameter(Wrappped_d1.toString());



    }
    public static void PrintParameter(String param1){
        System.out.println(param1);
    }
    public static int ReturnInValue(double param1){
        Double wrapped_param1 = param1;
        int a = wrapped_param1.intValue();
        return a;

    }
}
