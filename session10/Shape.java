package session10;

public class Shape {
    private String color;

    public Shape (String color) {
        this.color =  color;

    }

    @Override
    public String toString() {
        return "Shape[" +
                "color=" + color + "]";
    }

    public double getArea(){
        System.err.println("shape unknow! cannot computed area");
        return 0;
    }
}
