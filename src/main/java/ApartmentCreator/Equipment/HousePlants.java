package ApartmentCreator.Equipment;

public class HousePlants {

    public String flowers;

    public String getFlowers() {
        return flowers;
    }

    public void setFlowers(String flowers) {
        this.flowers = flowers;
    }

    @Override
    public String toString() {
        return "HousePlants{" +
                "flowers='" + flowers + '\'' +
                '}';
    }

}
