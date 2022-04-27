package com.xpanxion.java.intro.models;

import java.util.Objects;

public class Person {

    //
    // Data members
    //

    public String name;

    //
    // Constructors
    //

    public Person(String name) { // Constructor
        this.name = name;
    }

    //
    // Accessors
    //

    public void setName(String name) {
        this.name = name;
    }

    //
    // Overrides
    //

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
    } // Required for .equals()
}
