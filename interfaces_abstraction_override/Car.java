package it.interfaces_abstraction_override;

public class Car extends Vehicle{

    @Override
    public void doVehicleSound() {
        System.out.println("print the car's sound: like Ferarri");
    }

    int numberOfDoors;
    double carPrice;

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("car details. number Of Wheels: " +  this.numberOfWheels
                +" number Of Doors:  "+ this.numberOfDoors + " car Price: " + this.carPrice );
    }

    //metod concstractor Car
    protected Car( int wheels, int doors, double price){
        this.numberOfWheels = wheels;
        this.numberOfDoors = doors;
        this.carPrice = price;
    }



}
