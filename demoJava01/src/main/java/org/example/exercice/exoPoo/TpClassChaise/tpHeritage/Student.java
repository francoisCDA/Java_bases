package org.example.exercice.exoPoo.TpClassChaise.tpHeritage;

public class Student extends Person {

    public Student(int age) {
        super(age);
    }

    public void GoToClasses() {
        System.out.println("I'm going to class.");
    }

    public void DisplayAge() {
        System.out.printf("My age is: %d years old\n",this.age);
    }

}
