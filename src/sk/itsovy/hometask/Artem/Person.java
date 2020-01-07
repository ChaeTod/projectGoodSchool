/**
 * Person - is an abstract class which contain two instance variables, constructor and three methods.
 * Person is an abstract class, because it contain similar for every common person statements.
 * In my example - every future student will have the first name and the last name. Still we don't know what student and which names specifically he will have.
 * All we know is that every Person usually have a name and a second name.
 * Abstract class Person is inherited by the Student class, where Person's variables and methods will have specific values.
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
        return firstName + " " + lastName;
    }
}
