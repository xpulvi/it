package it.ClassesAndObjects_02;

public class Team {

    public String teamName;

    //objects  programer
    Programmer p1 = new Programmer();
    Programmer p2 = new Programmer();

    public void printTeamDetails(){

        System.out.println("team name: " + teamName );

        System.out.println("   -----   ------  ");
        p1.printProgrammerDetails();
        p2.printProgrammerDetails();
    }
}
