import java.util.ArrayList;

public class Flight extends Plane {

    private String flightNumber;
    private String departureAirport;
    private String destinationAirport;
    private String departureTime;


    private ArrayList<Pilot> cockpit;
    private ArrayList<CrewMember> cabinCrewList;
    private ArrayList<Passenger> passengerManifesto;

    private int totalBags;

    public Flight(AircraftType aircraftType, String flightNumber, String departureAirport, String destinationAirport, String departureTime, int totalBags) {
        super(aircraftType);
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;
        this.cockpit = new ArrayList<Pilot>();
        this.cabinCrewList = new ArrayList<CrewMember>();
        this.passengerManifesto = new ArrayList<Passenger>();
        this.totalBags = totalBags;

    }


    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getTotalBags(){
        return totalBags;
    }


    public int getCockpitCapacity() {
        return cockpit.size();
    }

    public void addPilotToCockpit(Pilot pilot) {
        if (this.cockpit.size() < 2) {
            this.cockpit.add(pilot);
        }
    }


    public int getCabinCrewTotal() {
        return this.cabinCrewList.size();
    }

    public void addCabinCrew(CrewMember cabinCrew) {
        if (this.cabinCrewList.size() < 3) {
            this.cabinCrewList.add(cabinCrew);
        }
    }


    public int getPassengerManifestoLength() {
        return this.passengerManifesto.size();
    }

    public void bookPassengerOnFlight(Passenger passenger) {
        if (getAircraftCapacityFromEnum() > getPassengerManifestoLength()) {
            this.passengerManifesto.add(passenger);
            this.totalBags += passenger.getBags();
        }
    }

    public void removePassengerFromFlight(Passenger passenger) {
        this.passengerManifesto.remove(passenger);
    }


    public String printPassengerManifesto() {
        return this.passengerManifesto.toString();
    }
//            for(Passenger name : passengerManifesto){
//            System.out.println(name);

    public int getRemainingFlightCapacity() {
        int capacity = getAircraftCapacityFromEnum() - getPassengerManifestoLength();
        return capacity;
    }


//    Each passenger bag weighs the same
//Planes reserve half of their total weight for passenger bags
//The weight of bag per person is the weight reserved for passenger bags divided by the capacity

//    Create a FlightManager which can:
//
// calculate how much baggage weight should be reserved for each passenger for a flight
// calculate how much baggage weight is booked by passengers of a flight
// calculate how much overall weight reserved for baggage remains for a flight


// - ADD MAX WEIGHT FOR EACH AIRCRAFT TYPE
// - FUNCTION baggage weight for each passenger (in plane?): TAKE MAX WEIGHT, DIVIDE BY 2, THEN DIVIDE BY AIRCRAFT CAPACITY
// - FUNCTION total booked weight: MULTIPLY BAG TOTAL BY 10
// - FUNCTION total weight of baggage: TAKE MAX WEIGHT, DIVIDE BY 2, MINUS TOTAL BOOKED WEIGHT




}

