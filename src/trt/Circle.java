package trt;

public class Circle extends  Shape {
    private  double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findSquare() {
        return 2*3.14*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +" Square = " + findSquare() +
                '}';
    }
}
