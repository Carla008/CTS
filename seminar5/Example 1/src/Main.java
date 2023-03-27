public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // create a circle
        Shape circle = shapeFactory.createShape("circle");
        circle.draw();

        // create a square
        Shape square = shapeFactory.createShape("square");
        square.draw();

        // create a rectangle
        Shape rectangle = shapeFactory.createShape("rectangle");
        rectangle.draw();

        // create a shape that is not supported
        Shape unsupportedShape = shapeFactory.createShape("oval");
        if (unsupportedShape == null) {
            System.out.println("Unsupported shape type");
        }
    }
}
