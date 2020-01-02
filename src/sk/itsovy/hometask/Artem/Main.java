/**
 *
 *
 */
package sk.itsovy.hometask.Artem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        School topGrade = new School();

        try {
            File myfile = new File("students.dat");
            Scanner in = new Scanner(myfile);  //it started to read from the begging - \n - symbol of the field end
            while (in.hasNextLine()){
                String data = in.nextLine(); //save to the data all of the line and then go further
                String[] arrOfStr = data.split(" ", 6);
                System.out.println(data);

                Student student1 = new Student(arrOfStr[0], arrOfStr[1], (byte) arrOfStr[2].charAt(0), (byte) arrOfStr[3].charAt(0), (byte) arrOfStr[4].charAt(0), Integer.parseInt(arrOfStr[5]));
                topGrade.addStudent(student1);
            }
            in.close(); //when we finished to work with the file, you should close it down!

        } catch (FileNotFoundException e){
            e.printStackTrace(); //write the details about the error to error's window
        }

        topGrade.getS1();
        System.out.println("Best student: " +topGrade.getTheBestStudent());
        System.out.println("Average absence: " +topGrade.getAverageAbsence());
        System.out.println("Average grade: " +topGrade.getAverageGrade());
        System.out.println("Average grade from math: " +topGrade.getAverageGradeFromMath());
        System.out.println("Worst student: " +topGrade.getTheWorstStudent());
        System.out.println("Lowest absence: " +topGrade.getLowestAbsence());
        System.out.println("Sort by last name: " +topGrade.getListSortedByLastNameAsc());
        System.out.println("Sort by absence: " +topGrade.getListSortedByAbsenceDesc());

    }
}
