package it.interfaces.entities;

import it.interfaces.ITeachingPerson;

public class Professor extends CollegePerson implements ITeachingPerson {


    @Override
    public void teachToOtherPeople() {
        System.out.println("Professor: " + name + surname + "teach To Other People");
    }
    String teachingSubject;

    public Professor(String name, String surname, int id, String subject){
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.teachingSubject = subject;
    }

}
