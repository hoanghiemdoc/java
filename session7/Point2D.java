package session7;

import session5.Point;

public class Point2D {
    // private instance variables
    private int x,y;

    // constructors
    // constructor a point2d instance at (0,0)
    public Point2D() { // default constructor
        this.x = 0;
        this.y=0;

    }
    // constructor a point 2d instance at the given(x,y)
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
     // getters and setters
    public int getX() {
        return this.x;
    }
    public void setX(int x) {
        this.x =x;

    }

    public int getY() {
        return this.y;
    }
    public void setY(int y) {
        this.y =y;

    }

    // return a self-descriptive string in the form of(x,y)
    @Override
    public String toString(){
        return "("+this.x+","+this.y+")";
    }

}
