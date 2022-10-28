package Day15_NestedLoops;

public class Topic1_WhileNestedLoops {
    public static void main(String[] args) {
        /*
        while(){
            //code block
            while(){
                //second code block
            }
        }
        */
        //int min= Integer.MIN_VALUE; min value would be the minimum value

        int i =0;
       // int j = 1;
        while(i<10){
            System.out.println("The value of i: "+i);
            int j = 1;//everytime you run it outside you have to give it a start value like 1
            while(j<10){

                System.out.println("/t For Each i: "+i+" value "+ " the j value: "+j);
                j++;
            }
            //System.out.println("this ");
            i++;
        }

    }//end main
}//end class
