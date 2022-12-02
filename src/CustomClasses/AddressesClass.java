package CustomClasses;

public class AddressesClass {
    //Access Modifiers: public, private , protected, default
//private: Only within the class.
    // It cannot be accessed from outside the class.
    //Default: Only within the package.
    // It cannot be accessed from outside the package.
    // If you do not specify any access level, it will be the default.
    // protected: The access level of a protected modifier is within the package
    // and outside the package through child class.
    //Public: From everywhere.
    // It can be accessed from within the class, outside the class, within the package and outside the package.
    /*
    private int SSN;
    int SSN; ==> default
    protected int SSN;
    public int SSN;
     */

    //Fields
    public String UnitNumber;
    public String StreetNumber;
    public String StreetName;
    public String PostalCode;


    //Methods

    // GetFullAdress : this method will return your full adress
    //Return Type = String
    //No parameter

    //publicOrPrivate staticOrNot ReturnType MehodName(parameterType
    public String GetFullAdress(){
        return UnitNumber+" "+StreetNumber+" "+StreetName+" "+PostalCode;
    }
}
