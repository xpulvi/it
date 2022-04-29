package it.interfaces_abstraction_override;

public abstract class Vehicle {

    String type;
    int numberOfWheels;

    /**
     * showVehicleDetails
     */
    public void showVehicleDetails(){
        System.out.println("type: " + type + "number Of Wheels: " + numberOfWheels);
    }

    //Vehicle Sound
    public abstract void doVehicleSound();

}
