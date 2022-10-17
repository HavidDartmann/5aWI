package car;

public class Main {
public static void main(String[] args) {

    Engine engine1 = new Engine(Engine.EngineType.DIESEL, 100, 7);

    Tank tank1 = new Tank(100, 100);

    RearMirror mirror1 = new RearMirror(10, true);
    RearMirror mirror2 = new RearMirror(10, true);

    Tyre tyre1 = new Tyre(20, 2);
    Tyre tyre2 = new Tyre(20, 2);
    Tyre tyre3 = new Tyre(20, 2);
    Tyre tyre4 = new Tyre(20, 2);

    Car car1 = new Car("BMW", 123456, "red", engine1, tank1);

    car1.addRearMirror(mirror1);
    car1.addRearMirror(mirror2);

    car1.addTyre(tyre1);
    car1.addTyre(tyre2);
    car1.addTyre(tyre3);
    car1.addTyre(tyre4);

    System.out.println("The car has " + car1.getTyres().size() + " tyres");
    System.out.println("Mirror 1 has size " + car1.getMirrors().get(0).getSize());

    car1.getEngine().setSpeed(20);

    car1.drive();



    }
}
