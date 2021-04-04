package session2;

import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        int Shirts, Trousers, totalTrouser, totalShirt, total, discount, netOfTotal,ofEarn;
        boolean possible = false;

        System.out.println("enter the number of shirts to order");
        Scanner scan = new Scanner(System.in);
        Shirts = scan.nextInt();
        System.out.println("Enter the number of trousers to order");
        Trousers = scan.nextInt();

        totalTrouser = Trousers * 700;
        totalShirt = Shirts * 300;
        total = totalShirt + totalTrouser;

        System.out.println("Item     Quantity     Price     Total");
        System.out.println("-------------------------------------------------");
        System.out.printf("Shirts        ");
        System.out.printf(Shirts + "        ");
        System.out.printf("300       ");
        System.out.println(totalShirt);

        System.out.println();
        System.out.printf("Trousers      ");
        System.out.printf(Trousers + "        ");
        System.out.printf("700       ");
        System.out.println(totalTrouser);


        System.out.println();
        System.out.printf("Discount                          ");

        if(total > 3000){
            discount = total/10;
            System.out.println(discount);
        }
        else {
            discount = 0;
            System.out.println(0);
        }
        System.out.println("-------------------------------------------------");

        System.out.printf("Net Total                         ");
        System.out.println(total - discount);
        System.out.println("-------------------------------------------------");

        System.out.println();
        System.out.printf("Point Earned     ");
        if((total - discount) > 3000){
            System.out.println((total - discount)/100);
        }
        else{
            System.out.println(0);
        }
        System.out.println("Thank you!");
    }
}



// bài của anh thuật
//        discount = (totalShirt + totalTrouser) / 10;
//        netOfTotal = (totalShirt + totalTrouser - discount);
//
//        possible = ((totalShirt + totalTrouser) > 3000);
//        discount = possible ? (totalTrouser + totalShirt)/10:0;
//
//        possible = ((totalShirt + totalTrouser - discount) > 3000);
//        ofEarn = possible ? (totalTrouser + totalShirt - discount) / 100 : 0;
//
//        System.out.printf("\nTotal of Shirts: %d", totalTrouser);
//        System.out.printf("\nTotal of Trousers: %d", totalShirt);
//        System.out.printf("\nDiscount: %d", discount);
//        System.out.printf("\nNet of Total: %d", netOfTotal);
//        System.out.printf("\nPoint Earned: %d", ofEarn);



