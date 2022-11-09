package Day21_MethodsAndMethodOverLoad;

public class Topic2_MethodExample {
    public static void main(String[] args) {


        double average=(calculateAverage(13,14));
        System.out.println(analyseAverage(average));
        if (analyseAverage(average) == "Your grade is low,You need to study harder"){
            System.out.println("SUCCESS");
        }

    }
    //calculate Average
    // 2 input
    //mid-term, final
    private static double calculateAverage(double midTermExam,double finalExam){

        double average = (midTermExam+finalExam)/2;

        return average;
    }
    //analyse Average
    //50 Your grade is low, you need to study harder
    //50-75 Your grade is not bad, but you can study more
    //75-100 YOur grade is perfect , and keep studying

    private static String analyseAverage(double average){
        String category = "";

        if(average <= 49.99 && average >= 0) {
            category = "Your grade is low,You need to study harder";
        } else if (average <= 74.99 && average >= 50) {
            category = "Your grade is not bad, but you can study more";
        } else if (average <= 100 && average >= 75) {
            category = "Your grade is perfect, and keep studying";
        }
        return category;
    }



}
