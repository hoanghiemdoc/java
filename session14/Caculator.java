package session14;

import java.util.Scanner;

public class Caculator {
    public static void main(String[] args) {
            double sum = 0;
            int j = 0;

            Scanner sc = new Scanner(System.in);
            System.out.println("enter 5 integer values");
            int numDays = sc.nextInt();
            int ND[] = new int[numDays];

            for (int i = 0; i< numDays; i++){
                System.out.println(  (i+1));
                Scanner h = new Scanner(System.in);
                ND[i] = h.nextInt();
            }
            for (int i = 0; i < numDays; i ++) {
                sum += ND[i];
            }

            System.out.println("Average is : " + sum/numDays);
            for (int i=0; i<numDays;i ++){
                if (ND[i] > (sum/numDays)){
                    j=j++;
                }
            }

        }

}
