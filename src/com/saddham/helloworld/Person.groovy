package com.saddham.helloworld

import groovy.transform.Canonical
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.TupleConstructor

/*@ToString
@EqualsAndHashCode
@TupleConstructor*/
@Canonical
class Person {
    String firstName
    String lastName
    int age

    String getFullName() {
        return firstName + " " + lastName
    }

/*    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }*/

/*    boolean equals(o) {
        if (this.is(o)) return true
        if (getClass() != o.class) return false

        Person person = (Person) o

        if (age != person.age) return false
        if (firstName != person.firstName) return false
        if (lastName != person.lastName) return false

        return true
    }

    int hashCode() {
        int result
        result = firstName.hashCode()
        result = 31 * result + lastName.hashCode()
        result = 31 * result + age
        return result
    }*/
}
