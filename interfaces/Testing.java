package it.interfaces;

public class Testing {

    public static void main(String[] args) {

        //create objet studente
        Student marco = new Student("Marco"," di Vaia ",002,2);
        //create objet Professor
        Professor luca = new Professor("Luca "," Ravio ",002," Eletronica");
        //create objet Assistent
        Assistant kevin = new Assistant("kevin ", " pass ",002,true);

        System.out.println("      ");
        marco.goToCollege();
        System.out.println("      ");
        luca.goToCollege();
        System.out.println("      ");
        kevin.goToCollege();




    }
}
