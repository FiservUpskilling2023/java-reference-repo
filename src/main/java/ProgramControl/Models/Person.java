package ProgramControl.Models;

public class Person {

    public String name; // Data Member

    public Person(String name) { // Constructor
        this.name = name;
    }

    @Override
    public String toString() { // Overriding a base class method called toString()
        return this.name;
    }
}
