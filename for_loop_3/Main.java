package it.for_loop_3;

/*
 you have an array of string called arr that is initialised with the names of the days of the week
iterate the array and change in uppercase the array item values every 2 items, starting from Monday (e.g. Monday, Wednesday)
print the modified array
 */

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[]{
                "lunedì ", " martedì ", " mercoledì ", " giovedì ", " venerdì ",
                " sabato ", " domenica"
        };

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i].toUpperCase(Locale.getDefault()));
        }

    }
}
