package Day15_NestedLoops;

public class Topic4_BreakandContinueStatements {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if(i == 5){
                continue;
            }
            System.out.println("The value is: "+i);

        }
        System.out.println("********************************");
        int j = 0;
        while(j<10){
            if(j==7 || j == 8){
                j++;
                continue;
            }
            System.out.println("The j value: "+j);
            j++;
        }
        System.out.println("************************************");

        for (int i = 0; i < 10; i++) {

            System.out.println("From the outer Loop the i value is: "+i);

            for (int k = 0; k < 10; k++) {

                if(k == 5 || k == 8){ // we also can try the i value instead of k just to see how i will cme out with continue.
                    continue;
                }
                System.out.println("\t the puter loop k value "+k);
            }
        }

    }
}
