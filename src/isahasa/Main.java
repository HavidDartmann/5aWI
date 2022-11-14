package isahasa;

public class Main {

    public static void main(String[] args) {
        Animal a1 = new Animal(69, 20);
        Animal a2 = new Animal(20, 30);

        Zoo zoo = new Zoo("Wildpark", "Wildparkstraße");
        zoo.addAnimal(a1);
        zoo.addAnimal(a2);
        zoo.printAnimals();
    }
}
