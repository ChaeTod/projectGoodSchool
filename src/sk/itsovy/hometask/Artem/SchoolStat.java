/**
 * SchoolStat - is an interface class which has only abstract methods - all methods here are public and abstract.
 * In some class can be implemented any number of interfaces.
 * Usually interfaces are using for multiple inheritance.
 * In my example I have several different realizations for the same method in several subclasses.
 * By using this interface I know how it should be looking - like a template from this interface class.
 */

package sk.itsovy.hometask.Artem;

import java.util.List;

public interface SchoolStat {
    public Student getTheBestStudent();
    public int getAverageAbsence();
    public double getAverageGrade();
    public double getAverageGradeFromMath();
    public Student getTheWorstStudent();
    public int getLowestAbsence();
    public List getListSortedByLastNameAsc();
    public List getListSortedByAbsenceDesc();
}
