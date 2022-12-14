package Day18_ArraysUtil;

import java.util.Arrays;

public class Topic3_ArrayEqual {
    public static void main(String[] args) {

        int [] nums = {9,8,7,3,4,5};
        int[] nums1 = {9,8,7,3,4,5};

        System.out.println("Is nums and nums1 equal: "+Arrays.equals(nums,nums1));

        System.out.println("+++++++++++++++++++++++++");

        int [] nums2 = {3,4,5};
        int [] nums3 = {4,3,5};
        System.out.println("Is nums2 and nums3 equal: "+Arrays.equals(nums2,nums3));

        System.out.println("+++++++++++++++++++++++++");

        char [] ch = {'R','T','E'};
        char []ch1 = {'r','T','E'};
        System.out.println("Is ch and ch1 arrays equal: "+Arrays.equals(ch,ch1));

        System.out.println("+++++++++++++++++++++++++");

        int [] nums4 = {7,8,9,5,10};
        int [] nums5 = nums4;
        System.out.println("The nums5 values: "+Arrays.toString(nums5));
        System.out.println("Is nums4 and nums5 equals: "+Arrays.equals(nums4,nums5));



    }
}
