package it.while_loop_02;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        String scriviQualcosa = " ";
        Scanner scanner = new Scanner(System.in);

        while (!scriviQualcosa.equals("stop")){

            System.out.println("scrivi qualcosa. per stopare scrivi stop ");
            scriviQualcosa = scanner.nextLine();
            System.out.println(scriviQualcosa);
        }

    }
}
