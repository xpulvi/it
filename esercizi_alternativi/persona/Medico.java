package it.esercizi_alternativi.persona;

public class Medico extends Persona implements IOperate{

    String specializzazione;
    // nummero anni di esperienza
    int seniority;

    public Medico(String nome, String cognome, String codiceFiscale, String specializzazione, int seniority) {
        super(nome, cognome, codiceFiscale);
        this.specializzazione = specializzazione;
        this.seniority = seniority;
    }

    @Override
    public void doOperate(Persona persona) {
        System.out.printf("codice fiscale : %s %n tipo di lavoro: Medico %n" , codiceFiscale );
    }

    @Override
    String getFullName() {
        return  nome + "  " + cognome;
    }



}
