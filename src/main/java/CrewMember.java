public class CrewMember extends Person {

    private CrewRank crewRank;

    public CrewMember(String name, CrewRank crewRank) {
        super(name);
        this.crewRank = crewRank;

    }

    public CrewRank getCrewRankFromEnum() {
        return crewRank;
    }

    public String welcomePassenger() {
        return "Welcome aboard!";
    }
}
