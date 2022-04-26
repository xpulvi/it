package it.interfaces;

public class Student extends CollegePerson implements ILearningPerson{

    @Override
    public void studyAtHome() {
        System.out.println("details: " );
    }
    int academicYear;
    public Student(String name, String surname, int id, int year){
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.academicYear = year;
    }
}
