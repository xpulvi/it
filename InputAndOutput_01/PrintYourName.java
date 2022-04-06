package it.InputAndOutput_01;

import java.util.Scanner;

public class PrintYourName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("prints your name:  " );
        String name = scanner.nextLine();

        System.out.printf("Hello  %s", name);

    }
}
