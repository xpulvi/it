package it.VariablesMethodsConstructor_02;

public class Student {

    /*le variabili di classe si mettono quasi sempre private
     * e si fa la richiesta tramite con get le altre classi*/
    public String name;
    public int grade;

    /*
     * takes a studentName parameter and assign it to the object's instance variable name
     * */
    public void setStudentName(String name){
        this.name = name;
    }


    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getStudentDetails(){
        return name + grade;
    }

}