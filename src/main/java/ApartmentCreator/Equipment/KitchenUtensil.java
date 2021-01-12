package ApartmentCreator.Equipment;

public class KitchenUtensil {

    public String kitchenDishes;
    public String cutlery;
    public String cups;
    public String mugs;
    public String glasses;
    public String pots;
    public String pans;
    public String heatResistantDishes;

    public String getKitchenDishes() {
        return kitchenDishes;
    }

    public void setKitchenDishes(String kitchenDishes) {
        this.kitchenDishes = kitchenDishes;
    }

    public String getCutlery() {
        return cutlery;
    }

    public void setCutlery(String cutlery) {
        this.cutlery = cutlery;
    }

    public String getCups() {
        return cups;
    }

    public void setCups(String cups) {
        this.cups = cups;
    }

    public String getMugs() {
        return mugs;
    }

    public void setMugs(String mugs) {
        this.mugs = mugs;
    }

    public String getGlasses() {
        return glasses;
    }

    public void setGlasses(String glasses) {
        this.glasses = glasses;
    }

    public String getPots() {
        return pots;
    }

    public void setPots(String pots) {
        this.pots = pots;
    }

    public String getPans() {
        return pans;
    }

    public void setPans(String pans) {
        this.pans = pans;
    }

    public String getHeatResistantDishes() {
        return heatResistantDishes;
    }

    public void setHeatResistantDishes(String heatResistantDishes) {
        this.heatResistantDishes = heatResistantDishes;
    }

    @Override
    public String toString() {
        return "KitchenUtensil{" +
                "kitchenDishes='" + kitchenDishes + '\'' +
                ", cutlery='" + cutlery + '\'' +
                ", cups='" + cups + '\'' +
                ", mugs='" + mugs + '\'' +
                ", glasses='" + glasses + '\'' +
                ", pots='" + pots + '\'' +
                ", pans='" + pans + '\'' +
                ", heatResistantDishes='" + heatResistantDishes + '\'' +
                '}';
    }

}
