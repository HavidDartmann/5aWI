package cars11;

public class Car {
    private String color;
    private int maxSpeed;
    private int basePrice;
    private int baseConsumption;
    private Engine engine;
    private Producer producer;

    public Car(String color, int maxSpeed, int basePrice, int baseConsumption, Engine engine, Producer producer){
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.baseConsumption = baseConsumption;
        this.engine = engine;
        this.producer = producer;
    }


}
