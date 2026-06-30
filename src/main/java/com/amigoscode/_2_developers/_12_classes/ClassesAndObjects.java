package com.amigoscode._2_developers._12_classes;
import java.sql.SQLOutput;
import java.util.Objects;
/**
 * Classes and Objects Exercises
 *
 * Practice creating classes with fields, constructors, and methods.
 * Learn about constructor chaining, toString(), and equals().
 */
public class ClassesAndObjects {
    // TODO: 1 - Create a static inner class called Person with:
    //  - A private String field 'name'
    //  - A private int field 'age'
    static class Person {
        private String name;
        private int age;


        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && Objects.equals(name, person.name) && Objects.equals(otherPerson, person.otherPerson);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, otherPerson);
        }

        // TODO: 2 - Add a constructor to Person that takes String name and int age,
        //  and assigns them to the fields.
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // TODO: 3 - Add a no-args constructor to Person that sets name to "Unknown"
        //  and age to 0. Use constructor chaining — call the other constructor
        //  using this("Unknown", 0) instead of setting fields directly.
        //  (See TODO 7 for more on constructor chaining.)
        Person() {
            this("unknown", 0);
        }

        // TODO: 4 - Add a toString() method to Person that returns:
        //  "Person{name='<name>', age=<age>}"
        //  Annotate with @Override.
        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }

        // TODO: 5 - Add an equals() method to Person that:
        //  - Returns true if the other object is a Person with the same name and age
        //  - Handles null and different types correctly
        //  - Annotate with @Override
        //  Hint: use instanceof, then cast and compare fields.
        //  Also override hashCode() using Objects.hash(name, age).
        // onj1 == obj 2 we dont want to do this, this is comparing their memory addresses, where they live, inside the heap


        public static void main(String[] args) {
            // TODO: 6 - Create at least three Person objects:
            //  - One using the two-arg constructor (e.g., "Alice", 30)
            //  - One using the no-args constructor
            //  - One with the same name and age as the first
            //  Print all three using System.out.println() (which calls toString()).
            //  Test equals(): compare person1 with person3 (should be true),
            //  and person1 with person2 (should be false).
            //  Print the comparison results.

            Person personA = new person("Alice", 32);
            Person personB = new person();
            Person personC = new person("Allice, 32");


            System.out.println(personA);
            System.out.println(personB;
            System.out.println(personC);
            System.out.println(personA.equals(personC));



            // TODO: 7 - Demonstrate constructor chaining with this():
            //  Add a comment explaining what constructor chaining is:
            //  When a constructor calls another constructor in the same class using this(...),
            //  it avoids duplicating initialization logic.
            //  The no-args constructor you created in TODO 3 already demonstrates this.
            //  Print: "No-args person: " + the no-args person to show the defaults.

        }
    }
}