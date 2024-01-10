package it.InputAndOutput_04;

import java.util.Scanner;

public class PrintYourNameAndPi {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("prints your name:  " );

        double pi = Math.PI;

        String name = scanner.nextLine();
        scanner.close();

        System.out.printf("YourName:  %S  %n",name);
        System.out.println("The number Pi is::  " + pi );

    }
}
