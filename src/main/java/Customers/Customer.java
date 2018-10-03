package Customers;

public class Customer {
    private String name;
    private int age;
    private double heightInMetres;
    private double money;

    public Customer(String name, int age, double heightInMetres, double money) {
        this.name = name;
        this.age = age;
        this.heightInMetres = heightInMetres;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeightInMetres() {
        return heightInMetres;
    }

    public double getMoney() {
        return money;
    }
}