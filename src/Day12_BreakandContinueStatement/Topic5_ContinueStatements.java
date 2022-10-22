package Day12_BreakandContinueStatement;

public class Topic5_ContinueStatements {
    public static void main(String[] args) {
        //we use continue key word to disregard that iteration when certain condition are met.

        for (int i = 0; i < 10; i++) {

            System.out.println("The i value for each iteration: "+i);

            if(i == 5){
                continue; // this will just basically skip 5 but it needs to be inside the loops so it gets executed
            }
            System.out.println("The i value for each iteration: "+i);
        }
    }
}
