package it.esercizi_alternativi.persona;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Programmatore marco = new Programmatore("marco", "rossi","333111",3);
        Persona luca = new Programmatore("luca", "rossi","4422",2);
        Persona giovani = new Medico("giovani","alberta","5566","chirurgia",4);
        Persona roberta = new Medico("roberta","coreale","99955","medicina generale",1);
        //duplicato mirco
        //Persona mirco = new Programmatore("luca", "rossi","4422",2);
        Persona m2 = new Medico("roberta","coreale","99955","medicina generale",1);
        //lista persone
        List<Persona> personaList = new ArrayList<>();

        personaList.add(marco);
        personaList.add(luca);
        personaList.add(giovani);
        personaList.add(roberta);
        personaList.add(m2);
        //dopione
        System.out.println("il numero di elementi della lista e: " + personaList.size());
        // duplicato del no
       Persona mirco = luca;
        System.out.println("il numero elementi dopo la duplicazione : " + personaList.size());

        //forech stampa il nome completo di tutte le persone
        for (Persona u: personaList) {
            System.out.println("    ");
            System.out.println("mi chiamo: " + u.getFullName());
            
            u.doOperate(u);
        }








    }


}
