package ApartmentCreator;

public class BathRoomToiletries {

    public String soaps;
    public String gels;

    public String getSoaps() {
        return soaps;
    }

    public void setSoaps(String soaps) {
        this.soaps = soaps;
    }

    public String getGels() {
        return gels;
    }

    public void setGels(String gels) {
        this.gels = gels;
    }

    @Override
    public String toString() {
        return "BathRoomToiletries{" +
                "soaps='" + soaps + '\'' +
                ", gels='" + gels + '\'' +
                '}';
    }
}
