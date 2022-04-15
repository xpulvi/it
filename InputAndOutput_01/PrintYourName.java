package it.InputAndOutput_01;

import java.util.Scanner;

public class PrintYourName {

    public static void main(String[] args) {

        System.out.print("prints your name:  " );
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        //chiude li mettodo scaner. non vai a ocupare gli strem del pc.
        scanner.close();
        System.out.printf("Hello  %s", name);

    }
}
