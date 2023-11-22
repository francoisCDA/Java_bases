package org.example.exercice.exoPoo.TpClassChaise.tpHeritage;


public class Teacher extends Person {


    private String subject;


    public Teacher(int age) {
        super(age);

    }

    public void Explain() {
        System.out.printf("Explanation begins");
    }

}
