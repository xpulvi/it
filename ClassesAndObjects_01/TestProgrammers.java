package it.ClassesAndObjects_01;



public class TestProgrammers {

    public static void main(String[] args) {


        Programmer DennisRitchie = new Programmer();
        DennisRitchie.name = "Dennis Ritchie";
        DennisRitchie.age = 70;
        DennisRitchie.wearsGlasses = true;
        DennisRitchie.isAlive = false;

        System.out.println("                 ");
        DennisRitchie.DrinkCoffe();
        DennisRitchie.printDetails();

        System.out.println("         ");

        Programmer RichardStallman = new Programmer();
        RichardStallman.name = "Richard Stallman";
        RichardStallman.age = 69;
        RichardStallman.wearsGlasses = false;
        RichardStallman.isAlive = true;

        RichardStallman.printDetails();
        RichardStallman.hasGlasses();

    }
}
