import java.awt.Color;
public class Circle {
    public Circle(double x, double y, double r) {
        xPos = x;
        yPos = y;
        radius = r;
    }
    private double xPos;
    private double yPos;
    private double radius;
    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
    public double calculateArea() {
        return 3.14 * radius * radius;
    }
    public void setColor(Color color) {
    }
    public void setPos(double x, double y) {
        xPos = (x+y)/2;
        yPos = (y+x)/2;
    }
    public void setRadius(double r) {
        radius = r;
    }
    public Color getColor(Color color) {
        return color;
    }
    public double getXPos(double x) {
        return xPos;
    }
    public double getYPos(double y) {
        return yPos;
    }
    public double getRadius(double r) {
        return radius;
    }
}
