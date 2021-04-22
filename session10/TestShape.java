package session10;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Rectangle("red",4,5);
        System.out.println(s1);

        // rectangle[length=4,width=5,shape[color=red]]
        System.out.println("area la" + s1.getArea());

        Shape s2 = new Triangle("blue",4,5);
        System.out.println(s2);

        System.out.println("area la" + s2.getArea()); // invalid output
    }
}
