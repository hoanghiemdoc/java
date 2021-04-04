package session2;


import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        int toan;
        int khoaHoc;
        int tiengAnh;
        int toan1;
        int khoaHoc1;
        int tiengAnh1;
        int hb1;
        int hb2;
        int average;
        int average1;


        System.out.println("enter marks obtained in maths");
        Scanner scan = new Scanner(System.in);
        toan = scan.nextInt();
        System.out.println("enter marks obtained in science");
        khoaHoc = scan.nextInt();
        System.out.println("enter marks obtained in english");
        tiengAnh = scan.nextInt();
        average = toan+khoaHoc+tiengAnh;

        System.out.println("enter marks obtained in maths");
        toan1 = scan.nextInt();
        System.out.println("enter marks obtained in science");
        khoaHoc1 = scan.nextInt();
        System.out.println("enter marks obtained in english");
        tiengAnh1 = scan.nextInt();
        average1 = toan1+khoaHoc1+tiengAnh1;

        hb1 = average/3;
        hb2 = average1/3;
        // display
        System.out.printf("enter marks of thilkd = %d",average);
        System.out.println();
        System.out.printf("hoc bong = %d",hb1);
        System.out.println("");
        System.out.println();
        System.out.printf("math = %d",toan);
        System.out.println();
        System.out.printf("science = %d",khoaHoc);
        System.out.println();
        System.out.printf("english = %d",tiengAnh);

        System.out.println();

         // display2
        System.out.printf("enter marks of bill = %d",average1);
        System.out.println();
        System.out.printf("hoc bong2 = %d", hb2);
        System.out.println("");
        System.out.printf("math = %d",toan1);
        System.out.println();
        System.out.printf("science = %d",khoaHoc1);
        System.out.println();
        System.out.printf("english = %d",tiengAnh1);
        System.out.println();
  // dieu kien cho hoc bong 1
        if (average > 75) {
            hb1 = 20000;
        }
        else if (average < 60) {
            hb1 = 0;
        }
        else
        {
            hb1 = 10000;
        }
        // dieu kien cho hoc bong 2
        System.out.printf("\nScholarship1: $%d", hb1);
        if (average1 > 75) {
            hb2 = 20000;
        }
        else if (average1 < 60) {
            hb2 = 0;
        }
        else
        {
            hb2 = 10000;
        }
        System.out.printf("\nScholarship2: $%d", hb2);


    }

}
