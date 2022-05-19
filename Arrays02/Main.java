package it.Arrays02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] aliceToDos = new String[]{
                "Coding", "Reading", "Learning"};

        String[] bobToDos = new String[]{
                "Reading", "Coding", "Learning", "Sleeping"
        };

        String[] timToDos = new String[]{
                "Reading", "Learning", "Coding"
        };
        System.out.println("Is Alice's array equal to Bob array? " + aliceToDos.equals(bobToDos)  +
                ". Is Alice's array equal to Tim array? " +  aliceToDos.equals(timToDos));

        System.out.println("Is Alice's array having the same length of Bob's array? " +
                aliceToDos.equals(bobToDos.length));

        System.out.println("Is Alice's array having the same length of Tim's array? " +
                aliceToDos.equals(timToDos.length));
        //Arrays.compare();



    }
}
