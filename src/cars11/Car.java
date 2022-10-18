package cars11;

public class Car {
    private String color;
    private int maxSpeed;
    private int basePrice;
    private float baseConsumption;
    private Engine engine;
    private Producer producer;
    private float reducedPrice;
    private int mileage;

    public Car(String color, int maxSpeed, int basePrice, float baseConsumption, Engine engine, Producer producer){
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.baseConsumption = baseConsumption;
        this.engine = engine;
        this.producer = producer;
        this.reducedPrice = (float) (basePrice - (basePrice * producer.getDiscount()));
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        if (mileage > 50000) {
            baseConsumption += (float) (baseConsumption * 0.098f);
        }
        this.mileage = mileage;
    }

    public void drive(){
        System.out.println("Driving");
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public float getBaseConsumption() {
        return baseConsumption;
    }

    public Engine getEngine() {
        return engine;
    }

    public Producer getProducer() {
        return producer;
    }

    public float getReducedPrice() {
        return reducedPrice;
    }
}
