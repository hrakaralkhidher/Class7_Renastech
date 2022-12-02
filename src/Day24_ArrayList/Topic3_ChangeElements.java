package Day24_ArrayList;

import java.util.ArrayList;

public class Topic3_ChangeElements {
    public static void main(String[] args) {
        ArrayList<String> RandomWords = new ArrayList<>(4);
        RandomWords.add("mud");
        RandomWords.add("rice");
        RandomWords.add("elastic");
        RandomWords.add("youth");
        System.out.println(RandomWords);

        RandomWords.set(1,"noddle");

        /*
        to change elements of the ArrayList, we use set() methods of the ArrayList class For Example
         */
        System.out.println(RandomWords);

        //Here the set() method changes the element at index 1 to noddle ("rice" =. "noddle"

        /*

         */
        int IndexOfElastic = RandomWords.indexOf("elastic");

        //-1 0 2 3 ...
        int IndexOfHayri = RandomWords.indexOf("Hayri"); //>> this will be -1
        if (IndexOfHayri > -1){
            System.out.println(" We have Hayri in the ArrayList");
        }
        else {
            System.out.println(" We dont have Hayri in the ArrayList");
        }
        boolean DoWeHaveBulgurInArrayList = RandomWords.contains("bulgur");
        System.out.println(DoWeHaveBulgurInArrayList);

        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println(RandomWords);
        RandomWords.set(RandomWords.indexOf("elastic"), "chocolate");
        System.out.println("Modified Array List: "+RandomWords);
    }
}
