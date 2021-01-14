package ApartmentCreator.Rooms;

import ApartmentCreator.Colors.Colors;
import ApartmentCreator.Equipment.*;
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
    public ArrayList<String> bathroomFittingsList = new ArrayList<>();
    public ArrayList<String> bathroomToiletriesList = new ArrayList<>();
    public ArrayList<String> bathRoomPersonalItemsList = new ArrayList<>();

    public BathRoom() {}

    public BathRoom(String bathRoomName) {
        this.bathRoomName = bathRoomName;
    }

    public BathRoom(String bathRoomName, Integer bathRoomHeight, Integer bathRoomWidth, Integer bathRoomLength, Colors wallColors,
                    ArrayList<String> bathRoomWindowAccessoriesList, ArrayList<String> bathRoomHousePlantsList,
                    ArrayList<String> bathRoomDecorativeAccessoriesList, ArrayList<String> bathRoomFurnitureList,
                    ArrayList<String> bathRoomLightingAccessoriesList, ArrayList<String> bathRoomHouseholdItemsList,
                    ArrayList<String> bathroomFittingsList, ArrayList<String> bathroomToiletriesList, ArrayList<String> bathRoomPersonalItemsList) {
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
        this.bathroomFittingsList = bathroomFittingsList;
        this.bathroomToiletriesList = bathroomToiletriesList;
        this.bathRoomPersonalItemsList = bathRoomPersonalItemsList;
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

    public ArrayList<String> getBathroomFittingsList() {
        return bathroomFittingsList;
    }

    public void setBathroomFittingsList(ArrayList<String> bathroomFittingsList) {
        this.bathroomFittingsList = bathroomFittingsList;
    }

    public ArrayList<String> getBathroomToiletriesList() {
        return bathroomToiletriesList;
    }

    public void setBathroomToiletriesList(ArrayList<String> bathroomToiletriesList) {
        this.bathroomToiletriesList = bathroomToiletriesList;
    }

    public ArrayList<String> getBathRoomPersonalItemsList() {
        return bathRoomPersonalItemsList;
    }

    public void setBathRoomPersonalItemsList(ArrayList<String> bathRoomPersonalItemsList) {
        this.bathRoomPersonalItemsList = bathRoomPersonalItemsList;
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
                ", bathroomFittings=" + bathroomFittingsList +
                ", bathroomToiletries=" + bathroomToiletriesList +
                ", bathRoomPersonalItems=" + bathRoomPersonalItemsList +
                '}';
    }

    // main method which builds bathroom
    public BathRoom createsBathRoom(){

        BathRoom bathRoom = new BathRoom("Bathroom", Apartment.getApartmentHeight(), 10, 10, Colors.Grey10,
                bathRoomWindowAccessoriesList, bathRoomHousePlantsList, bathRoomDecorativeAccessoriesList, bathRoomFurnitureList,
                bathRoomLightingAccessoriesList, bathRoomHouseholdItemsList, bathroomFittingsList, bathroomToiletriesList, bathRoomPersonalItemsList);

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
        bathroomFittingsList.add(bathRoomFittings.getShower());
        bathroomFittingsList.add(bathRoomFittings.getToilet());
        bathroomFittingsList.add(bathRoomFittings.getSink());
        setBathroomFittingsList(bathroomFittingsList);

        BathRoomToiletries bathRoomToiletrie = new BathRoomToiletries();
        bathRoomToiletrie.setSoaps("Liquid soap");
        bathroomToiletriesList.add(bathRoomToiletrie.getSoaps());
        setBathroomToiletriesList(bathroomToiletriesList);

        BathRoomPersonalItems bathRoomPersonalItem = new BathRoomPersonalItems();
        bathRoomPersonalItem.setTowels("Egyptian cotton towel");
        bathRoomPersonalItemsList.add(bathRoomPersonalItem.getTowels());
        setBathRoomPersonalItemsList(bathRoomPersonalItemsList);

        return bathRoom;
    }
}
