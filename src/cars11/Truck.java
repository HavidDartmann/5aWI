package cars11;

public class Truck extends Car{
    private String trailer;

    public Truck(String color, int maxSpeed, int basePrice, float baseConsumption, Engine engine, Producer producer, String trailer) {
        super(color, maxSpeed, basePrice, baseConsumption, engine, producer);
        this.trailer = trailer;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    @Override
        public void drive(){
        System.out.println("Driving a truck");
    }
}
