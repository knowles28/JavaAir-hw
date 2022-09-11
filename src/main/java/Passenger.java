public class Passenger extends Person {

    private int bags;

    public Passenger(String name, int bags) {
        super(name);
        this.bags = bags;
    }

    public int getBags() {
        return bags;
    }

    public String toString(){
        return "NAME: '" + getName() + "' - Bags: " + getBags();
    }
}
