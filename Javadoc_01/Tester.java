package it.Javadoc_01;

/**
 * @author Luca
 *
 * - print in console the result of the`addHelloWord`method invocation
 * - print in console the result of the`getFullName`method invocation
 */
public class Tester {

    public static void main(String[] args) {

        /**
         * create the word Games object
         */
        WordGames wordGames = new WordGames() {
        };


        System.out.println("             ");
        System.out.println(wordGames.addHelloWord("Luc  "));
        System.out.println(wordGames.getFullName("Luca  ", "Rossi  "));

    }

}
