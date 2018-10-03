package Rides;

import Customers.Customer;

import java.util.ArrayList;

public abstract class Ride implements Rideable {
    protected String name;
    protected double price;
    protected int capacity;
    protected double minimumHeight;
    private ArrayList<Customer> riders;

    public Ride(String name, double price, int capacity, double minimumHeight) {
        this.name = name;
        this.price = price;
        this.capacity = capacity;
        this.minimumHeight = minimumHeight;
        this.riders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getMinimumHeight() {
        return minimumHeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfRiders(){
        return this.riders.size();
    }

    public boolean rideIsFull(){
        return this.riders.size() == this.capacity;
    }

    public void ride(Customer customer){
        if (!rideIsFull()){
            if (customer.getHeightInMetres() >= getMinimumHeight() )
            this.riders.add(customer);
        }
    }

}
