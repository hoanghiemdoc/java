package session6.Task5;

import session5.Point;

public class Line {
    // the private instance variables
    Point begin, end;

    // constructor a line instace given 2 point at (x1,x2) and(x2,y2)
    public Line(int x1, int y1, int x2, int y2) {
        begin = new Point(x1, y1); // constructors the instance declare
        end = new Point(x2, y2);

    }

    // constructor aline instance given 2 point instances
    public Line(Point begin, Point end) {
        this.begin = begin; // the caller had constructed instance
        this.end = end;

        // the pulic getters and setters for the private instacne variables


    }

    public Point getBegin() {
        return begin;   // pint getX
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        this.begin = begin;

    }

    public void setEnd(Point End) {
        this.end = end;

    }

    public int getBeginX() {
        return begin.getX(); // point's setX()
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY(); // point getY();

    }

    public void setBeginY(int y) {
        begin.setY(y); // point setY()
    }

    public int[] getBeginXY() {
        return begin.getXY(); // point getXY()

}

public void setBeginXY(int x, int y) {
        begin.setXY(x,y); //Point setXY()
}

public int getEndX() {
        return end.getX(); // point's getX()
}

public void setEndX(int x) {
        end.setX(x);
}

    public int getEndY() {
        return end.getY(); // point's getX()
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public int[] getEndXY() {
        return end.getXY();
    }
    public void setEndXY(int x, int Y) {
      end.setXY(x, Y);// ppoint setXY
      end.setXY(x, Y);// ppoint setXY
    }

    // return a self-desctive string

    public String toString(){
        return "Line[begin = "+begin+"en="+end+"]";
        // invole begin.toString() and end.toString
    }

    // return the length of this line

    public double getLength() {
        return begin.distance(end); // use point's distance() method
    }









}
