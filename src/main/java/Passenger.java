public class Passenger extends Person {

    private int bags;
    private String flightNumber;

    public Passenger(String name, int bags) {
        super(name);
        this.bags = bags;
        this.flightNumber = new String();
    }

    public int getBags() {
        return bags;
    }

    public String toString(){
        return "NAME: '" + getName() + "' - Bags: " + getBags();
    }


    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
}
