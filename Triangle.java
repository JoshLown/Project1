import java.awt.Color;
public class Triangle {
    public Triangle(double x, double y, double w, double h) {
        xCoor = x;
        yCoor = y;
        width = w;
        height = h;
    }
    private double xCoor;
    private double yCoor;
    private double width;
    private double height;
    public double calculatePerimeter() {
    }
    public double calculateArea() {
        return (width*height)/2;
    }
    public void setColor(Color color) {
    }
    public void setPos(double x, double y) {
        xCoor = x;
        yCoor = y;
    }
    public void setHeight(double h) {
        height = h;
    }
    public void setWidth(double w) {
        width = w;
    }
    public Color getColor(Color color) {
        return color;
    }
    public double getXPos(double x) {
        return xCoor;
    }
    public double getYPos(double y) {
        return yCoor;
    }
    public double getHeight(double h) {
        return height;
    }
    public double getWidth(double w) {
        return width;
    }
}
