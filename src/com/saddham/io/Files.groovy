package com.saddham.io

import com.saddham.helloworld.Person

public class Files {
    static void main(String[] args) {
        Person johnDoe = new Person()

        File johnDoefile = new File("resources/john-doe.txt")
        println johnDoefile.getText('UTF-8')

        johnDoefile.eachLine {line, no ->
            if(no == 1)
                johnDoe.setFirstName(line)
            else if(no == 2)
                johnDoe.setLastName(line)
            else if(no == 3)
                johnDoe.setAge(line.toInteger())
            else
                throw new RuntimeException("A person text file should only have 3 lines")
        }

        println johnDoe

        File marryHillFile = new File("resources/marry-hill.txt")
        marryHillFile.withWriter("UTF-8") {writer ->
            writer.writeLine("Marry")
            writer.writeLine("Hill")
            writer.writeLine(30.toString())
        }

        marryHillFile.append(1.toString())
        marryHillFile << 2.toString()

        Person thomasMarks = new Person("Thomas", "Marks", 35)
        File thomasMarksFile = new File("resources/thomas-marks.txt")
        thomasMarksFile.withObjectOutputStream {out ->
            out.writeObject(thomasMarks)
        }



    }
}
