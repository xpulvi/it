package it.esercizi_alternativi.pari_o_dispari;

import java.util.Random;

public class PariODispari {



    public String dammiPariODispari(){
        String[] list = {"pari", "dispari"};
        Random r = new Random();

        String s = list [r.nextInt(list.length)];

        return s;
    }
}
