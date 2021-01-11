package ApartmentCreator;

import java.util.ArrayList;

public class BathRoom extends Room {

    public String bathRoomName;
    public Integer bathRoomHeight;
    public Integer bathRoomWidth;
    public Integer bathRoomLength;
    public Colors wallColors;

    public ArrayList<String> bathRoomWindowAccessoriesList = new ArrayList<>();
    public ArrayList<String> bathRoomHousePlantsList = new ArrayList<>();
    public ArrayList<String> bathRoomDecorativeAccessoriesList = new ArrayList<>();
    public ArrayList<String> bathRoomFurnitureList = new ArrayList<>();
    public ArrayList<String> bathRoomLightingAccessoriesList = new ArrayList<>();

    public ArrayList<String> bathRoomHouseholdItemsList = new ArrayList<>();
    public ArrayList<String> bathroomFittings = new ArrayList<>();
    public ArrayList<String> bathroomToiletries = new ArrayList<>();
    public ArrayList<String> bathRoomPersonalItems = new ArrayList<>(); 

    public BathRoom() {}

    public BathRoom(String bathRoomName, Integer bathRoomHeight, Integer bathRoomWidth, Integer bathRoomLength, Colors wallColors,
                    ArrayList<String> bathRoomWindowAccessoriesList, ArrayList<String> bathRoomHousePlantsList,
                    ArrayList<String> bathRoomDecorativeAccessoriesList, ArrayList<String> bathRoomFurnitureList,
                    ArrayList<String> bathRoomLightingAccessoriesList, ArrayList<String> bathRoomHouseholdItemsList,
                    ArrayList<String> bathroomFittings, ArrayList<String> bathroomToiletries, ArrayList<String> bathRoomPersonalItems) {
        this.bathRoomName = bathRoomName;
        this.bathRoomHeight = bathRoomHeight;
        this.bathRoomWidth = bathRoomWidth;
        this.bathRoomLength = bathRoomLength;
        this.wallColors = wallColors;
        this.bathRoomWindowAccessoriesList = bathRoomWindowAccessoriesList;
        this.bathRoomHousePlantsList = bathRoomHousePlantsList;
        this.bathRoomDecorativeAccessoriesList = bathRoomDecorativeAccessoriesList;
        this.bathRoomFurnitureList = bathRoomFurnitureList;
        this.bathRoomLightingAccessoriesList = bathRoomLightingAccessoriesList;
        this.bathRoomHouseholdItemsList = bathRoomHouseholdItemsList;
        this.bathroomFittings = bathroomFittings;
        this.bathroomToiletries = bathroomToiletries;
        this.bathRoomPersonalItems = bathRoomPersonalItems;
    }

    public String getBathRoomName() {
        return bathRoomName;
    }

    public void setBathRoomName(String bathRoomName) {
        this.bathRoomName = bathRoomName;
    }

    public Integer getBathRoomHeight() {
        return bathRoomHeight;
    }

    public void setBathRoomHeight(Integer bathRoomHeight) {
        this.bathRoomHeight = bathRoomHeight;
    }

    public Integer getBathRoomWidth() {
        return bathRoomWidth;
    }

    public void setBathRoomWidth(Integer bathRoomWidth) {
        this.bathRoomWidth = bathRoomWidth;
    }

    public Integer getBathRoomLength() {
        return bathRoomLength;
    }

    public void setBathRoomLength(Integer bathRoomLength) {
        this.bathRoomLength = bathRoomLength;
    }

    public Colors getWallColors() {
        return wallColors;
    }

    public void setWallColors(Colors wallColors) {
        this.wallColors = wallColors;
    }

    public ArrayList<String> getBathRoomWindowAccessoriesList() {
        return bathRoomWindowAccessoriesList;
    }

    public void setBathRoomWindowAccessoriesList(ArrayList<String> bathRoomWindowAccessoriesList) {
        this.bathRoomWindowAccessoriesList = bathRoomWindowAccessoriesList;
    }

    public ArrayList<String> getBathRoomHousePlantsList() {
        return bathRoomHousePlantsList;
    }

    public void setBathRoomHousePlantsList(ArrayList<String> bathRoomHousePlantsList) {
        this.bathRoomHousePlantsList = bathRoomHousePlantsList;
    }

    public ArrayList<String> getBathRoomDecorativeAccessoriesList() {
        return bathRoomDecorativeAccessoriesList;
    }

    public void setBathRoomDecorativeAccessoriesList(ArrayList<String> bathRoomDecorativeAccessoriesList) {
        this.bathRoomDecorativeAccessoriesList = bathRoomDecorativeAccessoriesList;
    }

    public ArrayList<String> getBathRoomFurnitureList() {
        return bathRoomFurnitureList;
    }

    public void setBathRoomFurnitureList(ArrayList<String> bathRoomFurnitureList) {
        this.bathRoomFurnitureList = bathRoomFurnitureList;
    }

    public ArrayList<String> getBathRoomLightingAccessoriesList() {
        return bathRoomLightingAccessoriesList;
    }

    public void setBathRoomLightingAccessoriesList(ArrayList<String> bathRoomLightingAccessoriesList) {
        this.bathRoomLightingAccessoriesList = bathRoomLightingAccessoriesList;
    }

    public ArrayList<String> getBathRoomHouseholdItemsList() {
        return bathRoomHouseholdItemsList;
    }

