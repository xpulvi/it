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

        //creazione del clone s8 e agiunta dei detagli
        Smartphone s8Clonade = null;
        try {
            s8Clonade = s8.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Error s8Clonade ");
            e.printStackTrace();
        }
        s8Clonade.brandName = "asus";
        s8Clonade.modelName = "s8+ Clone";
        s8Clonade.batterymAh = 500;
        s8Clonade.producerPrice = Producer1;
        s8Clonade.retailPrice = Retail2;

        //details Smartpon s8
        System.out.println(s8.smartphoneDetails());

        System.out.println("                 ");
        //details Smartpon cloned s8
        System.out.println(s8Clonade.smartphoneDetails());

        s8Clonade.equals(s8);

    }

}
