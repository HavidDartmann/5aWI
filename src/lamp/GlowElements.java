package lamp;

public class GlowElements {
    private String name;
    private String color;
    private int consumption;
    private boolean isOn;

    public GlowElements(String name, String color) {
        this.name = name;
        this.color = color;
        this.isOn = false;
        this.consumption = 0;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getConsumption() {
        return consumption;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        consumption += 5;
        isOn = true;
    }
}
