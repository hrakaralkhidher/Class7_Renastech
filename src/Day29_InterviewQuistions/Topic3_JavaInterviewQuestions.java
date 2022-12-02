package Day29_InterviewQuistions;

import java.util.Arrays;

public class Topic3_JavaInterviewQuestions {

    // Two Number Sum Problem Statement
    // Given an array of integers, return the indices of the two numbers whose sum is equal to a given target.

    //[12,17,21,25] 29 find which two numbers adds up to 29 inside the array.

    public static void main(String[] args) {
        int[] newArray = new int[]{12,17,21,25};
        int target = 38;
        System.out.println(Arrays.toString(twoSum(newArray,target)));
    }
    public static int[] twoSum(int[] intput, int target){

        int[] newArray = new int[2];

        for(int i = 0;i<intput.length; i++ ){

            int first = intput[i];

            for (int j = i+1; j < intput.length; j++) {
                int second = intput[j];

                if((first+second) == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;//[0,2]
    }
}
