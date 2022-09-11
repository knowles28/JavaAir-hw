import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void setUp(){
        plane = new Plane(AircraftType.BOEING747);
    }

    @Test
    public void hasAircraftType(){
        assertEquals(AircraftType.BOEING747, plane.getAircraftTypeFromEnum());
    }

    @Test
    public void hasCapacity(){
        assertEquals(250, plane.getAircraftCapacityFromEnum());
    }
}
