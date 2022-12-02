package Day27_ClassesAndInheritance;

import CustomClasses.AddressesClass;
import CustomClasses.EmployeeClass;

public class Topic1_ClassesRcap {
    public static void main(String[] args) {
        AddressesClass MyHomeAddress = new AddressesClass();

        MyHomeAddress.StreetName = "King Street";
        MyHomeAddress.StreetNumber = "102";
        MyHomeAddress.UnitNumber = "2/C";
        MyHomeAddress.PostalCode = "N3G QA1";

        System.out.println(MyHomeAddress.GetFullAdress());

        EmployeeClass MyEmployee = new EmployeeClass();
        MyEmployee.Name = "Eric";
        MyEmployee.HomeAddress.StreetNumber = "5";
        MyEmployee.HomeAddress.StreetName ="Queen Street";

        EmployeeClass AnotherEmployee = new EmployeeClass();
        AnotherEmployee.Name = "Mehmet";
        AnotherEmployee.HomeAddress.StreetName="Church Street";
        AnotherEmployee.HomeAddress.StreetNumber = "101";

        EmployeeClass ThirdEmployes = new EmployeeClass("Eloise","Element", "QA");
        ThirdEmployes.HomeAddress.StreetNumber = "123";
        ThirdEmployes.HomeAddress.StreetName = "College Street";

    }

}
