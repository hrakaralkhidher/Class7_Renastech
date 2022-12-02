package Day29_InterviewQuistions;

public class Topic2_JavaInterviewQuestion {
    ///IMPORTANT FOR THE INTERVIEW
    //  Write a method where it takes a poem and returns the most Poetical Word from the poem

    // calculate score of each world by fallowing scores
    // a,b,c,d,e,f +1
    // x -2
    // k -1

    // Example: Poem =>  "and the garden diminishes: grape leaves rumpled and rusty,
    // zucchini felled by borers, tomatoes sparse on the vines"
    // Return => felled
    //If you get asked, ask the interviewer id there only one space in the poem btw the wrords...

    public static void main(String[] args) {
        System.out.println(MostPoeticalWord("and the garden diminishes: grape leaves rumpled and rusty,zucchini felled by borers, tomatoes sparse on the vines\""));
    }


    public static String MostPoeticalWord(String poem){

        String[] words = poem.split(" ");//['and','the','garden',......]

        int count2 = 0;
        String wordResult = "";
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            int count = 0;
            char[] letters = word.toCharArray();//it will turn into like this ['a','n',d'..so on ]//['g','a''r','d','e','n']
            for (int j = 0; j <letters.length ; j++) {
                if(letters[j] == 'a' || letters[j] == 'b' || letters[j] == 'c' || letters[j] == 'd' || letters[j] == 'e' || letters[j] == 'f'){
                    count++;
                } else if (letters[j] == 'k') {
                    count = count -1;
                } else if (letters[j] == 'x') {
                    count = count-2;
                }
            }
            if(count>count2){//count2= 0, count = 1
                count2 = count;// count 2 = 1
                wordResult = words[i];//wordResult = and
            }
        }
        return wordResult;
    }


}
