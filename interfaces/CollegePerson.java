package it.interfaces;

public class CollegePerson {

    private String name;
    private String surname;
    private int collegeId;

    public void goToCollege(){
        System.out.println("CollegePerson: " + name + surname + collegeId);
    }
}
