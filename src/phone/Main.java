package phone;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Camera HDCamera = new Camera(Camera.Resolution.HD);
        Camera FULLHDCamera = new Camera(Camera.Resolution.FULL_HD);
        Camera FOURKCamera = new Camera(Camera.Resolution.FOUR_K);

        SDCard sdCard = new SDCard(20000);

        SIM sim1 = new SIM(1, "123456789");

        Phone phone = new Phone(new Color(255, 0, 0), "Apple", FOURKCamera, sdCard, sim1);

        phone.takePicture("Sumo");
        phone.takePicture("Manuel");

        phone.makeCall("987654321");

        phone.getFreeSpace(1024);
        phone.getCapacity();

        sdCard.saveFile(new PhoneFile("js", 50, "server"));

        phone.printAllFiles();

    }
}
