package Day15_NestedLoops;

public class Topic6_BreakStatement {
    public static void main(String[] args) {

        LBL: //you can name it whatever you want, this will basically break teh break for the outer loop when we put it next to whereits at.its likea label.
        for (int i = 0; i < 10; i++) {

            System.out.println("From outer loop i value: "+i);
            for (int j = 0; j < 10; j++) {
                if(i == 5){
                    break LBL; // this is breaking the inner loop.//the GOD is label that will break the code for the outer loop too.
                }

                System.out.println("\t From Inner loop i value: "+i+ " j value: "+j);
            }
        }
        System.out.println("******************************************");
        HK: //you can name it whatever you want, this will basically break teh break for the outer loop.its likea label.
        for (int i = 0; i < 10; i++) {

            System.out.println("From outer loop i value: "+i);
            for (int j = 0; j < 10; j++) {
                if(i == 5){
                    continue HK; // this is breaking the inner loop.//the GOD is label that will break the code for the outer loop too.
                }

                System.out.println("\t From Inner loop i value: "+i+ " j value: "+j);
            }
        }
        // the labels we use on very top and with the continue is we use them only with continue and breaks;
    }
}
