package io.zipcoder;
import org.junit.Test;


public class ClassroomTest {

    @Test
    public void getExamScores() {
        String firstName = "JAY Z";
        String lastName = "NAS";
        Double[] examScores = {93.0, 87.0, 36.0, 66.0};
        Student student = new Student( firstName, lastName, examScores );

        double output = student.getAverageExamScore();

        System.out.println( output );



    }


    @Test
    public void addExamScore(double examScore){

        String firstName = "JAY Z";
        String lastName = "NAS";
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.addExamScore(100.0);
        double output = student.getAverageExamScore();

        // Then
        System.out.println(output);

    }

    @Test
    public void setExamScore(int examNumber, double newScore){

        // : Given
        String firstName = "JAY Z";
        String lastName = "NAS";
        Double[] examScores = { 100.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.setExamScore(1, 150.0);
        double output = student.getAverageExamScore();

        // Then
        System.out.println(output);
    }

    @Test
    public void getAverageExamScore(){

        // : Given
        String firstName = "JAY Z";
        String lastName = "NAS";
        Double[] examScores = { 100.0, 150.0, 250.0, };
        Student student = new Student(firstName, lastName, examScores);

        // When
        double output = student.getAverageExamScore();

        // Then
        System.out.println(output);
    }


}


