package it.Javadoc_01;

/**
 *
 *  instantiate methods: addHelloWord, getFullName
 * @author Luca
 */
public class WordGames {

    /**
     *
     * @param word word
     * @return the message "hello" returns, it is the word parameter
     */
    public String addHelloWord (String word){
        return "Hello" + word;
    }

    /**
     *
     * @param name name insert
     * @param surname surname insert
     * @return name and surname in string format
     */
    public String getFullName (String name, String surname){
        return name + "   " + surname;
    }

}
