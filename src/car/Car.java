package car;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private List<RearMirror> mirrors;
    private List<Tyre> tyres;
    private String brand;
    private int serialNumber;
    private String color;
    private Engine engine;
    private Tank tank;

    public Car(String brand, int serialNumber, String color, Engine engine, Tank tank) {
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;
        this.engine = engine;
        this.tank = tank;
        this.mirrors = new ArrayList<>();
        this.tyres = new ArrayList<>();
    }

    public void addTyre(Tyre tyres) {
        if (this.tyres.size() < 4) {
            this.tyres.add(tyres);
        }
        else {
            System.out.println("You can't add more than 4 tyres");
        }
    }

    public List<Tyre> getTyres() {
        return tyres;
    }

    public void addRearMirror(RearMirror mirror) {
        if (this.mirrors.size() < 2) {
            this.mirrors.add(mirror);
        }
        else {
            System.out.println("You can't add more than 2 mirrors");
        }
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public void drive () {
        if (engine.getSpeed() > 0) {
            System.out.println("The car is driving with " + engine.getSpeed() + " km/h");
            //Reduce fuel level
            tank.setFuelLevel(tank.getFuelLevel() - engine.getFuelConsumption());
            System.out.println("The fuel level is now: " + tank.getFuelLevel());
        } else {
            System.out.println("The car is not driving");
        }
    }

    public String getBrand() {
        return brand;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tank getTank() {
        return tank;
    }

    /*
    public void brake() {
        System.out.println("The car is braking");
    }

    public void turboBoost() {
        if(this.fuelLevel > this.maxFuelLevel*0.1) {
            System.out.println("The car is turbo boosting");
        }
        else {
            System.out.println("Not enough fuel to turbo boost");
        }
    }
    public void honk(int amountOfReputations) {
        for (int i = 0; i < amountOfReputations; i++) {
            System.out.println("Tuuut");
        }
    }
    public void getRemainingRange() {
        System.out.println("The remaining range is: " + this.fuelLevel/this.fuelConsumption);
    }*/
}

