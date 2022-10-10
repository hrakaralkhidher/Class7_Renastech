package Day7_SwitchStatements;

public class Topic4_SwitchStatementContinue {
    public static void main(String[] args) {
        // break is where the code stop executing the code  inside  the switch statement
        int day = 1; // this is a example without the break; cuz there are cases when we cant use break;
        int hours = 12;

        switch (day){
            case 1:
                switch(hours){ // nested switch statement
                    case 12:
                        System.out.println(" this is day 1 monday hours is 12");
                        break;
                    default:
                        System.out.println("Invalid hours");
                }
                System.out.println(" the 1st day of the week is Monday");
            case 2:
                System.out.println(" the 2nd day of the week is Tuesday");
            case 3:
                System.out.println(" the 3rd day of the week id Wednesday");
                break;
            case 4:
                System.out.println(" the 4th day of the week is Thursday");
            case 5:
                System.out.println(" the 5th day of the week is Friday");
            case 6:
                System.out.println(" the 6th day of the week is Saturday");
            case 7:
                System.out.println(" the 7th day of the week is Sunday");
            default:
                System.out.println(" Invalid Day of the Week");
        }
    }
}
