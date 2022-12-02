package Day28_InheritanceAndAbstruction;

import CustomClasses.Rectangleclass;
import CustomClasses.SquareClass;

public class Topic1_InheritanceExample {
    /*
    Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and
     perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is
      used to initialize length and breadth of the rectangle.
     */
    public static void main(String[] args) {
        Rectangleclass MyRectangle = new Rectangleclass(4,5);
        MyRectangle.PrintArea();
        MyRectangle.PrintPerimeter();


        SquareClass MySquare = new SquareClass(5);
        MySquare.PrintArea();
        MySquare.PrintPerimeter();
    }
}
