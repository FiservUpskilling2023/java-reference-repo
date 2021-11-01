package ProgramControl.Models;

import java.util.Objects;

public class Person {

    public String name; // Data Member

    public Person(String name) { // Constructor
        this.name = name;
    }

    @Override
    public String toString() { // Overriding a base class method called toString()
        return this.name;
    }

    @Override
    public boolean equals(Object o) { // Required for .equals()
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
