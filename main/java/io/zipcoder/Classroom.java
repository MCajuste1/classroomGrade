package io.zipcoder;

public class Classroom {

    Student[] students;




    public Classroom(int maxNumberofStudents) {

    }



    public Classroom(Student[] students) {

    }




    public Classroom() {

        this.students = new Student[30];
    }






    public double getAverageExamScore() {
        double sum = 0;
        for (int avgExamScore = 0; avgExamScore < students.length; avgExamScore++) {
            sum += students[avgExamScore].getAverageExamScore(); }
        return sum;
    }






    public void addStudent(Student student) {
        for(int s = 0; s < students.length; s++){
            if(students[s] == student){
                students[s] = student;
            }
        }
        {        }
    }



    public void removeStudent(String firstName, String lastName) {
        for (int s = 0; s < students.length; s++) {
            if (students[s].getFirstName().equals( firstName )) students[s].getLastName().equals( lastName ); }
    }




    public void getStudentByScore() {
        for (int counter = students.length; counter <= students.length; counter--) {
            for(Student student : students){
                if(student.getAverageExamScore() > 0){
                    students[counter] = new Student( null,null,null );
                }
            }
        }
    }
}