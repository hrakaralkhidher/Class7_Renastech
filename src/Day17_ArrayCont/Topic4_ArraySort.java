package Day17_ArrayCont;

import java.util.Arrays;

public class Topic4_ArraySort {
    public static void main(String[] args) {

        int[] nums = {56,32,34,90,-345,-12,-34};

        System.out.println("The nums array is: "+Arrays.toString(nums));

        Arrays.sort(nums); // Arrays, sort(the names of array) will put the element in increasing order and assign

        System.out.println("The nums array now is: "+Arrays.toString(nums));
        System.out.println("The first element in nums: "+nums[0]);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++");

        String [] names = {"Zaliha","Eloise","Hrakar","Amer"};
        System.out.println("The Array if names is : "+Arrays.toString(names));

        Arrays.sort(names);
        System.out.println("the Arrays of names now: "+Arrays.toString(names));
        System.out.println("++++++++++++++++++++++++++++++++");

        int [] nums3 = {90,34,-123,-456,23,1234,5673};
        int[] reverse = new int[nums3.length];
        Arrays.sort(nums3);//{456,123,23,34,

        int j = 0;

        for (int i = nums3.length-1; i >= 0; i--) {

            reverse[j] = nums3[i]; //reverse[0] = nums3[6] {5673,0,0.0....
                                   //reverse[1] = nums3[5] {5673,1234,......
            j++;
        }
        System.out.println("the reverse is: "+Arrays.toString(reverse));

    }
}
