public enum AircraftType {
    BOEING747(250, 4000),
    AIRBUS380(100, 3000),
    CESSNA100(2,200),
    SUPERJET200(8, 800),
    ;

    private final int capacity;
    private final int maxWeightInKilos;

    AircraftType(int capacity, int maxWeightInKilos) {
        this.capacity = capacity;
        this.maxWeightInKilos = maxWeightInKilos;
    }

    public int getAircraftCapacity() {
        return capacity;
    }

    public int getMaxWeightInKilos(){
        return maxWeightInKilos;
    }
}
