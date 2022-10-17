package car;

public class Tyre {
    private int size;
    private int pressure;

    public Tyre(int size, int pressure) {
        this.size = size;
        this.pressure = pressure;
    }

    public int getSize() {
        return size;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}
