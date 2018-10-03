import Customers.Customer;
import Rides.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Rollercoaster rollercoaster1;
    Customer customer1;
    Customer customer2;
    Customer customer3;

    @Before
    public void setUp() throws Exception {
        rollercoaster = new Rollercoaster("Mouse Chaser", 2.00, 2, 1.2, "slow");
        rollercoaster1 = new Rollercoaster("Lazer Pointer", 3.50, 4, 1.4, "fast");
        customer1 = new Customer("Joey", 10, 1.1, 5.50);
        customer2 = new Customer("Monica", 15, 1.4, 10.00);
        customer3 = new Customer("Ross", 7, 0.9, 8.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Mouse Chaser", rollercoaster.getName());
    }

    @Test
    public void canGetPrice() {
        assertEquals(2.00, rollercoaster.getPrice(), 0.01);
    }

    @Test
    public void canGetMinimumHeight() {
        assertEquals(1.2, rollercoaster.getMinimumHeight(), 0.1);
    }

    @Test
    public void canGetCapacity() {
        assertEquals(4, rollercoaster1.getCapacity());
    }

    @Test
    public void canGetSpeed() {
        assertEquals("slow", rollercoaster.getSpeed());
    }

    @Test
    public void canRide() {
        rollercoaster.ride(customer1);
        assertEquals(1, rollercoaster.getNumberOfRiders());
    }

    @Test
    public void canGetNumberOfRiders() {
        rollercoaster1.ride(customer1);
        rollercoaster1.ride(customer2);
        rollercoaster1.ride(customer3);
        assertEquals(3, rollercoaster1.getNumberOfRiders());
    }

    @Test
    public void canNotRideIfFull() {
        rollercoaster.ride(customer1);
        rollercoaster.ride(customer2);
        rollercoaster.ride(customer3);
        assertEquals(2, rollercoaster.getNumberOfRiders());
    }





    //    @Test
//    public void canNotRideIfTooShort() {
//
//    }
//
//    @Test
//    public void canRideIfTallEnough() {
//    }
//
//    @Test
//    public void canRideIfPaid() {
//    }
//
//    @Test
//    public void canNotRideIfNotPaid() {
//    }
}
