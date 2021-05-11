package com.saddham.collections

import com.saddham.helloworld.Person

class Collections {
    static void main(String[] args) {
        Person johnDoe = new Person("John", "Doe", 40)
        Person marryHill = new Person("Marry", "Hill", 30)
        Person thomasMarks = new Person("Thomas", "Marks", 35)

        def allPersons = [johnDoe, marryHill, thomasMarks]

        assert allPersons instanceof List
        assert allPersons.size() == 3
        assert allPersons[2] == thomasMarks

        allPersons.each {
            println it

        }

        allPersons.eachWithIndex { Person entry, int i ->
            println i + ": " + entry
        }

        println allPersons.find{it.lastName == "Hill"} // == marryHill

        println allPersons.collect{it.age <= 30 } // == [false, true, false]

        println allPersons.sort{it.age} // == [marryHill, thomasMarks, johnDoe]
    }
}
