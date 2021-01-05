package ApartmentCreator;

public class BathRoomFittings {

    // aramtura, prysznic, wanna, toaleta, umywalka, bidet,

    public String shower;
    public String bath;
    public String toilet;
    public String sink;
    public String bidet;

    public String getShower() {
        return shower;
    }

    public void setShower(String shower) {
        this.shower = shower;
    }

    public String getBath() {
        return bath;
    }

    public void setBath(String bath) {
        this.bath = bath;
    }

    public String getToilet() {
        return toilet;
    }

    public void setToilet(String toilet) {
        this.toilet = toilet;
    }

    public String getSink() {
        return sink;
    }

    public void setSink(String sink) {
        this.sink = sink;
    }

    public String getBidet() {
        return bidet;
    }

    public void setBidet(String bidet) {
        this.bidet = bidet;
    }

    @Override
    public String toString() {
        return "BathRoomFittings{" +
                "shower='" + shower + '\'' +
                ", bath='" + bath + '\'' +
                ", toilet='" + toilet + '\'' +
                ", sink='" + sink + '\'' +
                ", bidet='" + bidet + '\'' +
                '}';
    }
}
