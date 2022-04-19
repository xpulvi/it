package it.VariablesMethodsConstructor_02;

public class Teacher {

    String teacherName;

    public Teacher() {
        System.out.println("creation a Teacher object: teacher");
    }


    public void assignGrade(Student alum, int finalGrade){
        alum.setGrade(finalGrade);
    }


    public void teacherName(String teacherName) {

    }
}