package com.saddham.helloworld

class HelloWorld {
    static void main(String[] args) {
        println "Hello World"

        int age = 40

        println age

        println age.getClass()

        def name = "John "

        print name

        println name.getClass()


        Person john = new Person()
        john.setFirstName("John")
        john.setLastName("Doe")
        john.setAge(40)

        println(john.getFullName() + " " + john.age)

        if(john.getAge() >= 45 && john.getAge() <= 65)
            println john.getFullName() + " is middle aged"
        else
            println john.getFullName() + " is " + john.getAge() + " years old"

        def persons = [john, new Person(firstName: "Mary", lastName: "Hill", age: 40)]

        for(Person p : persons)
            println p.getFullName()

        try {
            john.getFullName().toLong()
        } catch(NumberFormatException exception) {
            println "Cannot convert string to long"
        }

        println(john.getFullName().dropRight(4))

    }

}
