package it.interfaces.entities;

public class CollegePerson {

    public String name;
    public String surname;
    public int collegeId;

    public  String goToCollege(){
        //System.out.println("CollegePerson: " + name + surname + collegeId);
        return "CollegePerson: " + name + surname + collegeId ;
    }
}
