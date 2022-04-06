package it.nputAndOutput_05;

import java.util.Scanner;

public class PrintYourAgeFromInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age:   " );

        Integer age = input.nextInt();

        input.close();
        System.out.println("Your age is:  " + age );

    }
}