    public void setBathRoomHouseholdItemsList(ArrayList<String> bathRoomHouseholdItemsList) {
        this.bathRoomHouseholdItemsList = bathRoomHouseholdItemsList;
    }

    public ArrayList<String> getBathroomFittings() {
        return bathroomFittings;
    }

    public void setBathroomFittings(ArrayList<String> bathroomFittings) {
        this.bathroomFittings = bathroomFittings;
    }

    public ArrayList<String> getBathroomToiletries() {
        return bathroomToiletries;
    }

    public void setBathroomToiletries(ArrayList<String> bathroomToiletries) {
        this.bathroomToiletries = bathroomToiletries;
    }

    public ArrayList<String> getBathRoomPersonalItems() {
        return bathRoomPersonalItems;
    }

    public void setBathRoomPersonalItems(ArrayList<String> bathRoomPersonalItems) {
        this.bathRoomPersonalItems = bathRoomPersonalItems;
    }

    @Override
    public String toString() {
        return "BathRoom{" +
                "bathRoomName='" + bathRoomName + '\'' +
                ", bathRoomHeight=" + bathRoomHeight +
                ", bathRoomWidth=" + bathRoomWidth +
                ", bathRoomLength=" + bathRoomLength +
                ", wallColors=" + wallColors +
                ", bathRoomWindowAccessoriesList=" + bathRoomWindowAccessoriesList +
                ", bathRoomHousePlantsList=" + bathRoomHousePlantsList +
                ", bathRoomDecorativeAccessoriesList=" + bathRoomDecorativeAccessoriesList +
                ", bathRoomFurnitureList=" + bathRoomFurnitureList +
                ", bathRoomLightingAccessoriesList=" + bathRoomLightingAccessoriesList +
                ", bathRoomHouseholdItemsList=" + bathRoomHouseholdItemsList +
                ", bathroomFittings=" + bathroomFittings +
                ", bathroomToiletries=" + bathroomToiletries +
                ", bathRoomPersonalItems=" + bathRoomPersonalItems +
                '}';
    }

    public BathRoom createsBathRoom(){

        BathRoom bathRoom = new BathRoom("Bathroom", Apartment.getApartmentHeight(), 5, 5, Colors.Grey10,
                bathRoomWindowAccessoriesList, bathRoomHousePlantsList, bathRoomDecorativeAccessoriesList, bathRoomFurnitureList,
                bathRoomLightingAccessoriesList, bathRoomHouseholdItemsList, bathroomFittings, bathroomToiletries, bathRoomPersonalItems);

        WindowAccessories windowAccessories = new WindowAccessories();
        windowAccessories.setVerticalBlinds("Vertical blinds");
        bathRoomWindowAccessoriesList.add(windowAccessories.getVerticalBlinds());
        setBathRoomWindowAccessoriesList(bathRoomWindowAccessoriesList);

        HousePlants housePlants = new HousePlants();
        housePlants.setFlowers("palm");
        bathRoomHousePlantsList.add(housePlants.getFlowers());
        setBathRoomHousePlantsList(bathRoomHousePlantsList);

        DecorativeAccessories decorativeAccessories = new DecorativeAccessories();
        decorativeAccessories.setPosters("Toronto skyscrapers");
        bathRoomDecorativeAccessoriesList.add(decorativeAccessories.getPosters());
        setBathRoomDecorativeAccessoriesList(bathRoomDecorativeAccessoriesList);

        Furniture furniture = new Furniture();
        furniture.setSmallStandingWardrobe("Bathroom small standing wardrobe");
        bathRoomFurnitureList.add(furniture.getSmallStandingWardrobe());
        setBathRoomFurnitureList(bathRoomFurnitureList);

        LightingAccessories lightingAccessories = new LightingAccessories();
        lightingAccessories.setWallLamp("Bathroom wall lamp");
        lightingAccessories.setPendantLamp("Bathroom pendant lamp");
        bathRoomLightingAccessoriesList.add(lightingAccessories.getWallLamp());
        bathRoomLightingAccessoriesList.add(lightingAccessories.getPendantLamp());
        setBathRoomFurnitureList(bathRoomFurnitureList);

        HouseholdItems householdItems = new HouseholdItems();
        householdItems.setWashingMachine("Washing machine");
        bathRoomHouseholdItemsList.add(householdItems.getWashingMachine());
        setBathRoomHouseholdItemsList(bathRoomHouseholdItemsList);

        BathRoomFittings bathRoomFittings = new BathRoomFittings();
        bathRoomFittings.setShower("Shower");
        bathRoomFittings.setToilet("Toilet");
        bathRoomFittings.setSink("Sink");
        bathroomFittings.add(bathRoomFittings.getShower());
        bathroomFittings.add(bathRoomFittings.getToilet());
        bathroomFittings.add(bathRoomFittings.getSink());
        setBathroomFittings(bathroomFittings);

        BathRoomToiletries bathRoomToiletrie = new BathRoomToiletries();
        bathRoomToiletrie.setSoaps("Liquid soap");
        bathroomToiletries.add(bathRoomToiletrie.getSoaps());
        setBathroomToiletries(bathroomToiletries);

        BathRoomPersonalItems bathRoomPersonalItem = new BathRoomPersonalItems();
        bathRoomPersonalItem.setTowels("Egyptian cotton towel");
        bathRoomPersonalItems.add(bathRoomPersonalItem.getTowels());
        setBathRoomPersonalItems(bathRoomPersonalItems);

        return bathRoom;
    }
}
