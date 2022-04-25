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
        numberOfEdges = shapeName;
    }


}
