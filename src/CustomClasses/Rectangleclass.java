package CustomClasses;

public class Rectangleclass {
    //Encapsulation are the bottom list
    //public, private, protected and default
    public int length;
    public int Breadth;

    ///create a constructor
    //will take 2 parameters
    //public className(ParameterType ParametersName....)

    public Rectangleclass(int param1, int param2){
        length = param1;
        Breadth = param2;
    }



    ///PrintArea : This method will print the area of Rectagle
    ///Return Type = void;
    ///no parameter

    //publicOrPrivate staticOrNot ReturnType methodname(ParameterType ParameterName....
    public void PrintArea (){
        System.out.println("The area = "+(length*Breadth));
    }

    ///PrintPerimeter : This Method will print perimeter of Rectangle
    //Return Type void
    //no parameter
    ///2(l+b)
    public void PrintPerimeter(){
        System.out.println("The Perimeter = "+(2*(length+Breadth)));
    }
}
