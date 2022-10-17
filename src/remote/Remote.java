package remote;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    private List<Battery> batteries;

    public Remote() {
        this.batteries = new ArrayList<>();
    }

    public void addBattery(Battery battery) {
        if (this.batteries.size() < 2) {
            this.batteries.add(battery);
        }
        else {
            System.out.println("You can't add more than 2 batteries");
        }
    }

    public void getStatus() {
        if (batteries.size() == 2) {
            //Calculate the average of the batteries
            int average = (batteries.get(0).getBatteryStatus() + batteries.get(1).getBatteryStatus()) / 2;
            System.out.println("The average of the batteries is: " + average + "%");
        }
        else {
            System.out.println("You need 2 batteries to make the remote work");
        }
    }

    public void turnOn() {
        if (batteries.size() == 2) {
            //Calculate the average of the batteries
            int average = (batteries.get(0).getBatteryStatus() + batteries.get(1).getBatteryStatus()) / 2;
            if (average > 20) {
                batteries.get(0).setBatteryStatus(batteries.get(0).getBatteryStatus() - 5);
                batteries.get(1).setBatteryStatus(batteries.get(1).getBatteryStatus() - 5);
                System.out.println("The remote is turned on");
            }
            else {
                System.out.println("The remote is not turned on");
            }
        }
        else {
            System.out.println("You need 2 batteries to make the remote work");
        }
    }

    public void turnOff(){
        System.out.println("The remote is turned off");
    }

}


