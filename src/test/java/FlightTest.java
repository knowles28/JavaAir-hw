import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Flight flight2;

    Pilot pilot1;
    Pilot pilot2;
    Pilot pilot3;

    CrewMember cabinCrew;

    Passenger passenger;
    Passenger passenger2;




    @Before
    public void setUp(){
        flight = new Flight(AircraftType.SUPERJET200,"EJ142","EDI", "CDG", "07:42", 0);
        flight2 = new Flight(AircraftType.CESSNA100,"ABC123","EDI", "GLA", "09:00", 0);
        pilot1 = new Pilot("Maverick", CrewRank.CAPTAIN, "AF42421");
        pilot2 = new Pilot("Goose", CrewRank.FIRST_OFFICER, "AF42420");
        pilot3 = new Pilot("Sidewinder", CrewRank.CAPTAIN, "AF4242");

        cabinCrew = new CrewMember("Jon", CrewRank.ATTENDANT);

        passenger = new Passenger("Samwise Jones", 2);
        passenger2 = new Passenger("Frodo Smith", 1);
    }


//    FLIGHT DETAILS --------------

    @Test
    public void getPlaneType(){
        assertEquals(AircraftType.SUPERJET200, flight.getAircraftTypeFromEnum());
    }

    @Test
    public void getPlaneCapacity(){
        assertEquals(8, flight.getAircraftCapacityFromEnum());
    }

    @Test
    public void checkFlightNumber(){
        assertEquals("EJ142", flight.getFlightNumber());
    }

    @Test
    public void checkDepartureAirport(){
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void checkDestinationAirport(){
        assertEquals("CDG", flight.getDestinationAirport());
    }

    @Test
    public void checkDepartureTime(){
        assertEquals("07:42", flight.getDepartureTime());
    }



//   PILOTS & CREW --------------

    @Test
    public void canCheckCockpitCapacityIsEmpty(){
        assertEquals(0, flight.getCockpitCapacity());
    }

    @Test
    public void canAddPilotToCockpit(){
        flight.addPilotToCockpit(pilot1);
        assertEquals(1, flight.getCockpitCapacity());
    }

    @Test
    public void cannotAddMoreThanTwoPilotsToCockpit(){
        flight.addPilotToCockpit(pilot1);
        flight.addPilotToCockpit(pilot2);
        flight.addPilotToCockpit(pilot3);
        assertEquals(2, flight.getCockpitCapacity());
    }

    @Test
    public void canCheckCrewListIsEmpty(){
        assertEquals(0, flight.getCabinCrewTotal());
    }

    @Test
    public void canAddCabinCrewToList(){
        flight.addCabinCrew(cabinCrew);
        assertEquals(1, flight.getCabinCrewTotal());
    }

    @Test
    public void cannotAddMoreThanThreeCabinCrewToFlight(){
        flight.addCabinCrew(cabinCrew);
        flight.addCabinCrew(cabinCrew);
        flight.addCabinCrew(cabinCrew);
        flight.addCabinCrew(cabinCrew);
        assertEquals(3, flight.getCabinCrewTotal());
    }


//    PASSENGERS --------------

    @Test
    public void checkManifestoStartsEmpty(){
        assertEquals(0, flight.getPassengerManifestoLength());
    }

    @Test
    public void canBookPassengerOnFlight(){
        flight.bookPassengerOnFlight(passenger);
        assertEquals(1, flight.getPassengerManifestoLength());
    }

    @Test
    public void canCheckRemainingFlightCapacity(){
        flight.bookPassengerOnFlight(passenger);
        assertEquals(7, flight.getRemainingFlightCapacity());
    }

    @Test
    public void cannotOverbookFlight(){
        flight2.bookPassengerOnFlight(passenger);
        flight2.bookPassengerOnFlight(passenger);
        flight2.bookPassengerOnFlight(passenger);
        assertEquals(2, flight2.getPassengerManifestoLength());
        assertEquals(0, flight2.getRemainingFlightCapacity());
    }

    @Test
    public void canRemovePassengerFromFlight(){
        flight2.bookPassengerOnFlight(passenger);
        flight2.bookPassengerOnFlight(passenger2);
        flight2.removePassengerFromFlight(passenger2);
        assertEquals(1, flight2.getPassengerManifestoLength());
        System.out.println(flight2.printPassengerManifesto());
    }

//    Baggage

    @Test
    public void canAddPassengerBagsToFlight(){
        flight.bookPassengerOnFlight(passenger);
        flight.bookPassengerOnFlight(passenger2);
        assertEquals(3, flight.getTotalBags());
    }


}
