package it.switch_01;

import java.util.Scanner;

import java.util.Scanner;

/*
*loop infinite times asking the user to input a number between 1 and 10
print the name of the number (e.g. 5 --> five)
if the user input a number lower than 1 or greater than 10, print Cannot give you the name
* */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sceltaString;
        int scelta;

        while (true) {
            System.out.println("inserisci un numero da 1 a 10: ");
            sceltaString = scanner.nextLine();
            try {
                scelta = Integer.parseInt(sceltaString);
            } catch (NumberFormatException e) {
                System.out.println("Hai inserito un valore che non è un intero.");
                scelta = 0;
            }

            switch (scelta) {
                case 1:
                    System.out.println("Uno");
                    break;
                case 2:
                    System.out.println("Due");
                    break;
                case 3:
                    System.out.println("Tre");
                    break;
                case 4:
                    System.out.println("Quattro");
                    break;
                case 5:
                    System.out.println("Cinque");
                    break;
                case 6:
                    System.out.println("Sei");
                    break;
                case 7:
                    System.out.println("Sette");
                    break;
                case 8:
                    System.out.println("Otto");
                    break;
                case 9:
                    System.out.println("Nove");
                    break;
                case 10:
                    System.out.println("Dieci");
                    break;
                default:
                    System.out.println("Cannot give you the name");
            }

        }
    }
}
