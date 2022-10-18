package lamp;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private String name;
    private List<GlowElements> glowElements;

    public Lamp(String name) {
        this.name = name;
        this.glowElements = new ArrayList<>();
    }

    public void addGlowElement(GlowElements glowElement) {
        glowElements.add(glowElement);
    }

    public void turnAllOn() {
        for (GlowElements glowElement : glowElements) {
            glowElement.turnOn();
        }
    }

    public double getOverallPowerUsage(){
        double overallPowerUsage = 0;
        for (GlowElements glowElement : glowElements) {
            overallPowerUsage += glowElement.getConsumption();
        }
        return overallPowerUsage;
    }

    public void printNamesOfLightElements() {
        for (GlowElements glowElement : glowElements) {
            System.out.println(glowElement.getName());
        }
    }

    public List<GlowElements> getGlowElements() {
        return glowElements;
    }
}
