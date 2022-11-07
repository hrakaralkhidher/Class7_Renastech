package Day20_Methods;

public class Topic1_ForEachLoops {
    public static void main(String[] args) {

        //write a code where user is given an array of String that vontains given animals names
        //find wich one of those animals has 'O' in the name
        String [] Animals = {"Cat","Dog","Monkey","Rabbit"};

        for(String an:Animals){//animal = "Cat" // first iteration
                                //animal = "Dog" // second iteration
                                //animal= "Monkey" // third iteration
                                //animal= "Rabbit" //fourth iteration
            System.out.println("The current animal variable value: "+an);
            if(an.contains("O") || an.contains("o")){
                System.out.println("The animal "+an+ " has O or o in the name");
            }

        }





    }
}
