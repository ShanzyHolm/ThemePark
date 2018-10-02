package Rides;

public abstract class Ride {
    protected String name;
    protected int price;
    protected int minimumHeight;

    public Ride(String name, int price, int minimumHeight) {
        this.name = name;
        this.price = price;
        this.minimumHeight = minimumHeight;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getMinimumHeight() {
        return minimumHeight;
    }
}
