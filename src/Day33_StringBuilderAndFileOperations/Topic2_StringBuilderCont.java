package Day33_StringBuilderAndFileOperations;

public class Topic2_StringBuilderCont {
    public static void main(String[] args) {
        //String is Immutable//can not change it directly need to assign it to something else like a different variable
        String word = "Henry";
        String NewWord=word.replace("e","a");
        System.out.println(NewWord);
        System.out.println("**********************************");

        //String builder is mutable// you can change it directly you can do mutation (Mutation means you can make changes)
        StringBuilder SB = new StringBuilder("Henry");

        SB.replace(1,2,"a");
        System.out.println(SB);

    }
}
