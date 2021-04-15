package session7;

public class TestPoint2DPoint3D {
    public static void main(String[] args) {
        // test point2D
        //  test constructor and toString()
        Point2D p2a = new Point2D(1,2);
        System.out.println(p2a); //  toString()
        Point2D p2b = new Point2D(); // defaullt Constructor
        System.out.println(p2b);

        // test setters and getters
        p2a.setX(3);
        p2a.setX(4);
        System.out.println(p2a); //  toString()
        System.out.println("x is: " + p2a.getX());
        System.out.println("x is: " + p2a.getY());

        // test point3D
        Point3D p3a = new Point3D(11,12,13);
        System.out.println(p3a); //  toString()
        Point2D p3b = new Point3D(); // default constructor
        System.out.println(p3b);

        // test setters and gettes
        // test constructor and toString()

        p3a.setX(21); // in supperClass
        p3a.setY(22); // in supperClass
        p3a.setY(24); // in this class

        System.out.println(p3a);
        System.out.println("x is"+ p3a.getX());
        System.out.println("y is"+ p3a.getX());
        System.out.println("y is"+ p3a.getZ());

    }

}
