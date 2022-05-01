package it.other_operators;

public class Testing {
    public static void main(String[] args) {
        int a = 15;

        /*add 5 to a without repeating
         the a variable (e.g. a = a + 5 is not accepted)
        * */
        a += 5;
        int c = 4;
        int i = a - c;
        int b = 0;
        // assign the value of `a`to `int b` and increment`b` 
        // by one without using `a` or `int b = b + 1`
        b = a;
        System.out.println("e dispari: " + b);
        b++;
        System.out.println("e multiplo di 3: " + b);

    }
}
