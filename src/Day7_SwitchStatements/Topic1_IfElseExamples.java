package Day7_SwitchStatements;

public class Topic1_IfElseExamples {
    public static void main(String[] args) {
        // write a code where students are placed in the classes based on individuals preference and knowledge.
        // our school allows students to have only one prefe
        String FirstName = "Hrakar";
        String Prefer = "DA";
        int level = 3;

        if(Prefer== "QA"){
            if(level == 1){
                System.out.println(FirstName+ " is placed in beginner level Class for QA");
            }else if (level == 2){
                System.out.println(FirstName+ " is placed in Mid level class for QA");
            }else{
                System.out.println(FirstName+ " is placed in Advanced level class for QA");
            }

        } else if (Prefer == "SE") {
            if(level == 1){
                System.out.println(FirstName+ " is placed in beginner level Class for SE");
            } else if (level == 2) {
                System.out.println(FirstName+ " is placed in Mid level class for SE");
            }else{
                System.out.println(FirstName+ " is placed in Advanced level class for SE");
            }

        }else if( Prefer == "DA"){
            if(level == 1){
                System.out.println(FirstName+ " is placed in Advanced level class for DA");
            } else if (level == 2) {
                System.out.println(FirstName+ " is placed in Mid level class for DA");
            }else {
                System.out.println(FirstName+ " is placed in Advanced level class for DA");
            }

        }else{
            System.out.println("Invalid Selection");
        }
    }
}
