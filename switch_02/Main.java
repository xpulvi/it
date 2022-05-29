package it.switch_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);
        String sceltaString = " ";


        while (!sceltaString.equals("esci")) {

            System.out.println("inserisci una Stringa opure: size, print, clear, " +
                    "per uscire scrivi esci");
            sceltaString = scanner.nextLine();

            switch (sceltaString) {
                case "esci":
                    scanner.close();
                    break;
                case "size":
                    System.out.println(list.size());
                    break;
                case "clear":
                    list.clear();
                    break;
                case "print":
                    System.out.println(list);
                    break;

                default:
                    // in all the other cases, add the value to list
                    list.add(sceltaString);
            }
        }
    }
}