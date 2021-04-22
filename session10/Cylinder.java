package session10;

public class Cylinder extends Cricle {
          private double height;

          public Cylinder(double height, double radius){
              super(radius);
              this.height = height;
          }

          public double getHeight(){
              return this.height;
          }

          public double getVolumne(){
              return super.getArea() * height;
          }

    @Override
    public String toString() {
        return "Cylinder[ height=" + height +"," + super.toString()+"]";
    }
    Cricle c1 = new Cylinder(1.1,2.2);
          

}
