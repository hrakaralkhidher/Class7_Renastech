package Day30_Exceptions;

public class Topic10_CustomExceptions {
    public static void main(String[] args) {
        try{
            ValidateAge(15);
        }catch(NotEligibleToVoteException e){
            System.out.println(e.Message);
        }

        try{
            throw new NoSuchFieldException();
        }catch(NoSuchFieldException e){
            System.out.println("I handled NoSuchFieldException");
        }
    }
    /*
    About exception handling you need to know the below keyword


    try ===> this is the start of when you want to check a code block
    catch====> this is like a condition when we have a code inside it, we aren't sure, or we have just worn a user
    finally ====>we use this when we use a after we're done with all the catches in exception
    throw  ====> we use this inside the method or a constructor
    throws ====> use it when we create a method or a constructor to use a custom exceptions
     */



    public static void ValidateAge(int param1) throws NotEligibleToVoteException {
        if(param1 < 18){

            throw new NotEligibleToVoteException("You can not vote");
        }else{
            System.out.println("You can vote");
        }
    }
}

class NotEligibleToVoteException extends Exception{
    String Message;
    ///Please create a constructor for this class with one string parameter

    // public ClassName(parameter1Type, parameter1Name,...)
    public NotEligibleToVoteException(String param1){
        Message = param1;
    }
}