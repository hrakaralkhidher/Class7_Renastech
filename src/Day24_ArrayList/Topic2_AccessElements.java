package Day24_ArrayList;

import java.util.ArrayList;

public class Topic2_AccessElements {
    public static void main(String[] args) {
        ArrayList<String> RandomWords = new ArrayList<>(4);//this alocate the// this is for lower memoory vampacity
        RandomWords.add("mud");
        RandomWords.add("rice");
        RandomWords.add("elastic");
        RandomWords.add("youth");

        String SecondWord = RandomWords.get(1);
        System.out.println("to get the specific elements "+SecondWord);

        // 0 1 ...
        for (int i = 0; i < RandomWords.size(); i++) {
            System.out.println(RandomWords.get(i));
        }
        System.out.println("_____________________________________________");
        int j = 0;
        while(j < RandomWords.size()){
            System.out.println(RandomWords.get(j));

            j++;
        }
    }
}
