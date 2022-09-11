import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void setUp(){
        pilot = new Pilot("Maverick", CrewRank.CAPTAIN, "AF43892");
    }

   @Test
    public void hasName(){
        assertEquals("Maverick", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(CrewRank.CAPTAIN, pilot.getCrewRankFromEnum());
    }

    @Test
    public void canWelcomePassengers() {
        assertEquals("Welcome aboard!", pilot.welcomePassenger());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("Talk to me Goose!", pilot.flyPlane());
    }
}

