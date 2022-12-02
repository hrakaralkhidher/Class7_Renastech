package Day31_CollectionsFrameWork;

public class Topic1_ExceptionsRecap {
    public static void main(String[] args) {
        //Datatype VariableName = new Constructor (Parameter defined in construction)
        //Datatype VariableName = new DataType (Parameter defined in construction)

        BankAccount myAccount = new BankAccount(100);

         myAccount.Deposit(900);

         try {
             myAccount.Withdraw(1500);
         }catch(InsufficebtException MyError){
             System.out.println(MyError.Message);
         }
    }
}
