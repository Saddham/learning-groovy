package com.saddham.annotations

import com.saddham.helloworld.Person

class Annotations {
    static void main(String[] args) {
        Person john = new Person()
        john.setFirstName("John")
        john.setLastName("Doe")
        john.setAge(40)

        //assert john.toString() == "Person{firstName='John', lastName='Doe', age=40}"
        assert john.toString() == "com.saddham.helloworld.Person(John, Doe, 40, John Doe)"
        assert john.equals(john)
        assert !john.equals(new Person(firstName: "Marry", lastName: "Hill", age: 40))
    }
}
