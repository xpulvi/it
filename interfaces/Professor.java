package it.interfaces;

public class Professor extends CollegePerson implements ITeachingPerson{


    @Override
    public void teachToOtherPeople() {

    }
    String teachingSubject;

    public Professor(String name, String surname, int id, String subject){
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.teachingSubject = subject;
    }

}
