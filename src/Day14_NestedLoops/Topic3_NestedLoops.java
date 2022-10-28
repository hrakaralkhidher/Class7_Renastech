package Day14_NestedLoops;

public class Topic3_NestedLoops {
    public static void main(String[] args) {
        //Nested Loops
        //Assume you have 3 different fruits each have 10 you want to give 10 people equally each one of the fruits

        for (int i = 0; i < 3; i++) {
            System.out.println("the distribution: "+i);
            for(int j = 1 ; j<=10; j++){
                System.out.println("Fruit: "+i+"for the ids: "+j);
            }
        }
        System.out.println("The fruits are distributed");
    }
}
