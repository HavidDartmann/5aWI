package cars11;

public class Engine {
    public enum Type {DIESEL, PETROL}
    private Type type;
    private int horsePower;

    public Engine(Type type, int horsePower){
        this.type = type;
        this.horsePower = horsePower;
    }

    public Type getType() {
        return type;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
