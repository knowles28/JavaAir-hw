public class Plane {

    private AircraftType aircraftType;

    public Plane(AircraftType aircraftType) {
        this.aircraftType = aircraftType;
    }

    public AircraftType getAircraftTypeFromEnum() {
        return aircraftType;
    }


    public int getAircraftCapacityFromEnum() {
        return aircraftType.getAircraftCapacity();
    }

    public int getAircraftMaxBaggageWeightFromEnum(){
        return aircraftType.getMaxWeightInKilos() / 2;
    }
}
