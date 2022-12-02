package Day31_CollectionsFrameWork;

public class BankAccount {

        double Balance;

        //Please create a constructor that takes one double parameter

        //public ClassName(Parameter1Type parameter1Name....)
    public BankAccount(double param1){
        Balance = param1;
    }
    //please create a method that takes a double as parameter
    //no return
    //this method will add the parameter to you balance
    //Method name = Deposit

    //PublicOrPrivate StaticOrNot ReturnType MethodName(parameter1Type Parameter1Name,....)
    public void Deposit(double param1){
        Balance = Balance + param1;
        System.out.println("Available Balance: "+Balance);

    }
    //please create a method that takes a double as parameter
    //no return
    //This method will subtract the parameter value from your balance
    //Method name = Withdrawal
    //PublicOrPrivate StaticOrNot ReturnType MethodName(parameter1Type Parameter1Name,....)

    public void Withdraw(double param1) throws InsufficebtException{
        if(Balance < param1){
            System.out.println("You dont have enough money");
            throw new InsufficebtException();
        }
        else {
            Balance = Balance - param1;
            System.out.println("Available Balance: "+Balance);
        }

    }

}
