package it.interfaces;

public class CollegePerson {

    public String name;
    public String surname;
    public int collegeId;

    public void goToCollege(){
        System.out.println("CollegePerson: " + name + surname + collegeId);
    }
}
