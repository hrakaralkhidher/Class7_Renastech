package CustomClasses;

public class OldMcDonaldAnimal {
    public String AnimalName;
    public String AnimalType;

    public String AnimalColor;

    public int ID;
    public int NumberOfLegs;

    public void Eat(){
        System.out.println(AnimalName+" : Is Eating");
    }
    //Constructor
    public OldMcDonaldAnimal(){

    }
    public final void PrintNameAndLeg(){
        System.out.println(AnimalName+" "+NumberOfLegs);
    }
}
