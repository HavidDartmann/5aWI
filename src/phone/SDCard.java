package phone;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<PhoneFile> files;

    public SDCard(int capacity) {
        this.capacity = capacity;
        files = new ArrayList<>();
    }

    public void getCapacity() {
        System.out.println("Capacity: " + capacity);
    }

    public void saveFile(PhoneFile file) {
        if (file.getSize() <= capacity) {
            files.add(file);
            capacity -= file.getSize();
            System.out.println("File saved successfully");
        } else {
            System.out.println("Not enough space on SD card");
        }
    }

    public void getAllFiles() {
        for (PhoneFile file : files) {
            System.out.println(file.getInfo());
        }
    }

    public void getFreeSpace(int amount){
        this.capacity = capacity + amount;
    }
}
