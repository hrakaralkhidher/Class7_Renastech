package Day34_InterviewPracticeString;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Arrays;

public class Topic4_Anagram {
    public static void main(String[] args) {
        //Listen - Silent
        //Players - parsley
        //Triangle - Integral
        //needs - dense
        //meat - team

        // get lowercase of them
        // sort them
        //check them

        System.out.println(UsingArraySort("Listen","Silent"));


    }
    public static Boolean UsingArraySort (String word1, String word2){
        Boolean ReturnValue = false;
        //if the length is not equal they are not anagram
        if(word1.length() != word2.length()){
            ReturnValue = false;
        }
        else {
            //get lowercase of them
            word1 = word1.toLowerCase();
            word2 = word2.toLowerCase();

            // sort them
            char[] word1Array = word1.toCharArray();
            char[] word2Array = word2.toCharArray();
            Arrays.sort(word1Array);
            Arrays.sort(word2Array);

            //check them
            ReturnValue = Arrays.equals(word1Array,word2Array);

        }
        return ReturnValue;
    }
    public static Boolean IsAngramUsingStringMethods(String Word1, String Word2){
        //check the length if they are not equal, they are not anagram

        if(Word1.length() != Word2.length()){
            return false;
        }else{
            //Listen - Silent
            //Players - parsley
            //Triangle - Integral
            //needs - dense
            //meat - team
            for (int i = 0; i < Word1.length(); i++) {
                char MyChar = Word1.charAt(i);

                int positionofMyChar = Word2.indexOf(MyChar);
                if(positionofMyChar == -1){
                    return false;
                }
                else{
                    //dense
                    //nee d s
                    Word2 = Word2.substring(0,positionofMyChar) + Word2.substring(positionofMyChar +1);
                }
            }
        }
        return Word2.isEmpty();
    }
}
