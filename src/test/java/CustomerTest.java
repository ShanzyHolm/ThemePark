import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer1;
    Customer customer2;

    @Before
    public void setUp() throws Exception {
        customer1 = new Customer("Joey", 10, 1.1, 5.50);
        customer2 = new Customer("Monica", 15, 1.4, 10.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Joey", customer1.getName());
    }

    @Test
    public void canGetAge() {
        assertEquals(15, customer2.getAge());
    }

    @Test
    public void canGetHeightInMetres() {
        assertEquals(1.1, customer1.getHeightInMetres(), 0.1);
    }

    @Test
    public void canGetMoney() {
        assertEquals(10.00, customer2.getMoney(), 1);
    }
}
