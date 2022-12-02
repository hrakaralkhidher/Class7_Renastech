package CustomClasses;

public class AnimalClass {
    public String AnimalName;
    public String AnimalType;

    public String AnimalColor;

    public int ID;
    public int NumberOfLegs;


    public void Eat(){

    }




    ///This is a Constroctor, this will be called when you create a class
    ///@param1 is String variable and we will use it as an animal name
    //@param2 is String variable and we will use it as an animal type
    public AnimalClass(String param1, String param2){
       AnimalName = param1;
       AnimalType = param2;
    }

    //How to define a Constructor
    //public ClassName(ParamererType parameterName,....)

    ///This is a Constroctor, this will be called when you create a class
    ///@param1 is String variable and we will use it as an animal name
    //@param2 is String variable and we will use it as an animal type
    ///@param3 is String variable and we will use it as AnimalColor

    public AnimalClass(String param1, String param2, String param3){
        AnimalName = param1;
        AnimalType = param2;
        AnimalColor = param3;
    }



    public void Amethod(String param3){
        System.out.println(param3);
    }
}
