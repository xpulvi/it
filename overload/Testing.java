package it.overload;

public class Testing {

    public static void main(String[] args) {


    /*create the 5 Shape objects
    using all the different constructor invocations
    *  non capisoco se equello che ho fatto e coreto*/
        Shape shape1 = new Shape();
        Shape shape2 = new Shape(3);
        Shape shape3 = new Shape(1,3.2);
        Shape shape4 = new Shape(1.2,2.3);
        Shape shape5 = new Shape(4.2,5.3,6.1);


        shape1.getShapeDetails();
        System.out.println("         ");
        shape2.getShapeDetails();
        System.out.println("         ");
        shape3.getShapeDetails();
        System.out.println("         ");
        shape4.getShapeDetails();
        System.out.println("         ");
        shape5.getShapeDetails();

    }
}


