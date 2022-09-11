public class Pilot extends CrewMember {

    private String licenseNum;

    public Pilot(String name, CrewRank crewRank, String licenseNum) {
        super(name, crewRank);
        this.licenseNum = licenseNum;
    }

    public String getLicenseNum() {
        return licenseNum;
    }

    public String flyPlane() {
        return "Talk to me Goose!";
    }
}
