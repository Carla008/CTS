public class Square extends Rectangle {
    public Square(double sideLength) {
        super(sideLength, sideLength);
    }

    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }
}

