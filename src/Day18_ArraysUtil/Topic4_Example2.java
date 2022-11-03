package Day18_ArraysUtil;

import java.util.Scanner;

public class Topic4_Example2 {
    public static void main(String[] args) {

        //write a code where use is being asked to enter a Sentence
        // check for each word to see how many 4 char substring in the word is palindrome
        //"This Afternoon I found RRRRRESTdaad  something that had DIID on it."


        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a Sentence: ");
        String sentence = scan.nextLine();
        String [] word = sentence.split(" "); //words = {"This","Afternoon",.....etc}


        for (int i = 0; i < word.length; i++) {
            int count = 0;
            String words = word[i];
            if(words.length()<4){
                continue;
            }
            for (int j = 0; j < words.length()-4; j++) {

                String sub = words.substring(j,j+4);//(0,4)
                String reverse = "";
                for (int k = sub.length()-1; k >= 0 ; k--) {
                    char c = sub.charAt(k);
                    reverse = reverse+c;


                }
                if(sub.equals(reverse)){
                    count++;
                }

            }
            System.out.println("The word: "+words+" has "+count);

        }





    }
}
