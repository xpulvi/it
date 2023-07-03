package it.generics_and_wilcards;

// Factrory una industria
public class Factrory<V extends IUser> {

    public V employee;

    public void printEmployee(){
        System.out.println("The employee is " + employee);
    }

}
