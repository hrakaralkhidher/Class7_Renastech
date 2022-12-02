package Day26_ClassesAndConstructors;

import CustomClasses.AnimalClass;
import CustomClasses.StudentClass;

public class Topic3_StudentExampleClass {
    public static void main(String[] args) {
        StudentClass MyStudent = new StudentClass();
        MyStudent.Name = "Sefa";
        MyStudent.StudentNumber = "928";


        AnimalClass MyAnimal = new AnimalClass("Linon", "Cat");
//        MyAnimal.Amethod("Something");>>>>> this is when you create a method instead of constructor
        System.out.println(MyAnimal.AnimalName);
        /*
        I dont need this code as i can define the name and taype on Created constructor
        MyAnimal.AnimalName = "Lion";
        MyAnimal.AnimalType = "Cat";
         */
        AnimalClass MyPenguin = new AnimalClass("penguin","Bird","White_Black");
        System.out.println(MyPenguin.AnimalName+" "+MyPenguin.AnimalType+" "+MyPenguin.AnimalColor);

        /*
        I dont have to type below lines as we are assigning them in Constroctor
        MyPenguin.AnimalName = "Penguin";
        MyPenguin.AnimalType = "Bird";
        MyPenguin.AnimalColor = "White-Black";
         */
    }
}
