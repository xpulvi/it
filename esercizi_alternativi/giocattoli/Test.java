package it.esercizi_alternativi.giocattoli;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        //oggetti machina
        Macchina lamborgini = new Macchina(12.21,38.6, "verde", "car",12340L);
        Macchina ferari = new Macchina(45.33,200.4,"rosso","machina",000022L);

        //lista fiocatoli creati
        Map<Long, Giocattoli > giocattoliCreati = new HashMap<>();


        // lamborgini e ferrari
        giocattoliCreati.put(lamborgini.id,lamborgini);
        giocattoliCreati.put(ferari.id, ferari);


        //System.out.println("giocatoli creati: " + giocattoliCreati.size());
        /*
        qa soto ho come quello non comentatto */
        //Giocattoli.numGiocattoliCreati + giocattoliCreati.size();
        Giocattoli.numGiocattoliCreati = giocattoliCreati.size();
        System.out.println("giocatoli creati: " + Giocattoli.numGiocattoliCreati);
        System.out.println("giocatoli creati: " + giocattoliCreati.size());



        System.out.println("                      ");
        System.out.println(giocattoliCreati);

        //ho telefonato ai metodi creati in giocattoli

        //.values() ti torna indietro una lista sula quale si puo iterare (non si porta le chiavi)
        for (Giocattoli g: giocattoliCreati.values()) {
            System.out.println(g.playWith());
            System.out.println(g.sound());
        }
        // per prendere la lista dei valori e le chiavi
        //for(Entry<Long, Giocattoli> entry : giocattoli.entrySet()) { }

    }

}
