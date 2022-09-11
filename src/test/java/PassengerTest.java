import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void setUp(){
    passenger = new Passenger("Keith", 2);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Keith", passenger.getName());
    }

    @Test
    public void passengerHasNumberOfBags(){
        assertEquals(2, passenger.getBags());
    }

}
