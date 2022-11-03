package Day19_MultiDimensionArrays;

public class Topic9_ForEachCont {
    public static void main(String[] args) {

        String name = "Hrakar Ali Amer";
        char [] charArray = name.toCharArray();
        int count = 0;
        for(char ch:charArray){
            if(ch == 'a' || ch == 'A'){
                count++;
            }
        }
        System.out.println("The count of a's in the "+name+" Dtring is: "+count);
    }
}
