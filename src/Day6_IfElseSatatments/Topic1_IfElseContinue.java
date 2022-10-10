package Day6_IfElseSatatments;

public class Topic1_IfElseContinue {
    public static void main(String[] args) {
        // write a code where determines students grade based on the point they recieved
        // 90 - 100 is A
        //80 - 90 is B
        //70 - 80 is C
        //60 - 70 is D
        //rest is F
        // also if the given point is greater than 100 or less than 0 print "not Valid point"

        double points = 23;
        if (points<0 || points>100){ // this code will execute if non of the conditions are true
            System.out.println("Not valid points");
        } else if (points>=90) {
            System.out.println("the Grade is A");
        } else if (points>=80) {
            System.out.println("the Grade is B");
        } else if (points>=70) {
            System.out.println("the Grade is C");
        } else if (points>=60) {
            System.out.println("the Grade is D");
        }else {
            System.out.println("the Grade is F");
        }
    }
}
