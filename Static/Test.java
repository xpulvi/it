package it.Static;

public class Test {
    public static void main(String[] args) {

        /*create 2 new Employee objects
        objet luca
        * */
        Employee luca = new Employee("Luca",
                "Rossi" , "luca@gmail.com");
        //objet marco
        Employee marco = new Employee("Marco", "Dalesio",
                "Dale@live.it");

        /* create their new 2 Badge
        * non ho capito come farlo*/

        //show to the user the 2 employees' badge details

        luca.getEmployeeDetails();
        marco.getEmployeeDetails();

    }
}
