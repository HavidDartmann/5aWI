package phone;

public class SIM {
    private int id;
    private String number;

    public SIM(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void call(String number){
        System.out.println("Calling number: " + number + " from SIM: " + this.number);
    }
}
