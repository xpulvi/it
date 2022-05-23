package it.esercizi_alternativi.persona;

import java.util.Objects;

public abstract class Persona implements IOperate{

     protected String nome;
    protected String cognome;
    protected String codiceFiscale;

    public Persona(String nome, String cognome, String codiceFiscale) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
    }

    abstract String getFullName();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        // Objects.equals(codiceFiscale, persona.codiceFiscale);
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codiceFiscale);
    }

    public void doOperate(Persona persona){

    };

}
