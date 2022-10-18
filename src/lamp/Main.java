package lamp;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp("Lamp");
        lamp.addGlowElement(new GlowElements("GlowElement1", "Red"));
        lamp.addGlowElement(new GlowElements("GlowElement2", "Green"));
        lamp.addGlowElement(new GlowElements("GlowElement3", "Blue"));
        lamp.turnAllOn();

        lamp.getGlowElements().get(0).turnOn();

        lamp.printNamesOfLightElements();
        System.out.println("Overall power usage: " + lamp.getOverallPowerUsage());
    }
}
