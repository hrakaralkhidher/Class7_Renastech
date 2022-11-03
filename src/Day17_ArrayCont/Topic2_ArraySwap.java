package Day17_ArrayCont;

public class Topic2_ArraySwap {
    public static void main(String[] args) {
        String [] names = {"Ziya","Hrakar","Firuze"};
        //swap the "Friuze" with "Hrakar" and later swap "Ziya" with "Hrakar"

       // names[2] = names[1]; //{"Ziya","Hrakar","Hrakar"}
        String dummy = names[2];
        names[2] = names[1]; // {"Ziya","Hrakar","Hrakar"}
        names[1] = dummy; // {"ziya","Firuze","Hrakar"}

        dummy = names[0];
        names[0]= names[2]; //{"Hrakar","Firuze","Hrakar";
        names[2] = dummy; //{"Hrakar","Firuze","Ziya";

        System.out.println("{ "+names[0]+", "+names[1]+", "+names[2]+" }");


    }//end main
}//end class
