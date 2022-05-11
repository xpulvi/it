package it.lists_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Testing {

    public static void main(String[] args) {

        List<String> cityNames = Arrays.asList("bergamo", "roma", "milano");

       //error
        //cityNames.add("ranica");

        System.out.println("lista cityNames" + cityNames);

        cityNames.set(1,"Tegucigalpa");

        System.out.println("lista cityNames" + cityNames);

        //lista dinamica (mutabile)
        System.out.println("-----------------------");

        List<String> kingsOfRome = new ArrayList<>();
        kingsOfRome.add("Romulus" );
        kingsOfRome.add("Numa Pompilius");
        kingsOfRome.add("Tullus Hostilius");
        kingsOfRome.add("Ancus Marcius");
        kingsOfRome.add("Lucius Tarquinius Priscus");
        kingsOfRome.add("Servius Tullius");
        kingsOfRome.add("Lucius Tarquinius Superbus");

        System.out.println(kingsOfRome );

        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);

         kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";

        System.out.println("-----------------------");
        /*conversione da array a a string.
        stampa in cosole i valori array
         */
        System.out.println(Arrays.toString(kingsOfRomeArray));

    }

}
