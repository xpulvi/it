package it.ClassesAndObjects_02;

// this class nsme
public class CompetitionRules {

    //
    private static CompetitionRules competitionRules = new CompetitionRules();

    private CompetitionRules(){};
    public static CompetitionRules getInstance(){
        return competitionRules;
    }

    private String competitionRule1 = "Do not copy and paste from StackOverflow!" ;
    private String competitionRule2 = "Learn every day!";
    private String competitionRule3 = "Be the best team!";

    public void printRules(){
        System.out.println("this is 1 rules:  " + competitionRule1);
        System.out.println("this is 2 rules:  " + competitionRule2);
        System.out.println("this is 3 rules:  " + competitionRule3);
    }

}
