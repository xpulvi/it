package it.If_Statement_3;

import java.util.Random;

public class Student {

    protected String name;
    protected Integer age;

    protected Student(String studentName, Integer studentAge) {
        this.name = studentName;
        this.age = studentAge;
    }

    /*a method guessingAge that:
generates a random integer (using java.util.Random and nextInt())
 that has 35 as upperbound
prints the random value generated for name
(e.g. I generated the random number X for student Y)

     */
    protected Integer guessingAge(){
        Random random = new Random();
        int n = random.nextInt();

    if (n <=35 || n > 0 ){
            System.out.println("I generated the random number X for student Y " + n );
        }
    return n;
    }

}


