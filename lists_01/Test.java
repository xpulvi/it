package it.lists_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static javax.script.ScriptEngine.FILENAME;

public class Test {
    public static void main(String[] args) {

       // Double value = list.strem().map(NumericObject::getValue).reduce(0D, Double::sum);

        /*
        List element = new ArrayList<>();
        element.add(10);
        int firstElement = element.get(1);
        System.out.println(firstElement);
        */

        /*
        -------------------------------------- gestione delle ecezioni
        public void m1(){
            throw new IOException();
        }

        public void m2(){
            throw new RuntimeException();
        }

        public void m3() throw Exception{
            throw new IOException();
        }

        public void m4() throw RuntimeException{
            throw new RuntimeException();
        }
        */
        /* == confronta la posizione di memmoria
        .equals confronta il contenuto della memmoria
        String s1 = "canada";
        String s2 = new String(s1);
        if (s1 == s2) System.out.println("s1 == s2");
        if (s1.equals(s2)) System.out.println(s1.equals(s2));
        */

       // Optional<String> str = list.strem().filter(s -> s.lenght() > 10).findFirsst();

        /*
        /In sintesi, il codice apre un file specificato da FILENAME utilizzando un BufferedReader,
        legge ogni riga del file e stampa ogni riga sulla console.
         Se si verifica un'eccezione IOException durante il processo di lettura del file,
         viene stampato un messaggio di errore corrispondente.
         /

        BufferedReader rd = null;
        try{
            rd= new BufferedReader(new FileReader(FILENAME));
            String inputLine = null;
            while ((inputLine = rd.readLine()) != null)
                System.out.println(inputLine);
        }catch (IOException ex){
            System.err.println("An IOException was caught: " + ex.getMessage());
        }
        */

        /*
        /In termini di funzionalità, entrambi i codici svolgono la stessa operazione,
         ovvero leggere le righe di un file utilizzando un BufferedReader e stamparle sulla console.
         La differenza sta nella gestione delle risorse,
         dove il secondo codice utilizza il meccanismo "try-with-resources"
          per semplificare la chiusura automatica del BufferedReader.
        /

        try(BufferedReader rd= new BufferedReader(new FileReader(FILENAME))){
            String inputLine = null;
            while ((inputLine = rd.readLine()) != null)
                System.out.println(inputLine);
        }catch (IOException ex){
        System.err.println("An IOException was caught: " + ex.getMessage());
    } */

        String s1 = "canada";
        String s2 = new String(s1);
        if (s1 == s2) System.out.println("s1 == s2");
        if (s1.equals(s2)) System.out.println(s1.equals(s2));

    }
}
