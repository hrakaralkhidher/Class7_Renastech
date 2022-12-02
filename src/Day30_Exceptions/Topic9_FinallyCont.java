package Day30_Exceptions;

public class Topic9_FinallyCont {
    public static void main(String[] args) {
        try{
            System.out.println("Do Something");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Finally");
        }
        //this is not realted to your try and catch
        System.out.println("No finally");

    }
}
