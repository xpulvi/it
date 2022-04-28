package it.interfaces.entities;

import it.interfaces.ITeachingPerson;

public class Assistant extends CollegePerson implements ITeachingPerson {

    @Override
    public void teachToOtherPeople() {
        System.out.println("Assistant: " + name + surname + "teach To Other People");
    }

    boolean isGoingToBeAPhD;

    //metod costractor Assistant
    public Assistant(String name, String surname, int id, boolean willBeAPhD){
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.isGoingToBeAPhD = willBeAPhD;

    }
}
