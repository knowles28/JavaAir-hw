import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrewMemberTest {

    CrewMember crewMember;

    @Before
    public void setUp(){
        crewMember = new CrewMember("Mar", CrewRank.FIRST_OFFICER);
    }

    @Test
    public void hasName(){
        assertEquals("Mar", crewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(CrewRank.FIRST_OFFICER, crewMember.getCrewRankFromEnum());
    }

    @Test
    public void canWelcomePassengers(){
        assertEquals("Welcome aboard!", crewMember.welcomePassenger());
    }


}
