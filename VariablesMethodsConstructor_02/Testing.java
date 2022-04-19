package it.VariablesMethodsConstructor_02;

public class Testing {

    public static void main(String[] args) {


        //studenti
        Student marco = new Student();

        Student luca = new Student();

        //docente
        Teacher giovani = new Teacher();

        //grade student
        marco.setGrade(5);
        luca.setGrade(2);

        //assign a name to the teacher
        giovani.teacherName("giovani dalesio");

        //student name
        marco.setStudentName("marco ranzatoa ");
        luca.setStudentName("luca mastrota ");

        System.out.println("student details: " + marco.getStudentDetails());
        System.out.println("student details: " + luca.getStudentDetails());

    }


}