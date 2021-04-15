package session7;
// a cylinder is a circle plus a height

public class Cylinder extends Circle {
    // private instance variables
    private double height;

    // constructor
    public Cylinder() {
        super(); // invoke supperclass' constructor cricle()
        this.height = 1.0;
        System.out.println("constructor a cylinder width cylinder()"); // for debugget

    }
    public Cylinder(double height){
        super(); // invoke supperclass' constructor cricle()
        this.height =height;
        System.out.println("constructor a cylinder width cylinder(height)"); // for debuuget

    }

    public Cylinder(double height, double radius) {
        super(radius); //invoke supperclass' constructor cricle(radius)
        this.height = height;
        System.out.println("constructor a cylinder width cylinder(radius)");
    }
    public Cylinder(double height,double radius, String color) {
       super(radius); //invoke supperclass' constructor cricle(radius),color
        this.height = height;
        System.out.println("constructor a Cylinder with CyLINDER(height , radius,color)");
    }

    // getter and setter
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    // return the volume of this cyline

//        public double getVolume() {
//        return getArea()*height; // use circle getarea()
//    }

    // return a selft-descriptive String
    public String toString(){
        return "this is a Cyline"; // to be refind later

    }


}

