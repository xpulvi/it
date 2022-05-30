package it.while_loop_01;

public class Main {
    public static void main(String[] args) {

        while (true){

            try {
                Thread.sleep(4000);
            } catch (InterruptedException e){ }

            System.out.println("I am in loop ");

        }
    }
}
