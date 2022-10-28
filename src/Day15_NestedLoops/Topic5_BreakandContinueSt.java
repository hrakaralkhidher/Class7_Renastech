package Day15_NestedLoops;

public class Topic5_BreakandContinueSt {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            System.out.println("From Outer Loop the i value: "+i);
            for (int j = 0; j < 10; j++) {

                if(i == 5 ){ // if you put i == 5 it will skip outer 5 but when you j==5 it will skip the inner
                    break;
                }
                System.out.println("\t From the Inner Loop the i value: "+i+" the j value: "+j);
            }
        }
        System.out.println("***************************************************************");


    }
}
