package session6.Task5;

import session5.Point;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestLine {
    public static void main(String[] args) {
        // test constructors and toString()

        Line l1 =  new Line(1,2,3,4);
        System.out.println(l1); // line toString
        // line[begin=(1,2),end=(3,4)]
        Line l2 = new Line(new Point(5,6), new Point(7,8)); // anypoymous point's intstances

        System.out.println(l2); // line's toString()
        // line[begin=(5,6),end=(7,8)]

        // test setters and getters
        l1.setBegin(new Point(11,12));
        l1.setEnd(new Point(13,14));
        System.out.println(l1);
        // line [begin =(11,12),end=(13,14)]
        System.out.println("begin is"+l1.getBegin()); // point tostring
//        begin is:(11,12)
        System.out.println("end is:"+ l1.getEnd()); // point's toString()
//        end is:(13,14)

        l1.setBeginX(21);
        l1.setBeginY(22);
        l1.setEndX(23);
        l1.setEndY(24);
        System.out.println(l1);
        // line[begin=(21,22) end=(23,24)]
        System.out.println("begin's x is" + l1.getBeginX());
        // begin's x is: 21
        System.out.println("end x is" + l1.getEndX());
//        end x is 23
        System.out.println("end y is" + l1.getEndY());
//        end y is 24
        l1.setBeginXY(31,32);
        l1.setEndXY(33,34);
        System.out.println(l1); // line toSTRING()
        // LINE[begin = (31,32),end= ()33,34]
        System.out.println("begin x and y are" + Arrays.toString(l1.getBeginXY()));
//        begin is [31,32]
        System.out.println("end x and y are" + Arrays.toString(l1.getEndXY()));
//        end is [31,32]

        // test getlength()
        System.out.printf("length is: %.2f%n", l1.getLength());
//        length is:2.83


    }

}
