package it.InputAndOutput_01;

import java.util.Scanner;

public class PrintYourName {

    public static void main(String[] args) {

        System.out.print("prints your name:  " );
        Scanner scanner = new Scanner(System.in);
        //TODO in che senso làschaner va chiuso?
        String name = scanner.nextLine();

        System.out.printf("Hello  %s", name);

    }
}
