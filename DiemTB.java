package session2;

import java.util.Scanner;

public class DiemTB {
    public static void main(String[] args) {

        double diemtoan,diemvan,diemhoa,diemTB;

        System.out.println("nhập điểm toán của bạn");
        Scanner scan = new Scanner(System.in);
        diemtoan = scan.nextDouble();
        System.out.println("nhập điểm van của bạn");
        diemvan = scan.nextDouble();
        System.out.println("nhập điểm hóa của bạn");
        diemhoa = scan.nextDouble();
        System.out.println("tong diem trung bình là");
       diemTB = (diemtoan+diemhoa+diemvan)/3;


       if(diemTB >= 8) {
           System.out.printf("\ndiem trung binh: $%.2f", diemTB);
           System.out.printf("xếp loại giỏi");
       }
        if ( diemTB <6 ){
            System.out.printf("xếp loại yếu");
        }

    }
}
