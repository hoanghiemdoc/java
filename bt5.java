package session2;

import java.util.Scanner;

public class bt5 {
    public static void main(String[] args)
    {
        int nRows;
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter an odd-number of output-lines (enter zero to exit the program): ");
        nRows = console.nextInt();
        
        for(int i=0; i < nRows/2; i++ ) {
            for(int j = nRows - i; j < nRows; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < nRows - 2*i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0; i < (nRows+1)/2; i++ )
        {
            for(int j = 1; j <= nRows/2 - i; j++)
                System.out.print(" ");
            for(int j = 0; j <= i*2; j++)
                System.out.print("*");
            System.out.println();
        }
    }

}
