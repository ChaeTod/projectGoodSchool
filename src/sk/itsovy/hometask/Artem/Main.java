/**
 *  Program uses byte variables in calculations and it doesn't looks good. But I have no time for asking about it. Change it later if there is a need.
 *  Class main - the point of entering the program. From the beginning, the program starts to read the data from the file students.dat.
 *  To avoid the crash of the program we're working with the file in try-catch block.
 *  Try statement allows to test a defined block of code for errors while it's been executed.
 *  Catch statement allows to define a block of code which will be executed if any error occurs in the Try block.
 *  Program reads and writes the data from the file into a list of students.
 *  After this, executing methods to work with written data are started.
 */
package sk.itsovy.hometask.Artem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create an object type School
        School topGrade = new School();
        try {
            File myFile = new File("src\\sk\\itsovy\\hometask\\Artem\\students.dat");
            Scanner in = new Scanner(myFile);  // it started to read from the begging - \n - symbol of the field end
            while (in.hasNextLine()) {
                String data = in.nextLine(); // save to the data all of the line and then go further
                String[] arrOfStr = data.split(" ", 6);  // get spliced data from the file by spaces
                System.out.println(data);

                Student student1 = new Student(arrOfStr[0], arrOfStr[1], (byte) arrOfStr[2].charAt(0),
                        (byte) arrOfStr[3].charAt(0), (byte) arrOfStr[4].charAt(0),
                        Integer.parseInt(arrOfStr[5])); // write the read text data from the file to the variables in class Student
                topGrade.addStudent(student1);
            }
            in.close(); // when we finished to work with the file, you should close it down!

        } catch (FileNotFoundException e) {
            e.printStackTrace(); // write the details about the error to error's window
        }

        // An example of executing all of the methods
        topGrade.getStudent();
        System.out.println("----------------------------------------");
        System.out.println("Best student: " + topGrade.getTheBestStudent());
        System.out.println("Average absence: " + topGrade.getAverageAbsence());
        System.out.println("Average grade: " + topGrade.getAverageGrade());
        System.out.println("Average grade from math: " + topGrade.getAverageGradeFromMath());
        System.out.println("Worst student: " + topGrade.getTheWorstStudent());
        System.out.println("Lowest absence: " + topGrade.getLowestAbsence());
        System.out.println("-----------------------------------------");
        System.out.println("Sorted by last name: " + topGrade.getListSortedByLastNameAsc());
        System.out.println("Sorted by highest absence: " + topGrade.getListSortedByAbsenceDesc());

    }
}
