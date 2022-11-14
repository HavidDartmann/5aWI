package phone;

import java.awt.*;

public class Phone {
    private Color color;
    private String brand;
    private Camera camera;
    private SDCard sdCard;
    private SIM sim;

    public Phone(Color color, String brand, Camera camera, SDCard sdCard, SIM sim) {
        this.color = color;
        this.brand = brand;
        this.camera = camera;
        this.sdCard = sdCard;
        this.sim = sim;
    }

    public void takePicture(String name){
        sdCard.saveFile(camera.takePhoto(name));
    }

    public void makeCall(String number){
        sim.call(number);
    }

    public void getFreeSpace(int amount){
        sdCard.getFreeSpace(amount);
    }

    public void getCapacity(){
        sdCard.getCapacity();
    }

    public void printAllFiles(){
        sdCard.getAllFiles();
    }
}
