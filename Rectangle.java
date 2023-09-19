import java.awt.Color;
public class Rectangle {
    public Rectangle(double x, double y, double w, double h) {
        xPos = x;
        yPos = y;
        width = w;
        height = h;
    }
    private double xPos;
    private double yPos;
    private double width;
    private double height;
    public double calculatePerimeter() {
        return 2*width + 2*height;
    }
    public double calculateArea() {
        return width * height;
    }
    public void setColor(Color color) {
    }
    public void setPos(double x, double y) {
        xPos = x;
        yPos = y;
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
        return xPos;
    }
    public double getYPos(double y) {
        return yPos;
    }
    public double getWidth(double w) {
        return width;
    }
    public double getHeight(double h) {
        return height;
    }
}
