/**
 * Method addStudent - add new students.
 * Method getAverageAbsence() - find and return the average number of absences.
 * Method getTheBestStudent() - find and return the student with the best grades.
 */
package sk.itsovy.hometask.Artem;

import java.util.ArrayList;
import java.util.List;

public class School implements SchoolStat {

    // Instance variables of the class
    private List<Student> s1;
    private int count;

    // Method to add new students
    public void addStudent(Student student) {
        s1.add(student);
        count++;
    }

    // Constructor
    public School() {
        s1 = new ArrayList<>();
        this.count = 0;
    }

    public List<Student> getS1() {
        return s1;
    }

    // Get the number of a count variable
    public int getCount() {
        return count;
    }

    // Implemented interface
    @Override
    public Student getTheBestStudent() {
        Student student = (Student) s1;
        for (int i = 0; i < s1.size(); i++){
            if (getAverageGrade() <= 5)
                return student;
        }
        //return null;
    }

    @Override
    public int getAverageAbsence() {
        double avgNum = 0;
        Student student = (Student) s1; /* Ugly code! Fix this! */
        for (int i = 0; i < s1.size(); i++) {
            avgNum = student.getAbsence() + avgNum;
        }

        return (int) avgNum / count;
    }

    @Override
    public double getAverageGrade() {
        double avgNum = 0;
        Student student = (Student) s1; /* Ugly code! Fix this! */
        for (int i = 0; i < s1.size(); i++) {
            avgNum = student.getG_Mat() + avgNum;
        }

        return avgNum / count;
    }

    @Override
    public double getAverageGradeFromMath() {
        return 0;
    }

    @Override
    public Student getTheWorstStudent() {
        return null;
    }

    @Override
    public int getLowestAbsence() {
        return 0;
    }

    @Override
    public List getListSortedByLastNameAsc() {
        return null;
    }

    @Override
    public List getListSortedByAbsenceDesc() {
        return null;
    }
}
