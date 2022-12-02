package Day25_Classes;

public class Topic3_Static {
    public static void main(String[] args) {
        RenasTechStudentRegistrationForm MyForm = new RenasTechStudentRegistrationForm();
        MyForm.Name = "Hrakar";
        MyForm.Surname = "Khidher";
        System.out.println(MyForm.Name);
        System.out.println(MyForm.School);

        RenasTechStudentRegistrationForm MyNewForm = new RenasTechStudentRegistrationForm();
        System.out.println(MyNewForm.Name);
    }
}
class RenasTechStudentRegistrationForm{
    /*
    The static keyword in java mainly used for memory managements.
    The static variable can be used to refer the common property of all objects
    (which is  not unique for each object)
    in other words, a static field is shared by all copies of the class .thus all see the same

    for example: the company name, college name etc.
    Suppose there are 500 students in the college. That mean 500 students registration form
    Now all fields will get memory each time when you create the Object (Your registration form)
    All students have it's unique Name and SurName. So copy of Fields are good in such case.
    Here "School" refers to the common field of all copy of Objects.
    If we make it static , this field will get memory only once.
     */
    String Name;
    String Surname;
   static String School = "RenasTech";
}
