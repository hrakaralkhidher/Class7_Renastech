package CustomClasses;

public class EmployeeClass {
    //Fields
    public String Name;
    public String Surname;
    public String Department;

    public AddressesClass HomeAddress;

    private String SSN;

    //Constructor ==> this is the constructor it has to be the same name as the class
   public EmployeeClass(){
       HomeAddress = new AddressesClass();
       System.out.println("You Created an Employee, This is a Default for the constructor");
    }

    ///This is a constructor
    ///@param1 is a String variable that we will use as a Name
    ///@param2 is a String variable that we will use as a SurName
    ///@param3 is a String variable that we will use as a Department
    public EmployeeClass(String param1, String param2, String param3){
        HomeAddress = new AddressesClass();
        System.out.println("YOu created an employee with 3 parameter ");
       Name = param1;
       Surname = param2;
       Department = param3;
    }


    //Methods

    ///SetEmployeeSIN : Thid method will set employee's SIN number. Return type = void
    ///@param1 : this is a String type parameter

    //public static ReturnType MethodName (ParameterType Parametername,....)
    public void SetEmployeeSSN (String param1){
        SSN = param1;
    }

    ///GetEmployeeSSN: this method will return a String type and will return SSN value
    /// I don't have any parameters
    public String GetEmployeeSSN(){
    return SSN;
    }
}
