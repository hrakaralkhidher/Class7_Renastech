package Day11_ForLoopCont;

public class Topic3_ForLoopsEx2 {
    public static void main(String[] args) {
        //Write a code were you find a even number between 100 - 120 (not included)
        int count = 0;
        int count1= 0;
        for(int i = 10;i<120;i+=2)
        {
         count++; //count = count+1
        }
        System.out.println("the count of even number number: "+count);
        // write a code where you find the odd number between 11 - 120 (not included)
        for(int i = 11; i<120;i+=2){
            count1++;
        }
    }
}
