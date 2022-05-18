package it.esercizi_alternativi.giocattoli;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        //oggetti machina
        Macchina lamborgini = new Macchina(12.21,38.6, "verde", "car",12340L);
        Macchina ferari = new Macchina(45.33,200.4,"rosso","machina",000022L);

        //lista fiocatoli creati
        Map<Double, Double> giocattoliCreati = new HashMap<Double, Double>();


        // lamborgini
        giocattoliCreati.put(12.21,38.6);
        giocattoliCreati.put(45.33,200.4);


        //System.out.println("giocatoli creati: " + giocattoliCreati.size());

        Giocattoli.numGiocattoliCreati = giocattoliCreati.size();
        System.out.println("giocatoli creati: " + Giocattoli.numGiocattoliCreati);

        System.out.println("                      ");
        System.out.println(giocattoliCreati);

        //ho telefonato ai metodi creati in giocattoli
        System.out.println(lamborgini.playWith());
        System.out.println(lamborgini.sound());
        System.out.println("            ");
        System.out.println(ferari.playWith());
        ferari.sound();
    }

}
