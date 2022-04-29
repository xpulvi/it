package it.Wildcards_02;

public class Test {
    public static void main(String[] args) {

        /*- define a testing class with a`main()`method where you:
        - create 4 new `GenericsClass` objects where`T` is:
        * */
        GenericsClass tnt = new GenericsClass();
        GenericsClass non = new GenericsClass();
        GenericsClass nonSoCosaScrivere = new GenericsClass();
        GenericsClass nonSo2 = new GenericsClass();


        Integer firstElement, secondElement;
        String thirdElement, fourthElement;

        /*- assign the following object-value using the `setT()` method:
        - `firstElement` will have an int value `12`
        - `secondElement`will have an int value `13`
        - `thirdElement`and`fourthElement` will have the same String value
        `"This is a string"`
        * */

        tnt.setT("ho setatto T");
        

    }
}
