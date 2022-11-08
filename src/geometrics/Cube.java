package geometrics;

public class Cube extends Figure{
    private double side;

    public Cube(String name, double side) {
        super(name);
        this.side = side;
    }

    public double getArea() {
        return 6 * Math.pow(side, 2);
    }
}
