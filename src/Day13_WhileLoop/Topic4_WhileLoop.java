package Day13_WhileLoop;

public class Topic4_WhileLoop {
    public static void main(String[] args) {
        //Print all the numbers between 1 to 10 except number 5,8,2

        int i = 1;
        while(i<10){
            if(i==5||i==8||i==2){
                i++; // is because when it gets executed the tw
                continue;
            }
            System.out.println("all the numbers "+i);
            i++;
        }
        System.out.println("********************************");

        // print all the chars in the string "nawras" except char 'a'
        String name = "Nawras";
        int j =0;
        while(j<name.length()){

            if(name.charAt(j)=='a'){
                j++;
                continue;
            }
            System.out.println("the char ar the index"+j+" is:"+name.charAt(j));
            j++;
        }



    }//end main
}//endclass
