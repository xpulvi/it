package it.VariablesMethodsConstructor_02;

public class Teacher {

    String teacherName;
    Teacher teacher = new Teacher();

    public String getTeacherName() {
        return teacherName;
    }

    public void assignGrade(Student alum, int finalGrade){
        alum.setGrade(finalGrade);
    }

}
