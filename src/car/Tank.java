package car;

public class Tank {
    private float fuelLevel;
    private int maxFuelLevel;

    public Tank(float fuelLevel, int maxFuelLevel) {
        this.fuelLevel = fuelLevel;
        this.maxFuelLevel = maxFuelLevel;
    }

    public float getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(float fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public int getMaxFuelLevel() {
        return maxFuelLevel;
    }

}


