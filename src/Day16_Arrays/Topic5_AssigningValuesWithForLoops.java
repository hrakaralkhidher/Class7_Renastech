package Day16_Arrays;

public class Topic5_AssigningValuesWithForLoops {
    public static void main(String[] args) {


        // write a code where you define an integer array with a size /length of 10 and assign each index with starting
        // even numbers starting from 90
        //90,92,04,96,98,100,102,104,106,108
        //arr = {90,92,04,96,98,100,102,104,106,108}

        int[] arr1 = new int[10];// {they all are default if you leave it like this}

        int start = 90;

        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=start;
            start= start +2;

        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("the value in index: "+i+"is "+arr1[i]);
        }
    }
}
