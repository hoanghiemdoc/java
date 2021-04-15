package session7;

public class Circle {
    // private instance variables
    private double radius;
    private String color;

    // constructor
    public Circle(){
        this.radius = 1.0;
        this.color = "red";
        System.out.println("constructor a cricle with circle()"); // for debugging

    }

    public Circle(double radius){
        this.radius = radius;
        this.color = "red";
        System.out.println("constructor a cricle with circle(radius,color)"); // for dubugges

    }

    // pulic getter and setters for the pravate variables

    public double getRadius(){
        return this.radius;
    }

    public String getColor(){
        return this.color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // return a self-descripvtive String

    public String toString(){
        return "Circle[radius="+radius+",color="+color+"]";
    }

    // return the area of this cricle
    public  double getArea(){
        return radius * radius * Math.PI;
    }


}
