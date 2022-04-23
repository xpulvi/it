package it.default_methods_override;

public class Tester {

    public static void main(String[] args) {

        SmartphonePrice Producer1 = new SmartphonePrice("Producer1",2);
        SmartphonePrice Producer2 = new SmartphonePrice("Producer2",30);
        SmartphonePrice Retail1 = new SmartphonePrice("Retail1 ",100);
        SmartphonePrice Retail2 = new SmartphonePrice("Retail2 ",102);

        //smartpon objet
        Smartphone s8 = new Smartphone("samsun", "s8+", 500, Producer1,Retail1);
        Smartphone s20 = new Smartphone("samsun", "s20", 500, Producer2,Retail2);

    //TODO
    System.out.println("details: ");
    }

}
