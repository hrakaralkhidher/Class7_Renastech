package Day30_Exceptions;

import sun.font.EAttribute;

public class Topic3_MultipleExceptions {
    public static void main(String[] args) {
        try {
            int[] AnArray = {1,22,33};
            int MyValue = AnArray[6];
        }catch(Exception MyException){
            System.out.println("We dont have a value for index 6");
        }
        System.out.println("Rest of the code");
    }
}
