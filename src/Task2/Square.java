package Task2;

public class Square {
    private double x;
    private double y;
    private double width;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimetr(){
        return width*4;
    }
    public double getSquare(){
        return width*width;
    }



    public Square(double x, double y, double width) { // left upper point
        this.x = x;
        this.y = y;
        this.width = width;
    }


    public String rightUpperPoint(){
        double x = getX() + width;
        return x + " " + getY();
    }
    public String rightDownPoint(){
        double x = getX() - width;
        double y = getY() - width;
        return x  + " " + y ;
    }
    public String LeftDpwnPoint(){
        double y = getY() - width;
        return getX() + " " + y;
    }
}
