package it.lists_01;

import java.util.HashMap;
import java.util.Map;

public class ListMapp {
    public static void main(String[] args) {

        //lista con le mappe

        Map<String, String> cityNames = new HashMap<>();

        cityNames.put("citta1","bergamo");
        cityNames.put("citta2"," roma");
        /*put e come add

         */
        cityNames.put("citta3","milano");

        System.out.println(cityNames);

        cityNames.put("citta2","Tegucigalpa");

        System.out.println(cityNames);

        //cityNames.clear();
        //rimuove la cittta 2
        cityNames.remove("citta2");

        System.out.println(cityNames);
        //add citta 2
        cityNames.put("citta2","Tegucigalpa");
        System.out.println(cityNames);

        System.out.println("----------------");
        /**
         * evita le sovra scriture
         */
        cityNames.putIfAbsent("citta4","genova");

        System.out.println(cityNames);

        System.out.println("----------------");
        //replace e come un set ma non genera ecezioni
        cityNames.replace("citta5","genova");

        System.out.println(cityNames);

    }
}
