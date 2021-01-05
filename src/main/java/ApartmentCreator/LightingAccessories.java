package ApartmentCreator;

public class LightingAccessories {

    public String pendantLamp;
    public String floorLamp;
    public String wallLamp;

    public String getPendantLamp() {
        return pendantLamp;
    }

    public void setPendantLamp(String pendantLamp) {
        this.pendantLamp = pendantLamp;
    }

    public String getFloorLamp() {
        return floorLamp;
    }

    public void setFloorLamp(String floorLamp) {
        this.floorLamp = floorLamp;
    }

    public String getWallLamp() {
        return wallLamp;
    }

    public void setWallLamp(String wallLamp) {
        this.wallLamp = wallLamp;
    }

    @Override
    public String toString() {
        return "LightingAccessories{" +
                "pendantLamp='" + pendantLamp + '\'' +
                ", floorLamp='" + floorLamp + '\'' +
                ", wallLamp='" + wallLamp + '\'' +
                '}';
    }
}
