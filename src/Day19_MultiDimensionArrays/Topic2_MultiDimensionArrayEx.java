package Day19_MultiDimensionArrays;

public class Topic2_MultiDimensionArrayEx {
    public static void main(String[] args) {

        String [][] names = {{"Ziya","Seda"},    {"Sena","Anil","Hrakar"},    {"Ferah","Onder","Fahrattin","Amer"},};
        // index                name[0]                         name[1]                               name[2]
        // String [] regular = names[0] == {ziya","Seda"}
        //regular[0] == "Seda" ==>names[0][1] == > "Seda"

        String [] regular = names[0];
        System.out.println("The value in index 1: "+regular[1]);
        System.out.println("The value in index 1: "+names[0][1]);

        //Getting the length (size) of multidimensional arrays

        int namesLen = names.length;
        System.out.println("The length of names array: "+namesLen);

        //names[0], names[1], names[2] ==> names[index].length == to find inner arrays length

        System.out.println("THe length of names [0] array is: "+names[0].length);
        System.out.println("THe length of names [1] array is: "+names[1].length);
        System.out.println("THe length of names [2] array is: "+names[2].length);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int [][] nums = {{1,2,3,4,5,6,2,1},        {908,3,4,5,2,3,2,1,87,4,5,6,90,7,70}};
        System.out.println("The length of nums array is:");


    }
}
