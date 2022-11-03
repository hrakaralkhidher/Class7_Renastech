package Day16_Arrays;

public class Topic1_Arrays {
    public static void main(String[] args) {

        //Array: container where they hold multiple in the same data types.
        //DataType [] name = {value1,value2,value3}

        int [] array1 = {78,23,91,34};
        // in arrays index starts from 0
        int[] array2 = {67,90,28,10};
        // the arrays index start with 0 all the time 67=0,90=1,28=2,10=3

        //if i want to get the number in index 0, ==> array2[2]

        System.out.println("The first number in array2 is: "+array2[0]);
        System.out.println("The first number in array2 is: "+array2[1]);
        System.out.println("The first number in array2 is: "+array2[2]);
        System.out.println("The first number in array2 is: "+array2[3]);

        int var3 = array2[2];
        System.out.println("The var3 value is: "+var3);

        System.out.println("**********************************");

        //Boolean data type arrays
        boolean [] BoolArray = {true,false,true,true};
        System.out.println("The value in index 3 in BoolArray is: "+BoolArray[3]);

        boolean var = BoolArray[1];
        System.out.println("The var value is: "+var);

        //double arrays data type

        double[] dobArray = {90,65.8778,23}; //90= 90.00000
        System.out.println("The value is index 0: "+dobArray[0]);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        //String Arrays
        String [] stringArraynames = {"Cheesus","Hrakar","Ziya","Nelly",null};
        System.out.println("The name is: "+stringArraynames[3]);
        System.out.println("The value of index 4: "+stringArraynames[4]);

    }

}
