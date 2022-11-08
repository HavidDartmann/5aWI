package geometrics;

public class Square extends Figure{
    private double side;

    public Square(String name, double side) {
        super(name);
        this.side = side;
    }

    public double getArea() {
        return Math.pow(side, 2);
    }
}
