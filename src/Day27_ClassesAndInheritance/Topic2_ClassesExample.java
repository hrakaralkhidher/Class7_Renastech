package Day27_ClassesAndInheritance;

import CustomClasses.StudentClass;

public class Topic2_ClassesExample {
    public static void main(String[] args) {
        //we will create 2 students
        //we will give them some howeworks
        //we will point their homeworks
        //we will check if they passed or not

        StudentClass FirstStudent = new StudentClass();
        FirstStudent.Name = "Hayri";
        FirstStudent.StudentNumber = "1";

        FirstStudent.AddHomeWorkResult(50);
        FirstStudent.AddHomeWorkResult(5);
        FirstStudent.AddHomeWorkResult(23);
        FirstStudent.AddHomeWorkResult(80);

        StudentClass SecodStudent = new StudentClass();
        SecodStudent.Name = "George";
        SecodStudent.StudentNumber = "2";
        SecodStudent.AddHomeWorkResult(90);
        SecodStudent.AddHomeWorkResult(98);
        SecodStudent.AddHomeWorkResult(87);

        if(FirstStudent.GetMean()>=70){
            System.out.println(FirstStudent.Name+" Passed");

        }else {
            System.out.println(FirstStudent.Name+" Failed");
        }
        if(SecodStudent.GetMean()>=70){
            System.out.println(SecodStudent.Name+" Passed");

        }else {
            System.out.println(SecodStudent.Name+" Failed");
        }


    }
}
