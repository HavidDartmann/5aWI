package geometrics;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 5);
        System.out.println(circle.getArea());

        Rectangle rectangle = new Rectangle("Rectangle", 5, 10);
        System.out.println(rectangle.getArea());

        Square square = new Square("Square", 5);
        System.out.println(square.getArea());

        Cube cube = new Cube("Cube", 5);
        System.out.println(cube.getArea());
    }
}
