package it.nputAndOutput_03;

import java.util.Scanner;

public class PrintYourNameAndSurname {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("prints your name:  " );

        String name = scanner.nextLine();
        String surname = scanner.nextLine();

        //e posibilie farlo con printf  ?
        //System.out.printf("YourName:  %s ",name);
        System.out.println("YourName:  " + name);
        System.out.println("YourSurname:  " + surname);

    }
}
