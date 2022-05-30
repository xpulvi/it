package it.while_loop_03;

public class Main {

// fibonaci
    public static void main(String[] args) {
        int i = 0;
        int n1 = 0;
        int n2= 0;

        while (i <= 9){
        i++;
        if (n1 == 0 && n2 == 0){
            System.out.println(1);
            n2 = 1;
        }else {
            int variabileApogio;
            variabileApogio = n1;
            n1 = n2;
            n2 = n2 + variabileApogio;
            System.out.println(n2);
        }


        }
    }
}
