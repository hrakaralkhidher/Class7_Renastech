package Day16_Arrays;

public class Topic2_Arrays {
    public static void main(String[] args) {
        //we can define an array with a size but not add any values
        //DataType [] name = DataType[size/length]

        int [] intArray = new int[4]; //{0,0,0,0}
        //0 is also the default value for byte, short, and long data type
        System.out.println("THe index 0 value in intArray is: "+intArray[0]);
        System.out.println("THe index 0 value in intArray is: "+intArray[1]);
        System.out.println("THe index 0 value in intArray is: "+intArray[2]);
        System.out.println("THe index 0 value in intArray is: "+intArray[3]);
        System.out.println("THe index 0 value in intArray is: "+intArray);//this will return to a hashcode for intArray

        System.out.println("***************************************");
        double [] doubArray = new double[3]; //{0.0,0.0,0.0}beacuse 0.0 is the defaul value of double.
        //default for double and float is 0.0
        System.out.println("The value os index 1 in doubArray: "+doubArray[1]);

        char [] charArray = new char[4];//{ , , , } it will be just be a space the default of char
        System.out.println("the default value of char "+charArray[1]);
        System.out.println("***********************");

                                                                 //0     1    2
        String [] stringArray = new String[3]; //this will create {null,null,null}
        System.out.println("The default vale for the String: "+stringArray[0]);

        //once Array size or length id defined it can NOT ve changed what you can do is create another array,
        // and put all the values in the new array.

    }
}
