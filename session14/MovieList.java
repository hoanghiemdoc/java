package session14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieList {
    public static void main(String[] args) {
        int i = 0;
        List<String> MovieList = new ArrayList<>();
        MovieList.add("batman");
        MovieList.add("ironman");
        MovieList.add("call of duty");
        MovieList.add("legan of league");
        MovieList.add("batman");
        do {
            System.out.println("danh sach cong cu can thuc hien");
            System.out.println("--------------------------------------");
            System.out.println("1 them phim moi");
            System.out.println("2 chinh sua ten phim");
            System.out.println("3 xoa phim");
            System.out.println("4 tim kiem phim");
            System.out.println("5 in ra danh sach tat ca cac phim");
            System.out.println("6 ket thuc");
            System.out.println("-----------------------------------------");
            System.out.println("moi ban chon");
            Scanner scan = new Scanner(System.in);
            i = scan.nextInt();
            switch (i) {
                case 1:
                    System.out.println("ban nhap vao day");
                    String c = scan.next();
                    MovieList.add(c);
                    System.out.println("phim" + c + "da dc them vao vi tri so: " + MovieList.lastIndexOf(c));
                    break;
                case 2:
                    System.out.println("moi ban nhap vi tri muon sua");
                    int v = scan.nextInt();
                    System.out.println("nhap ten phim moi");
                    String n = scan.nextLine();
                    MovieList.set(v, n);
                    System.out.println("ten phim da dc update");
                    System.out.println(v + "." + MovieList.get(v));
                    break;
                case 3:
                    System.out.println("nhap vi tri ban muon xoa");
                    int x = scan.nextInt();
                    MovieList.remove(x);
                    System.out.println("phim xoa thanh cong");
                    break;
                case 4:
                    System.out.println("nhap ten phim can tim");
                    String t = scan.nextLine();
                    System.out.println("vi tri cua phim: " + t +"la: " + MovieList.indexOf(t));
                    break;
                case 5:
                    for (int y =0; y< MovieList.size(); y++){
                        System.out.println(i+"." + MovieList.get(i));
                        break;
                    }

            }
        } while (i ==6);

    }

}
