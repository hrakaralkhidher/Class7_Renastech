package Day12_BreakandContinueStatement;

public class Topic3_BreakExamples {
    public static void main(String[] args) {
        //write a code where when speed limit is hit , stabilize the speed at the speed limit.
        //the speed limit is 75
        int speed = 0;
        for (int i = 0; i < 170; i++) {
            speed +=1; //same as speed = speed+1 // speed++ //this code will run 170 times.
            if(speed ==75)
            {
                break;
            }
        }
        System.out.println("the speed is: "+speed);






    }//end main
}//class
