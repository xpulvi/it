package it.interfaces;

public class Assistant extends CollegePerson implements ITeachingPerson{

    @Override
    public void teachToOtherPeople() {
        System.out.println("Assistant sta usando: teachToOtherPeople");
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
