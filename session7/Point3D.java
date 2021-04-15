package session7;

public class Point3D extends Point2D {
    // private instance variables
    private int z;

    // constrcutor
    // constructor a point3D instacne at (0,0,0)

    public Point3D(){ // default constructor
        super();  // x =y = 0
        this.z =0;
    }

    // constructor a point3D instance at (x,y,z)
    public Point3D(int x, int y, int z) {
        super(x,y);
        this.z = z;
    }
//    getters and setters
    public int getZ() {
        return this.z;
    }

    public  void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "("+super.getX()+","+super.getY()+","+this.z+")";
    }

}
