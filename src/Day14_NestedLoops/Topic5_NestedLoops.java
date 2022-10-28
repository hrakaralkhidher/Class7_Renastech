package Day14_NestedLoops;

public class Topic5_NestedLoops {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println("This is first outer loop value of i"+i); //this code will get executed 3 times

            for (int j = 0; j < 3; j++) {
                System.out.println("\t this is second outer/first inner loop i"+i+"j: "+j);//this code will get executed 9 times

                for (int k = 0; k < 3; k++) {
                    System.out.println("\t \tthis second inner loop i: "+i+"j: "+j+"k: "+k);//this code will get executed 27 times
                }
            }

        }
    }
}
