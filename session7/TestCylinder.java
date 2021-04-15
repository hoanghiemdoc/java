package session7;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        // constructor a circle with cicrle()
        // constructor a cylinder with cylinder()
        System.out.println("radious is" + cy1.getRadius()
                + ",height is" + cy1.getHeight()
                + ",color is" + cy1.getColor()
                + ",base area is " + cy1.getArea());
        Cylinder cy2 = new Cylinder(5.0, 2.0);

        // constructor a cricle width cicrl(radius)
        // constructor a cricle width cicrl(heigth, radius)
        System.out.println("radius is" + cy2.getRadius()
                + ",height is " + cy2.getHeight()
                + ",color is" + cy2.getColor()
                + ",base area is" + cy2.getArea());


    }
}
