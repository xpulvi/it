package it.for_loop_2;

/*
 *Exercise: For Loop 2
  use a for-loop to print the first 10 numbers of the Fibonacci sequence
 */


public class Main {
    public static void main(String[] args) {

        String[] listaStrings = new String[]{
                "0", "1", "1", "2", "3", "5", "8", "13", "21", "34", "55","89", "144"
        };

        int b = 1;
        for (int a = 0; a < 10; a++){
            System.out.println(listaStrings[a]);

        }

    }
}
