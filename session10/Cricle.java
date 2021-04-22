package session10;

public class Cricle {
    private double radius;

    public Cricle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public String toString(){
        return "Cricle[radius="+radius+"]";
    }

}
