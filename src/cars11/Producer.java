package cars11;

public class Producer {
    private String name;
    private String country;
    private float discount;

    public Producer(String name, String country, float discount){
        this.name = name;
        this.country = country;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public float getDiscount() {
        return discount;
    }
}
