package Day10_StringMethods;

public class Topic3_ForLoop {
    /*
    for(starting point;  end point; increase or decrease){
    code Block

    }

     */
    public static void main(String[] args) {
        for(int i = 0;i<20;i++)// the I value will increase by 1 until its 19
        {
            System.out.println("the I value: "+i);
        }
        System.out.println("*********************************************");
        for(int i = 10;i<=90;i+=10)//i=i+2
        {
            System.out.println("the i value: "+i);
        }
        System.out.println("*********************************************");

        for (int fiko = 20; fiko > 0 ; fiko--)//short cut fori/ also you can use all mathmatics
        {
            System.out.println("the value i: "+fiko);
        }
        //system.out.println("the value of i: "+u); this will error out because i is only accessible inside the loop.

        //write a code where you calculate the sum of all the numbers between 0 to 20;
        int result = 0;
        for(int j = 0;j<20;j++)
        {
            result = result+j;//result = 0+0=0
                            //result = 0+1 =1
                            //result =1+2=3
                            //result = 3+3=6
                            //result = 6+4= 10
                            //result = 0+1+2+3+5
            // System.out.println("the result for each iteration: "+result);




        }
        System.out.println("The end result is: "+result);

    }//end main
}//end class
