package it.InputAndOutput_02;

import java.util.Scanner;

public class PrintYourNameAndSurname {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("prints your name:  " );

        String name = scanner.nextLine();
        String surname = scanner.nextLine();

        System.out.printf("YourName:  %s  YourSurname %s", name, surname);

    }

}
