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

    //    FLIGHT DETAILS --------------


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

    //   PILOTS & CREW --------------


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

//    PASSENGERS --------------


    public int getPassengerManifestoLength() {
        return this.passengerManifesto.size();
    }

    public void bookPassengerOnFlight(Passenger passenger) {
        if (    getAircraftCapacityFromEnum() > getPassengerManifestoLength() &&
                getBaggageWeightPerPassenger(passenger) < getBaggageWeightAllowancePerPassenger()
            ) {
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

//    BAGGAGE --------------


    public int getBaggageWeightAllowancePerPassenger(){
        return getAircraftMaxBaggageWeightFromEnum() / getAircraftCapacityFromEnum();
    }

    public int getBaggageWeightPerPassenger(Passenger passenger){
        int perBagMax = 20;
        return passenger.getBags() * perBagMax;
    }

    public int getTotalWeightOfAllPassengerBaggage(){
        int perBagMax = 20;
        return this.totalBags * perBagMax;
    }

    public int getRemainingAvailableBaggageWeightForFlight(){
        return getAircraftMaxBaggageWeightFromEnum() - getTotalWeightOfAllPassengerBaggage();
    }
    

}

