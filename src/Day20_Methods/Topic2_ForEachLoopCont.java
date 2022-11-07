package Day20_Methods;

public class Topic2_ForEachLoopCont {
    public static void main(String[] args) {
        //write a code where you have given an array of String as shown belowto check how many character 'c','C'
        //is in the value;

        String [] Animals = {"Cow","Fish","Horse","Lion","Crocodile","Eagle"};

        for(String var:Animals){
            System.out.println("The value of var variable: "+var);
            int count = 0; // this is to count the letter later in the code
            char [] letters = var.toCharArray();// {'C','o','w'} first iteration
                                                // {'F','i','s','h'}second iteration and so on
            for(char letter:letters){//letter = 'C' ,='o',='w'
                if(letter == 'c' || letter == 'C'){
                    count++; // this where we reset it to count the letters.
                }
            }
            System.out.println("The animal: "+var+" has "+count+" char c in the name");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        }



    }
}
