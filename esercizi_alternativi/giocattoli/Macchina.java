package it.esercizi_alternativi.giocattoli;

public class Macchina extends Giocattoli {

    @Override
    protected String playWith() {
        return "I'm playing with"  + toString() ;
    }

    // mi sono ricordato come usare il toString. la spiegazione di ieri e stata utile
    @Override
    public String toString() {
        return "Macchina{" +
                "colorePrincipal='" + colorePrincipal + '\'' +
                ", tipo='" + tipo + '\'' +
                ", id=" + id +
                ", dimensione=" + dimensione +
                ", velocitàMassima=" + velocitàMassima +
                '}';
    }

    @Override
    protected String sound() {
        return "suono bene";
    }

    protected double dimensione;

    protected double velocitàMassima;


    //cerato metodo costrutore per comodita. non era specificato nella tracia.
    // agiunto per comoditaa gli atributi della classe giocattoli
    public Macchina(double dimensione, double velocitàMassima, String colorePrincipal, String tipo, Long id ) {
        this.dimensione = dimensione;
        this.velocitàMassima = velocitàMassima;
        this.colorePrincipal = colorePrincipal;
        this.tipo = tipo;
        this.id = id;
        numGiocattoliCreati++;
    }
}