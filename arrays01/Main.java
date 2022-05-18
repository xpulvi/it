package it.arrays01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] carBrands = new String[]{
                "ferrari" ,"lamborghini", "aston martin", "maserati"
        };

        System.out.println("number of items: " + carBrands.length);
        System.out.println("3rd item of array: " + carBrands[2]);
        
        int[] primeNumbers = new int[6];
        primeNumbers[0] = 1;
        primeNumbers[1] = 2;
        primeNumbers[2] = 3;
        primeNumbers[3] = 4;
        primeNumbers[4] = 5;
        primeNumbers[5] = 6;
        System.out.println("prime Numbers: " + Arrays.toString(primeNumbers));
    }
}
