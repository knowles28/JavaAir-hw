public enum AircraftType {
    BOEING747(250),
    AIRBUS380(100),
    CESSNA100(2),
    SUPERJET200(8),
    ;

    private final int capacity;

    AircraftType(int capacity) {
        this.capacity = capacity;
    }

    public int getAircraftCapacity() {
        return capacity;
    }
}
