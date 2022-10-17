package car;

import javax.swing.*;

public class Engine {
    public enum EngineType {
        DIESEL,
        PETROL,
        ELECTRIC
    }
    private EngineType engineType;
    private int horsePower;
    private int fuelConsumption;
    private int speed;

    public Engine(EngineType engineType, int horsePower, int fuelConsumption) {
        this.engineType = engineType;
        this.horsePower = horsePower;
        this.fuelConsumption = fuelConsumption;
        this.speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 1 && speed <= 100) {
            this.speed = speed;
            System.out.println("The speed is now: " + this.speed);
        }
        else  {
            System.out.println("Speed must be between 1 and 100");
        }
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

}
