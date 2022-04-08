package it.Javadoc_02;

public class Tester {

    public static void main(String[] args) {

        ArithmeticOperators arithmeticOperators = new ArithmeticOperators();

        System.out.println("             ");
        System.out.println(" 1 + 1 = " + arithmeticOperators.sum(1,1));
        System.out.println(" 1 - 1 = " + arithmeticOperators.sub(1,1));
        System.out.println(" 10 * 2 = " + arithmeticOperators.mul(10,2));
        System.out.println(" 10 / 2 = " + arithmeticOperators.div(10,2));

    }

}
