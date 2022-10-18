package cars11;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
        Car c1 = new Car("red", 200, 10000, 10f, new Engine(Engine.Type.DIESEL, 100), new Producer("Fiat", "Italy", 0.1f));

        System.out.println(c1.getBasePrice());
        System.out.println(c1.getReducedPrice());

        System.out.println(c1.getBaseConsumption());
        c1.setMileage(60000);
        System.out.println(c1.getBaseConsumption());
    }
}
