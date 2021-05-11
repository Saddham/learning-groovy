package com.saddham.closures

import com.saddham.helloworld.Person

class Closures {
    static void main(String[] args) {
        Person john = new Person()
        john.setFirstName("John")
        john.setLastName("Doe")
        john.setAge(40)

        Closure johnToString = { Person person ->
            println person.toString()
        }
        handlePerson(johnToString, john)

        Closure johnFullName = { Person person ->
            println person.getFullName()
        }
        handlePerson(johnFullName, john)
    }

    static void handlePerson(Closure c, Person p) {
        if(p == null)
            throw new RuntimeException("A person instance cannot be null")
        c(p)
    }
}
