package Day19_MultiDimensionArrays;

public class Topic1_MultiSimensionArrays {
    public static void main(String[] args) {
        //Multidimension arrays are basically array inside of array
        //name = {{"Ziya","John","Eloise"}, {"Anil","Rami"}}

        int [][] numbers = {{3,4,5,6,7,8},      {8,7,3,4,1,0,-123},     {90,23,145,109,107}};

        /////                  index 0                index1                 index2

        int a = numbers[0][1];
        System.out.println("Numbera is: "+a);

        System.out.println("The number is: "+numbers[1][6]);

        System.out.println("The number in index 2 is: "+numbers[2][3]);


        int len = numbers.length;
        System.out.println(" the length of outer Array is: "+len);

        System.out.println("The Numbers Array is: "+numbers[0]);


    }
}
