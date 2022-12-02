package Day30_Exceptions;

public class Topic8_Finally {
    public static void main(String[] args) {
        try{
            //my code go here
            int date = 10 / 5;
        }catch(ArithmeticException e){
            System.out.println("There is a an Exception");
        }finally {// this will execute no matter what
            //After you execute the code in try block
            //come here and run below code
            //no matter you got an exception or not!
            System.out.println("This code is in Finally!");
        }
        //another examp
        try{
            System.out.println("Open file");
            /*
            do something about file
             */
        }finally {
            System.out.println("close the file!");
        }




        /*
        try{
        }
        catch(){}
        catch(){}
        catch(){}
        finally{}
         */
    }
}
