package Day30_Exceptions;

public class Topic1_ExceptionsIntro {
    public static void main(String[] args) {
        /*
    What is the difference between error and exception in Java?
Errors are mainly caused by the environment in which an application is running.
For example, OutOfMemoryError happens when JVM runs out of memory.
Whereas exceptions are mainly caused by the application itself.
For example, NullPointerException occurs when an application tries to access null object.
-- what are checked and unchecked exceptions in java?
Checked exceptions are the exceptions which are known to compiler.
These exceptions are checked at compile time only. Hence the name checked exceptions.
These exceptions are also called compile time exceptions.
Because, these exceptions will be known during compile time.
Unchecked exceptions are those exceptions which are not at all known to compiler.
These exceptions occur only at run time.
These exceptions are also called as run time exceptions.
All sub classes of java.lang.RunTimeException and java.lang.Error are unchecked exceptions.
     */
        System.out.println("This is Line 5");// This line executed

        try{
            //Your code will go here that you want to catch exception
            int AValue = 50/0;// This line throw error
        }catch (Exception e){
            System.out.println("This was an exception");
        }
       /*
       the below code for handling an exception.
       we need to memorize it
        try{

        }catch(Exception e){

        }

        */

        System.out.println("Rest of the code");
    }
}
