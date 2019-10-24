package io.zipcoder;

public class StudentTest {
    public static void main(String[] args) {

        String firstNAme = "Sean";
        String lastNAme = "PRice";
        Double [] examScores = {90.0, 65.0, 76.0, 85.0};
        Student student = new Student( firstNAme,lastNAme,examScores );




        double output = student.getAverageExamScore();

        System.out.println(output);
    }

}