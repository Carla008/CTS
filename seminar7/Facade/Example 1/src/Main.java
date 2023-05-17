// Facade interface
interface ShapeFacade {
    void draw();
}

// Circle class
class Circle {
    public void drawCircle() {
        System.out.println("Cercul este desenat");
    }
}

// Rectangle class
class Rectangle {
    public void drawRectangle() {
        System.out.println("Dreptunghiul este desenat");
    }
}

// Square class
class Square {
    public void drawSquare() {
        System.out.println("Patratul este desenat");
    }
}

// Facade implementation
class ShapeMakerFacade implements ShapeFacade {
    private Circle circle;
    private Rectangle rectangle;
    private Square square;

    public ShapeMakerFacade() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void draw() {
        circle.drawCircle();
        rectangle.drawRectangle();
        square.drawSquare();
    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        ShapeFacade shapeMaker = new ShapeMakerFacade();
        shapeMaker.draw();
    }
}
