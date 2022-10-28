package Day15_NestedLoops;

public class Topic2WhileEndForNextedLoops {
    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {

            System.out.println("The i value: " + i);// this code will get executed 10 times

            for (int j = 1; j < 10; j++)
            {
                System.out.println(" for each i value: " + i + "J value "+j);//this code will get executed 90ytimes
                // for each i value it will get excuted 9 times.
            }
            i++;
        }
    }
}

