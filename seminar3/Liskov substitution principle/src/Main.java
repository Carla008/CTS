public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        System.out.println("Aria dreptunghiului = " + rectangle.getArea());

        Square square = new Square(5.0);
        System.out.println("Aria pătratului = " + square.getArea());

        // The Liskov substitution principle allows us to use a Square object
        // wherever a Rectangle object is expected, without affecting the
        // correctness of the program.
        Rectangle anotherRectangle = new Square(10.0);
        System.out.println("Aria altui dreptunghi = " + anotherRectangle.getArea());
    }
}
