package it.interfaces_abstraction_override;

public class Boat extends Vehicle{

    double maxKnotsSpeed;
    int boatKilosWeight;

    @Override
    public void doVehicleSound() {
        System.out.println("the boat's sound: cool devi jons");
    }


    protected Boat(double maxSpeed, int weight){
       this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }

    protected String getBoatWeightAndSpeed(){
        System.out.println("total kilos: " + this.boatKilosWeight + " maximum knots speed: " + this.maxKnotsSpeed);
        return "total kilos: " + this.boatKilosWeight + "maximum knots speed: " + this.maxKnotsSpeed;
    }

}
