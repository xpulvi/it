package it.encapsulation_01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) {
        House sesantaNove = new House();
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci il Residents Names ");
        System.out.println("   ");
        String scrivimi = scanner.nextLine();

       /* StringTokenizer st = new StringTokenizer(scrivimi, ",");

        String[] count = new String[st.countTokens()];
        for (int i= 0; i < st.countTokens();)    {
            count[i] = st.nextToken();
            System.out.println(count[i]);
        }*/
        // si puo fare anche cosi
       /* for ( ; 0 < st.countTokens();)    {
            count[st.countTokens()] = st.nextToken();
            System.out.println(count[st.countTokens()]);
        }*/
        //divid elle stringe (espersione regolare)
        String[] nomi = scrivimi.split(",");
        sesantaNove.setResidentsNames(nomi);

        String[] daStampare = sesantaNove.getResidentsNames();
        sesantaNove.setAddress("non so cosa scrivere");
        sesantaNove.setFloorsNumber(4);

        System.out.printf("%n ***" +
                "indirizo: %s%n" +
                "numero di piani %d%n" +
                "nomi dei residenti: %s%n" +
                "3 steline %n" ,sesantaNove.getAddress(),
                sesantaNove.getFloorsNumber(),
                Arrays.toString(sesantaNove.getResidentsNames()));


    }
}
