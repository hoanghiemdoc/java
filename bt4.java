package session2;

public class bt4 {
    public static void main(String[] args) {
        // This logic will generate the triangle for given dimension
        for (int i=1; i<10; i += 2)
        {
            for (int k=0; k < (4 - i / 2); k++)
            {
                System.out.print(" ");
            }
            for (int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
