package it.wildcards_01;

import java.util.List;

public class Student {

    String studentName;
    String studentSurname;
    double marksAverage;

    //metodo costrutore
    public Student(String name, String surname, double average){
        this.studentName = name;
        this.studentSurname = surname;
        this.marksAverage = average;
    }

    public static getAverageMark(List listOfMarks){

        double listOfMarks;
        /*- calculates the average using:
    - `listOfMarks.get(0).doubleValue()` to get the first value from the list
    - `listOfMarks.get(1).doubleValue()` to get the second value from the list
    - the arithmetic summation operator and the arithmetic division operator
        * */
        listOfMarks.get(0).doubleValue();

        listOfMarks.get(1).doubleValue();

        return this.marksAverage;
    };

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", marksAverage=" + marksAverage +
                '}';
    }

    /*- considering that:
    - there are two types of marks for the students:
        - a`List` of 2 `Double` elements for **individual marks**
        - a `List` of 2 `Integer` elements for **project marks**
    - `Lisa Stuart` has a `List` called `individualMarksListLisa` of **individual marks**
    - `Jeremy Green` has a `List` called `projectMarksListJeremy` of **project marks**
    * */


}
