package it.If_Statement_2;

public class Test {
    public static void main(String[] args) {

        String mySurname  = "Pulvirentni";

        //loperatore ternario a sempre una asegniazione
        /*if implicito
        ? equivale a "if"
        : equivale a else*/
        String nani = mySurname.contains("ni") ?
                "true contain the sequence of letters" : "doesn't contain the sequence of letters 'ni'" ;

        System.out.println(nani);
    }
}
