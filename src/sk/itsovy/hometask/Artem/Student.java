/**
 * Class Student - class that contains a data from each student.
 * Class Student extends an abstract class Person and keyword super to get access the parent class constructor.
 */
package sk.itsovy.hometask.Artem;

public class Student extends Person {

    // Instance variables
    private byte g_Mat;
    private byte g_Eng;
    private byte g_Inf;
    private int absence;

    // Constructor
    public Student(String firstName, String lastName, byte g_Mat, byte g_Eng, byte g_Inf, int absence) {
        super(firstName, lastName);
        this.g_Mat = g_Mat;
        this.g_Eng = g_Eng;
        this.g_Inf = g_Inf;
        this.absence = absence;
    }

    // An overriding method toString() - changes in the final result that will be displayed in the cookie
    @Override
    public String toString() {
        return getFullName() + ". Math marks: " + getG_Mat() + ". English Marks: " + getG_Eng() + ". Inf marks: " + getG_Inf() + ". Absence num: " + getAbsence()+ ". Average grade: " +getAverageGrade();
    }

    // Getters
    public byte getAverageGrade() {
        return (byte) ((g_Mat + g_Eng + g_Inf) / 3);
    }

    public byte getG_Mat() {
        return g_Mat;
    }

    public byte getG_Eng() {
        return g_Eng;
    }

    public byte getG_Inf() {
        return g_Inf;
    }

    public int getAbsence() {
        return absence;
    }
}
