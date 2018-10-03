package Rides;

public class FerrisWheel extends Ride implements Rideable {
    private int revolutions;

    public FerrisWheel(String name, double price, int capacity, double minimumHeight, int revolutions) {
        super(name, price, capacity, minimumHeight);
        this.revolutions = revolutions;
    }


    public int getRevolutions() {
        return this.revolutions;
    }
}
