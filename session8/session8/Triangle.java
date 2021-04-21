package hocjava.fpt.session8;

import java.util.Scanner;

public class Triangle {
    private Point p1, p2,p3;
    public static void main(String[] args) {
        System.out.println("nhap x of p1 la");
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        System.out.println("nhap y of p1 la");
        int y1 = scan.nextInt();


        // diem 2
        System.out.println("nhap x of p2 la");
        int x2 = scan.nextInt();
        System.out.println("nhap y of p2 la");
        int y2 = scan.nextInt();


        System.out.println("nhap x of p3 la");
        int x3 = scan.nextInt();
        System.out.println("nhap y of p3 la");
        int y3 = scan.nextInt();

        Point p1 = new Point(x1,y1);
        System.out.println("Point1 {" + "x=" + x1 + ", y=" + y1 + '}');

        Point p2 = new Point(x2,y2);
        System.out.println("Point1 {" + "x=" + x2 + ", y=" + y2 + '}');

        Point p3 = new Point(x3,y3);
        System.out.println("Point1 {" + "x=" + x3 + ", y=" + y3 + '}');

        System.out.printf("Distance 12 is : %.2f%n",p1.distance(p2));
        System.out.printf("Distance 23 is: %.2f%n",p2.distance(p3));
        System.out.printf("Distance 31 is: %.2f%n",p3.distance(p1));

        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);

        if (a < b+c && b< a+c && c < a+b)
        {
            System.out.println("Day la 3 diem tao nen 1 tam giac");
            System.out.printf("Chu vi cua tam giac do la : %.2f%n",a+b+c);
        }else {
            System.out.println("Day khong phai la 3 diem tao nen 1 tam giac");
        }

    }


}
