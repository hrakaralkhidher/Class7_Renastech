package Day16_Arrays;

public class Topic6_ArraysExamples {
    public static void main(String[] args) {
        //write a code where you find the maximim number in the given array below;
        //arr = {56,23,1,90,31,54,67,81,100,24}

        int [] arr = {56,23,1,90,31,54,67,81,100,24};

        int max = arr[0];
        //int max = Integer.MIN_VALUE ==> this is will work also
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max= arr[i];
            }

        }
        System.out.println("The Max valu is: "+max);

        System.out.println("****************************** the minimum number");
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min=arr[i];
            }

        }
        System.out.println("the min value is: "+min);
    }
}
