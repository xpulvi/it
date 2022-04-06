package it.ClassesAndObjects_02;

public class Competition {

    public static void main(String[] args) {


        System.out.println("---------------------");
        CompetitionRules competitionRules = CompetitionRules.getInstance();
       competitionRules.printRules();

        Team teamA = new Team();
        Team teamB = new Team();

        //teamA poppolazione detagli
        teamA.teamName = "the Big Beng Teory  ";
        teamA.p1.name = "Howard Wolowitz  ";
        teamA.p1.yearsOfExperience = 5;
        teamA.p1.programmingLanguage = "php ";

        teamA.p2.name = "barry kripke";
        teamA.p2.yearsOfExperience = 3;
        teamA.p2.programmingLanguage = "c++ ";

        //teamB poppolazione detagli
        teamB.teamName = "pied piper";
        teamB.p1.name = "richard hendricks ";
        teamB.p1.yearsOfExperience = 7;
        teamB.p1.programmingLanguage = "java  ";

        teamB.p2.name = "gil foylee  ";
        teamB.p2.yearsOfExperience = 10;
        teamB.p2.programmingLanguage = "python ";

        teamA.printTeamDetails();
        teamB.printTeamDetails();
    }

}
