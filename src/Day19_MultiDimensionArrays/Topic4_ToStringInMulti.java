package Day19_MultiDimensionArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Topic4_ToStringInMulti {
    public static void main(String[] args) {
        int[] nums = {9,4,5,6,3,2,4,5,6,7,3,23,2,3,2};
        System.out.println("The nums arrays is: "+ Arrays.toString(nums));

        int [][] multiD = {{3,4,5,2,1,5,6,7,8,9}, {87,90,322,56}, {34,2,3,4,4,4,4,4,4,4}};
        for (int i = 0; i < multiD.length; i++) {
            System.out.println("The values: "+Arrays.toString(multiD[i]));
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        int [][] multi = {{3,4,5,2,1,5,6,7,8,9}, {87,90,322,56}, {34,2,3,4,4,4,4,4,4,4}};
        System.out.println("The multi array values: "+Arrays.deepToString(multi)); //NEW
        //Array.deepToString(multidimensional Array) is used to convert the multi array to string







    }//end class
}//end main
