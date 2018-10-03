import Customers.Customer;
import Rides.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {
    Dodgems dodgems;
    Customer customer1;
    Customer customer2;
    Customer customer3;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Cat Car Clash", 1.50, 6, 1.1);
        customer1 = new Customer("Joey", 10, 1.2, 5.50);
        customer2 = new Customer("Monica", 15, 1.4, 10.00);
        customer3 = new Customer("Ross", 7, 0.9, 8.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Cat Car Clash", dodgems.getName());
    }

    @Test
    public void canGetPrice() {
        assertEquals(1.50, dodgems.getPrice(), 0.01);
    }

    @Test
    public void canGetMinimumHeight() {
        assertEquals(1.1, dodgems.getMinimumHeight(), 0.1);
    }

    @Test
    public void canGetCapacity() {
        assertEquals(6, dodgems.getCapacity());
    }

    @Test
    public void canRide() {
        dodgems.ride(customer1);
        assertEquals(1, dodgems.getNumberOfRiders());
    }

    @Test
    public void canGetNumberOfRiders() {
        dodgems.ride(customer2);
        dodgems.ride(customer2);
        assertEquals(2, dodgems.getNumberOfRiders());
    }

    @Test
    public void canNotRideIfFull() {
        dodgems.ride(customer1);
        dodgems.ride(customer2);
        dodgems.ride(customer1);
        dodgems.ride(customer2);
        dodgems.ride(customer1);
        dodgems.ride(customer2);
        dodgems.ride(customer1);
        dodgems.ride(customer2);

        assertEquals(6, dodgems.getNumberOfRiders());
    }


    @Test
    public void canNotRideIfTooShort() {
        dodgems.ride(customer3);
        assertEquals(0, dodgems.getNumberOfRiders());
    }

    @Test
    public void canRideIfTallEnough() {
        dodgems.ride(customer2);
        assertEquals(1, dodgems.getNumberOfRiders());
    }
}
