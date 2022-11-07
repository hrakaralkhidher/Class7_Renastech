package Day20_Methods;

public class Topic8_MethodParamEx {

    // Write a method where it takes array of integer and print the sum of all the elements in the array
    public static void main(String[] args) {

        int [] ArraysInt = {56,7,8,23,4,5,6,3,2,5,6,8};
        SumArray(ArraysInt);
        System.out.println("++++++++++++++++++++++++++++++++");
        int [] Nums = {78,-98};
        SumArray(Nums);



    }
    public static void SumArray(int[]numbers){
        int sum=0;
        for(int num: numbers){
            sum = sum + num;
        }
        System.out.println("The sum os all the number in array is: "+sum);

    }

}
