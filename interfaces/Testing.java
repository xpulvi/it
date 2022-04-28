package it.interfaces;

import it.interfaces.entities.Assistant;
import it.interfaces.entities.Professor;
import it.interfaces.entities.Student;

public class Testing implements ITeachingPerson,ILearningPerson {

    public static void main(String[] args) {

        //create objet studente
        Student marco = new Student("Marco"," di Vaia ",002,2);
        //create objet Professor
        Professor luca = new Professor("Luca "," Ravio ",002," Eletronica");
        //create objet Assistent
        Assistant kevin = new Assistant("kevin ", " pass ",002,true);


        /* pirma facevo cosi:
        System.out.println("      ");
        marco.goToCollege();
        System.out.println("      ");
        luca.goToCollege();
        System.out.println("      ");
        kevin.goToCollege(); */

        //invoke the goToCollege() method for each of the newly created objects
        marco.goToCollege();
        luca.goToCollege();
        kevin.goToCollege();

        //implemented methods from interfaces
        marco.studyAtHome();
        luca.teachToOtherPeople();
        kevin.teachToOtherPeople();


    }

    @Override
    public void teachToOtherPeople() {

    }

    @Override
    public void studyAtHome() {

    }



}
