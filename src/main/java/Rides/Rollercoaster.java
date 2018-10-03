package Rides;

public class Rollercoaster extends Ride {
    private String speed;

    public Rollercoaster(String name, double price, int capacity, double minimumHeight, String speed) {
        super(name, price, capacity, minimumHeight);
        this.speed = speed;
    }

    public String getSpeed() {
        return speed;
    }
}
