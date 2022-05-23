package it.esercizi_alternativi.persona;

import java.util.ArrayList;
import java.util.List;

public class Programmatore extends Persona implements IOperate {


    // contiene il numero di anni di esperienza | del linguagio
    Integer seniority;

    public Programmatore(String nome, String cognome, String codiceFiscale, Integer seniority) {
        super(nome, cognome, codiceFiscale);
        this.seniority = seniority;
    }

    @Override
    String getFullName() {
     return  "sono lo svilupatore: " + nome + "  " + cognome;
    }

    @Override
    public void doOperate(Persona persona) {
        System.out.printf("codice fiscale : %s %n tipo di lavoro: programmatore %n" , codiceFiscale );
    }

    // lista lingaggi
    List<String> LinguaggiConosciuti = new ArrayList<>();




}
