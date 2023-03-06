public class Rectangle extends Shape {
    protected double height;
    protected double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    protected void setHeight(double height) {
    }

    protected void setWidth(double height) {
    }
}
