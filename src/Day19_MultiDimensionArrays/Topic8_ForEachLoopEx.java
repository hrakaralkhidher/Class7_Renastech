package Day19_MultiDimensionArrays;

public class Topic8_ForEachLoopEx {
    public static void main(String[] args) {


        //write a code whee user check every string values in array and see if that string has "a" in it:

        String[] str = {"Alibaba", "Omur", "Gorkem", "Nesertting", "Hoca"};

        for(String var:str){
            if(var.contains("a")||var.contains("A")){
                System.out.println("the word: "+var+" contains a or A");
            }else{
                System.out.println("The word: "+var+ " done NOT contain a or A");
            }
        }



    }
}
