package ApartmentCreator;

public class WindowAccessories {

    public String curtain;
    public String blind;
    public String verticalBlinds;
    public String shutter;

    public String getCurtain() {
        return curtain;
    }

    public void setCurtain(String curtain) {
        this.curtain = curtain;
    }

    public String getBlind() {
        return blind;
    }

    public void setBlind(String blind) {
        this.blind = blind;
    }

    public String getVerticalBlinds() {
        return verticalBlinds;
    }

    public void setVerticalBlinds(String verticalBlinds) {
        this.verticalBlinds = verticalBlinds;
    }

    public String getShutter() {
        return shutter;
    }

    public void setShutter(String shutter) {
        this.shutter = shutter;
    }

    @Override
    public String toString() {
        return "WindowAccessories{" +
                "curtain='" + curtain + '\'' +
                ", blind='" + blind + '\'' +
                ", verticalBlinds='" + verticalBlinds + '\'' +
                ", shutter='" + shutter + '\'' +
                '}';
    }
}
