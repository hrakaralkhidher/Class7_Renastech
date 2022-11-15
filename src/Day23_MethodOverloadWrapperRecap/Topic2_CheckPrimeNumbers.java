package Day23_MethodOverloadWrapperRecap;

public class Topic2_CheckPrimeNumbers {
    public static void main(String[] args) {

        int num = 15;
        boolean IsItPrimeNumber = true;
        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                IsItPrimeNumber = false;
            }

        }

        if(IsItPrimeNumber == true){
            System.out.println("It is a Prime Number");
        }else{
            System.out.println("It is NOT a Prime Number");
        }



    }//end main
    /*
    public static boolean CheckPrimeNumber(int param1){
        boolean IsItPrimeNumber = true;
        for (int i = 2; i < param1 ; i++) {
            if((param1 % i == 0)){
                IsItPrimeNumber = false;
            }
        }
        return IsItPrimeNumber;
    }

     */
}
