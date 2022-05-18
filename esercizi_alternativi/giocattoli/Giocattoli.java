package it.esercizi_alternativi.giocattoli;


public abstract class Giocattoli {

   public String colorePrincipal;
    public String tipo;
    public Long id;

    //far stampare: I'm playing with + dettagli del gioco.
    protected abstract String playWith();

    //far stampare: il suono del gioco.
    protected abstract String sound();

    //contiene il numero di Giocattoli creati
   protected static int numGiocattoliCreati;

   /*Un metodo per incrementare il numero di oggetti creati.
   -non ho capito come farlo
    */



}
