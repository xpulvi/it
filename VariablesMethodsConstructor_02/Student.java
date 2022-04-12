package it.VariablesMethodsConstructor_02;

public class Student {

    /*le variabili di classe si mettono quasi sempre private
    * e si fa la richiesta tramite con get le altre classi*/
    public String name;
    private int grade;

    public void studentName (String name, int grade){

    }

    public void setGrade(int grade) {
         this.grade = grade;
    }

    public String getStudentDetails(){
       return name + grade;
    }

}
