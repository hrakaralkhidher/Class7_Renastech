package Day24_ArrayList;

import java.util.ArrayList;

public class Topic4_RemoveElements {
    public static void main(String[] args) {
        ArrayList<String> RandomWords = new ArrayList<>(4);
        RandomWords.add("mud");
        RandomWords.add("rice");
        RandomWords.add("elastic");
        RandomWords.add("youth");

        /*
        To remove elements fromm the ArrayList, we can use remove() methodof the ArrayList class
        For Example:
         */

        System.out.println(RandomWords);
        RandomWords.remove(RandomWords.indexOf("youth"));
        System.out.println("Modified ArrayList: "+RandomWords);

        System.out.println("____________________________________");

        System.out.println(RandomWords);
        RandomWords.remove("mud");
        System.out.println("Modified ArrayList : "+RandomWords);

        String ReturnOfREmoveIndex = RandomWords.remove(0);
        System.out.println(ReturnOfREmoveIndex);
        System.out.println("Modified ArrayList : "+ReturnOfREmoveIndex);
    }
}
