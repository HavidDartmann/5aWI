package cars11;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
        Truck t1 = new Truck("red", 200, 10000, 10, new Engine(Engine.Type.DIESEL, 200), new Producer("Manuel", "AT", 0.2f), "yes");

        System.out.println(t1.getTrailer() + " " + t1.getColor());
    }
}
