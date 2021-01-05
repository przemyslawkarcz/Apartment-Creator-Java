package ApartmentCreator;

public class HouseholdItems {

    public String fridge;
    public String washingMachine;
    public String inductionHob;
    public String kitchenHood;
    public String oven;
    public String kettle;
    public String foodProcessor;

    public String getFridge() {
        return fridge;
    }

    public void setFridge(String fridge) {
        this.fridge = fridge;
    }

    public String getWashingMachine() {
        return washingMachine;
    }

    public void setWashingMachine(String washingMachine) {
        this.washingMachine = washingMachine;
    }

    public String getInductionHob() {
        return inductionHob;
    }

    public void setInductionHob(String inductionHob) {
        this.inductionHob = inductionHob;
    }

    public String getKitchenHood() {
        return kitchenHood;
    }

    public void setKitchenHood(String kitchenHood) {
        this.kitchenHood = kitchenHood;
    }

    public String getOven() {
        return oven;
    }

    public void setOven(String oven) {
        this.oven = oven;
    }

    public String getKettle() {
        return kettle;
    }

    public void setKettle(String kettle) {
        this.kettle = kettle;
    }

    public String getFoodProcessor() {
        return foodProcessor;
    }

    public void setFoodProcessor(String foodProcessor) {
        this.foodProcessor = foodProcessor;
    }

    @Override
    public String toString() {
        return "HouseholdItems{" +
                "fridge='" + fridge + '\'' +
                ", washingMachine='" + washingMachine + '\'' +
                ", inductionHob='" + inductionHob + '\'' +
                ", kitchenHood='" + kitchenHood + '\'' +
                ", oven='" + oven + '\'' +
                ", kettle='" + kettle + '\'' +
                ", foodProcessor='" + foodProcessor + '\'' +
                '}';
    }
}
