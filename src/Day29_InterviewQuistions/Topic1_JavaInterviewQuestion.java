package Day29_InterviewQuistions;

import java.util.Arrays;

public class Topic1_JavaInterviewQuestion {

    // Write a method where it takes array of integers and returns the sorted version of that array

    //create a Method
    //Engin ===> [4,5,1,7,8,9]   sorted ===> [1,4,5,7,8,9]

    public static void main(String[] args) {
        int [] arrayNotSortedExample = new int [] {4,5,1,7,8,9};
        int [] sortedArrayExample = sortArray(arrayNotSortedExample);

        System.out.println(Arrays.toString(sortedArrayExample));
    }

    public static int[] sortArray(int[] arrayNotSorted){

        for (int i = 0; i <arrayNotSorted.length; i++) {
            //second forloop is pinting 1 index ahead
            for (int j = i+1; j < arrayNotSorted.length; j++) {

                //checking elements
                int temp= 0;
                if(arrayNotSorted[j] < arrayNotSorted[i]){

                    // swapping
                    temp = arrayNotSorted[i];
                    arrayNotSorted[i] = arrayNotSorted[j];
                    arrayNotSorted[j] = temp;

                }
            }
        }
        return arrayNotSorted;
    }

}

