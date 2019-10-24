package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;
    private String numberOfExamsTaken;

    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<Double>( Arrays.asList( examScores ) );
    }

    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public void addExamScore(double examScores) {
        this.examScores.add( examScores );

    }

    public void setExamScore(int i, double v) {
        examScores.set( i,v );
    }

    public double getAverageExamScore() {



        double sum = 0;

        for(int avExamScore = 0; avExamScore < this.examScores.size(); avExamScore++){


            sum += this.examScores.get( avExamScore );
        }


        return sum / examScores.size();
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", examScores=" + examScores +
                ", numberOfExamsTaken='" + numberOfExamsTaken + '\'' +
                '}';
    }
}
