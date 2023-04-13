package it.esercizi_alternativi.alenamentoPasqu;

public class Laptop extends DispositiviDigitali {

    @Override
    void printMe() {
        System.out.println(toString() + this.getPrezzoAlConsumatore());
    }

    Integer ram;
    Integer haedDrive;
    String CPU;

    public Laptop(double prezzo, String barcode, double iva, Integer ram, Integer haedDrive, String CPU) {
        super(prezzo, barcode, iva);
        this.ram = ram;
        this.haedDrive = haedDrive;
        this.CPU = CPU;
    }

    @Override
    public String toString() {
        return "Laptop {" +
                " prezzo = " + prezzo +
                ", barcode = '" + barcode + '\'' +
                ", iva= " + iva +
                ", ram = " + ram +
                ", haedDrive = " + haedDrive +
                ", CPU = '" + CPU + '\'' +
                '}';
    }
}
