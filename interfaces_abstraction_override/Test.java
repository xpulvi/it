package it.interfaces_abstraction_override;

public class Test {
    public static void main(String[] args) {
        //objet car
        Car r34 = new Car(4,2,15000);
        //objet boat
        Boat perlaNera = new Boat(5.1,5);

        //objet car
        r34.doVehicleSound();
        r34.showVehicleDetails();
        System.out.println("         ");

        //objet boat
        perlaNera.doVehicleSound();
        //print in console the Boat weight and speed using the dedicated method
        perlaNera.getBoatWeightAndSpeed();

    }
}
