package Day17_ArrayCont;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Topic3_ArrayUtils {
    public static void main(String[] args) {
        int [] numbers = {78,34,12,31,45};
        Arrays.toString(numbers);
        System.out.println("All the elements in Array: "+Arrays.toString(numbers));

        System.out.println("++++++++++++++++++++++++++++++++++++++");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Numbers: "+numbers[i]);
        }

        System.out.println("+++++++++++++++++++++++++++++++++");
        String[] nms = {"Ali", "John","Rami"};

        String nms1 = Arrays.toString(nms);
        System.out.println("this is String rep of nms Array: "+nms1);


    }
}
