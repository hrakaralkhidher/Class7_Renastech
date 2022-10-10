package Day7_SwitchStatements;

public class Topic3_SwitchExamples {
    public static void main(String[] args) {

        // write a code where it prints the name of the day based on the weeks day.

        int day = 5; // each day represent a day, whatever day you put as value it will run that code

        switch (day){
            case 1:
                System.out.println(" the 1st day of the week is Monday");
                break;
            case 2:
                System.out.println(" the 2nd day of the week is Tuesday");
                break;
            case 3:
                System.out.println(" the 3rd day of the week id Wednesday");
                break;
            case 4:
                System.out.println(" the 4th day of the week is Thursday");
                break;
            case 5:
                System.out.println(" the 5th day of the week is Friday");
                break;
            case 6:
                System.out.println(" the 6th day of the week is Saturday");
                break;
            case 7:
                System.out.println(" the 7th day of the week is Sunday");
                break;
            default:
                System.out.println(" Invalid Day of the Week");
        }
    }
}
