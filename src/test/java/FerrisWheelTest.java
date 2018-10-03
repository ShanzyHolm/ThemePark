import Customers.Customer;
import Rides.FerrisWheel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FerrisWheelTest {
    FerrisWheel ferrisWheel;
    Customer customer1;
    Customer customer2;
    Customer customer3;

    @Before
    public void setUp() throws Exception {
        ferrisWheel = new FerrisWheel("Tail Chase", 1.00, 10, 1, 3);
        customer1 = new Customer("Joey", 10, 1.2, 5.50);
        customer2 = new Customer("Monica", 15, 1.4, 10.00);
        customer3 = new Customer("Ross", 7, 0.9, 8.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Tail Chase", ferrisWheel.getName());
    }

    @Test
    public void canGetPrice() {
        assertEquals(1.00, ferrisWheel.getPrice(), 0.01);
    }

    @Test
    public void canGetMinimumHeight() {
        assertEquals(1, ferrisWheel.getMinimumHeight(), 0.1);
    }

    @Test
    public void canGetCapacity() {
        assertEquals(10, ferrisWheel.getCapacity());
    }

    @Test
    public void canGetRevolutions() {
        assertEquals(3, ferrisWheel.getRevolutions());
    }

    @Test
    public void canRide() {
        ferrisWheel.ride(customer1);
        assertEquals(1, ferrisWheel.getNumberOfRiders());
    }

    @Test
    public void canGetNumberOfRiders() {
        ferrisWheel.ride(customer2);
        ferrisWheel.ride(customer2);
        ferrisWheel.ride(customer2);
        assertEquals(3, ferrisWheel.getNumberOfRiders());
    }

    @Test
    public void canNotRideIfFull() {
        ferrisWheel.ride(customer1);
        ferrisWheel.ride(customer2);
        ferrisWheel.ride(customer2);
        ferrisWheel.ride(customer1);
        ferrisWheel.ride(customer2);
        ferrisWheel.ride(customer2);
        ferrisWheel.ride(customer1);
        ferrisWheel.ride(customer2);
        ferrisWheel.ride(customer2);
        ferrisWheel.ride(customer1);
        ferrisWheel.ride(customer2);
        ferrisWheel.ride(customer2);
        assertEquals(10, ferrisWheel.getNumberOfRiders());
    }


    @Test
    public void canNotRideIfTooShort() {
        ferrisWheel.ride(customer3);
        assertEquals(0, ferrisWheel.getNumberOfRiders());
    }

    @Test
    public void canRideIfTallEnough() {
        ferrisWheel.ride(customer2);
        assertEquals(1, ferrisWheel.getNumberOfRiders());
    }
//
//    @Test
//    public void canRideIfPaid() {
//    }
//
//    @Test
//    public void canNotRideIfNotPaid() {
//    }
}

