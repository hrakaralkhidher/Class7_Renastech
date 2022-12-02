package Day31_CollectionsFrameWork;

import java.util.ArrayList;
import java.util.HashSet;

public class Topic2_CollectionsIntro {
    public static void main(String[] args) {
        //HashSet is not going to be in order like the order of the list and also won't add the duplicates
        HashSet<String> MyMotors = new HashSet<>();
        MyMotors.add("Suzuki");
        MyMotors.add("Kawasaki");
        MyMotors.add("Honda");//2nd
        MyMotors.add("Suzuki");
        MyMotors.add("Yamaha");
        MyMotors.add("Honda");
        MyMotors.add("Ducati");
        MyMotors.add(null);

        System.out.println(MyMotors);

        HashSet<Integer> MyIntegers = new HashSet<>();
        MyIntegers.add(5);
        MyIntegers.add(1);
        MyIntegers.add(11);
        MyIntegers.add(5);//2nd

        System.out.println(MyIntegers);
    }
}
