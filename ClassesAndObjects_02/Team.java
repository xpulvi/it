package it.ClassesAndObjects_02;

public class Team {

    public String teamName;

    //objects  programe
    Programmer p1 = new Programmer();
    Programmer p2 = new Programmer();

    public void printTeamDetails(){
        System.out.printf("team name:  %s  ", teamName , " name develop: %s ",  p1 , "Language programming:  %s "
                ,p1.programmingLanguage, "yars of develop   %s  %d " );
        System.out.println("   -----   ------  ");
        System.out.println("team name:    " + teamName + " - " + p2 + " " + p2.programmingLanguage);
    }
}
