package CustomClasses;

import java.util.ArrayList;

public class StudentClass {
    //Field
    public String Name;
    public String StudentNumber;

    private ArrayList<Integer> HomeWorkResults;

    private Integer Year;
    //Constructor
    public StudentClass() {
      HomeWorkResults = new ArrayList<Integer>();// this is to initialize it
        System.out.println("Someone Created a StudentClass");
    }
    ///AddHomeWorkResult : This method will add a Result to Your Homework
    //Return Type = No return
    //@param1 is an Integer value

    public void AddHomeWorkResult(int param1){ //  if you add static to the method like this you need to use this.
        HomeWorkResults.add(param1);
    }
    ///GetMean : This method will calculate Mean and return 
    ///Return Type = double
    /// No pparameter
    //PublicOrPrivate StaticOrNot ReturnType MethodName (ParameterType,
    
    public double GetMean() {
        int sum = 0;
        for (int i = 0; i < HomeWorkResults.size(); i++) {
            sum = sum + HomeWorkResults.get(i);
        }
        double Mean = sum / HomeWorkResults.size();
        return Mean;
         }

    }

