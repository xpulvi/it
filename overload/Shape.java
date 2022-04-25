package it.overload;

public class Shape {

    String shapeName;
    int numberOfEdges;

    public Shape(){
        System.out.println("Shape object creation ");
        shapeName = "Undefined";
    }
    //circle
    public Shape(double radius){
        System.out.println("object creation ");
        shapeName = "circle";
    }
    //square
    public Shape(int edges, double edgeLength){
        System.out.println("object creation ");
        numberOfEdges = 2;
        shapeName = "square";
    }

    //rectangle
    public Shape(double e1, double e2){
        System.out.println("object creation ");
        numberOfEdges = 3;
        shapeName = "rectangle";
    }

    //triangle
    public Shape (double e1, double e2, double e3){
        System.out.println("object creation ");
        numberOfEdges = 4;
        shapeName = "triangle";
    }

    private Object getShapeDetails(){
       return shapeName + numberOfEdges;
    }

}
