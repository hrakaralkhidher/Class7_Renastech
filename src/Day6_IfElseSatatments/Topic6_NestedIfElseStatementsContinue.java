package Day6_IfElseSatatments;

public class Topic6_NestedIfElseStatementsContinue {
    public static void main(String[] args) {
        // last name = Doe, Yilmaz , Ekinci,
        // last name is yilmaz and the age is over 20 print the last name and the age if not just print the name
        // if last name is Doe and the age is over 10 print just the last name if not print just age
        // if it is ekinci print last ame and age.

        String lastname = "ekinci";
        int age = 10;

        if(lastname == "yelmaz"){
            if(age>20){
                System.out.println("the lastname is: "+lastname+ " the age is: "+age);
            }else {
                System.out.println("just lastname : "+lastname);
            }
        } else if (lastname == "Doe") {
            if(age>10){
                System.out.println("just the lastname: "+lastname);
            }else{
                System.out.println("just the age"+age);
            }
        }else{
            System.out.println(" lastname: "+lastname+" age: "+age);
        }
    }
}
