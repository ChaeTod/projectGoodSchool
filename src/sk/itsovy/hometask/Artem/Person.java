/**
 *
 */
package sk.itsovy.hometask.Artem;

public abstract class Person {

    // Instance variables
    private String firstName;
    private String lastName;

    // Constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    // Get first and last name of the student = Get full name
    public String getFullName() {
        return firstName + " " +lastName;
    }
}
