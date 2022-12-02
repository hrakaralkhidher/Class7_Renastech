package Day25_Classes;

public class Topic5_WrapperClassesStatic {
    public static void main(String[] args) {
        //We created a new Integer wrapper class with the value of 5;
        Integer MyInt = new Integer(5);

        //we convert our Integer(MyInt) to String
        String MyString = MyInt.toString();

        //To convert our String to Integer , we used parseInt method of Integer
        Integer AnotherInteger = Integer.parseInt(MyString);
    }
}

