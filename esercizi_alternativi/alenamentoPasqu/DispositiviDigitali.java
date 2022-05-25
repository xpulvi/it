package it.esercizi_alternativi.alenamentoPasqu;

public abstract class DispositiviDigitali {

    double prezzo;
    String barcode;
    double iva;

    public double getPrezzoAlConsumatore(){
        return prezzo + prezzo * iva;
    }

     abstract void printMe();

    public DispositiviDigitali(double prezzo, String barcode, double iva) {
        this.prezzo = prezzo;
        this.barcode = barcode;
        this.iva = iva;
    }

}
