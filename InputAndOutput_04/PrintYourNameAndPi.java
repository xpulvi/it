package it.InputAndOutput_04;

import java.util.Scanner;

public class PrintYourNameAndPi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("prints your name:  " );

        double pi = 3.141590;

        String name = scanner.nextLine();

        System.out.printf("YourName:  %s  %n",name);
        System.out.println("The number Pi is::  " + pi );

    }
}
