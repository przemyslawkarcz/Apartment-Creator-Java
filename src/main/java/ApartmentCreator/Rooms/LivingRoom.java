package ApartmentCreator.Rooms;

import ApartmentCreator.Colors.Colors;
import ApartmentCreator.Equipment.*;
import java.util.ArrayList;

public class LivingRoom extends Room{

    public String livingRoomName;
    public Integer livingRoomHeight;
    public Integer livingRoomWidth;
    public Integer livingRoomLength;
    public Colors wallColors;

    public ArrayList<String> livingRoomWindowAccessoriesList = new ArrayList<>();
    public ArrayList<String> livingRoomHousePlantsList = new ArrayList<>();
    public ArrayList<String> livingRoomDecorativeAccessoriesList = new ArrayList<>();
    public ArrayList<String> livingRoomFurnitureList = new ArrayList<>();
    public ArrayList<String> livingRoomLightingAccessoriesList = new ArrayList<>();
    public ArrayList<String> livingRoomAudioVideoItems = new ArrayList<>();

    public LivingRoom() {}

    public LivingRoom(String livingRoomName) {
        this.livingRoomName = livingRoomName;
    }

    public LivingRoom(String livingroomName, Integer livingRoomHeight, Integer livingRoomWidth, Integer livingRoomLength, Colors wallColors,
                      ArrayList<String> livingRoomWindowAccessoriesList, ArrayList<String> livingRoomHousePlantsList,
                      ArrayList<String> livingRoomDecorativeAccessoriesList, ArrayList<String> livingRoomFurnitureList,
                      ArrayList<String> livingRoomLightingAccessoriesList, ArrayList<String> livingRoomAudioVideoItems) {
        this.livingRoomName = livingroomName;
        this.livingRoomHeight = livingRoomHeight;
        this.livingRoomWidth = livingRoomWidth;
        this.livingRoomLength = livingRoomLength;
        this.wallColors = wallColors;
        this.livingRoomWindowAccessoriesList = livingRoomWindowAccessoriesList;
        this.livingRoomHousePlantsList = livingRoomHousePlantsList;
        this.livingRoomDecorativeAccessoriesList = livingRoomDecorativeAccessoriesList;
        this.livingRoomFurnitureList = livingRoomFurnitureList;
        this.livingRoomLightingAccessoriesList = livingRoomLightingAccessoriesList;
        this.livingRoomAudioVideoItems = livingRoomAudioVideoItems;
    }

    public String getLivingRoomName() {
        return livingRoomName;
    }

    public void setLivingRoomName(String livingRoomName) {
        this.livingRoomName = livingRoomName;
    }

    public Integer getLivingRoomHeight() {
        return livingRoomHeight;
    }

    public void setLivingRoomHeight(Integer livingRoomHeight) {
        this.livingRoomHeight = livingRoomHeight;
    }

    public Integer getLivingRoomWidth() {
        return livingRoomWidth;
    }

    public void setLivingRoomWidth(Integer livingRoomWidth) {
        this.livingRoomWidth = livingRoomWidth;
    }

    public Integer getLivingRoomLength() {
        return livingRoomLength;
    }

    public void setLivingRoomLength(Integer livingRoomLength) {
        this.livingRoomLength = livingRoomLength;
    }

    @Override
    public Colors getWallColors() {
        return wallColors;
    }

    @Override
    public void setWallColors(Colors wallColors) {
        this.wallColors = wallColors;
    }

    public ArrayList<String> getLivingRoomWindowAccessoriesList() {
        return livingRoomWindowAccessoriesList;
    }

    public void setLivingRoomWindowAccessoriesList(ArrayList<String> livingRoomWindowAccessoriesList) {
        this.livingRoomWindowAccessoriesList = livingRoomWindowAccessoriesList;
    }

    public ArrayList<String> getLivingRoomHousePlantsList() {
        return livingRoomHousePlantsList;
    }

    public void setLivingRoomHousePlantsList(ArrayList<String> livingRoomHousePlantsList) {
        this.livingRoomHousePlantsList = livingRoomHousePlantsList;
    }

    public ArrayList<String> getLivingRoomDecorativeAccessoriesList() {
        return livingRoomDecorativeAccessoriesList;
    }

    public void setLivingRoomDecorativeAccessoriesList(ArrayList<String> livingRoomDecorativeAccessoriesList) {
        this.livingRoomDecorativeAccessoriesList = livingRoomDecorativeAccessoriesList;
    }

    public ArrayList<String> getLivingRoomFurnitureList() {
        return livingRoomFurnitureList;
    }

    public void setLivingRoomFurnitureList(ArrayList<String> livingRoomFurnitureList) {
        this.livingRoomFurnitureList = livingRoomFurnitureList;
    }

    public ArrayList<String> getLivingRoomLightingAccessoriesList() {
        return livingRoomLightingAccessoriesList;
    }

    public void setLivingRoomLightingAccessoriesList(ArrayList<String> livingRoomLightingAccessoriesList) {
        this.livingRoomLightingAccessoriesList = livingRoomLightingAccessoriesList;
    }

    public ArrayList<String> getLivingRoomAudioVideoItems() {
        return livingRoomAudioVideoItems;
    }

    public void setLivingRoomAudioVideoItems(ArrayList<String> livingRoomAudioVideoItems) {
        this.livingRoomAudioVideoItems = livingRoomAudioVideoItems;
    }

    @Override
    public String toString() {
        return "LivingRoom{" +
                "bedroomName='" + livingRoomName + '\'' +
                ", livingRoomHeight='" + livingRoomHeight + '\'' +
                ", livingRoomWidth='" + livingRoomWidth + '\'' +
                ", livingRoomLength='" + livingRoomLength + '\'' +
                ", wallColors=" + wallColors +
                ", bedroomWindowAccessoriesList=" + livingRoomWindowAccessoriesList +
                ", livingRoomHousePlantsList=" + livingRoomHousePlantsList +
                ", livingRoomDecorativeAccessoriesList=" + livingRoomDecorativeAccessoriesList +
                ", livingRoomFurnitureList=" + livingRoomFurnitureList +
                ", livingRoomLightingAccessoriesList=" + livingRoomLightingAccessoriesList +
                ", livingRoomAudioVideoItems=" + livingRoomAudioVideoItems +
                '}';
    }

    // main method that builds a living room
    public LivingRoom createsLivingroom(){

        LivingRoom livingroom = new LivingRoom("Livingroom", Apartment.getApartmentHeight(), 10, 10, Colors.Grey20,
                livingRoomWindowAccessoriesList, livingRoomHousePlantsList, livingRoomDecorativeAccessoriesList,
                livingRoomFurnitureList, livingRoomLightingAccessoriesList, livingRoomAudioVideoItems);

        WindowAccessories windowAccessories = new WindowAccessories();
        windowAccessories.setBlind("Blinds");
        livingRoomWindowAccessoriesList.add(windowAccessories.getBlind());
        setLivingRoomWindowAccessoriesList(livingRoomWindowAccessoriesList);

        HousePlants housePlants = new HousePlants();
        housePlants.setFlowers("Orchids blue");
        livingRoomHousePlantsList.add(housePlants.getFlowers());
        housePlants.setFlowers("Orchids red");
        livingRoomHousePlantsList.add(housePlants.getFlowers());
        housePlants.setFlowers("Orchids orange");
        livingRoomHousePlantsList.add(housePlants.getFlowers());
        setLivingRoomHousePlantsList(livingRoomHousePlantsList);

        DecorativeAccessories decorativeAccessories = new DecorativeAccessories();
        decorativeAccessories.setPaintings("The Fallen Madonna with the Big Boobies by van Clomp");
        livingRoomDecorativeAccessoriesList.add(decorativeAccessories.getPaintings());
        setLivingRoomDecorativeAccessoriesList(livingRoomDecorativeAccessoriesList);

        Furniture furniture = new Furniture();
        furniture.setArmChair("Armchair");
        furniture.setArmChair("Armchair");
        furniture.setCoffeeTable("Coffee table");
        furniture.setChestOfDrawers("Chest of drawers");
        livingRoomFurnitureList.add(furniture.getArmChair());
        livingRoomFurnitureList.add(furniture.getArmChair());
        livingRoomFurnitureList.add(furniture.getCoffeeTable());
        livingRoomFurnitureList.add(furniture.getChestOfDrawers());
        setLivingRoomFurnitureList(livingRoomFurnitureList);

        LightingAccessories lightingAccessories = new LightingAccessories();
        lightingAccessories.setPendantLamp("Pendant lamp");
        lightingAccessories.setFloorLamp("Floor lamp");
        livingRoomLightingAccessoriesList.add(lightingAccessories.getPendantLamp());
        livingRoomLightingAccessoriesList.add(lightingAccessories.getFloorLamp());
        setLivingRoomLightingAccessoriesList(livingRoomLightingAccessoriesList);

        AudioVideoItems audioVideoItems = new AudioVideoItems();
        audioVideoItems.setMiniStereoSystem("Mini stereo Denon system with speakers");
        livingRoomAudioVideoItems.add(audioVideoItems.getMiniStereoSystem());
        setLivingRoomAudioVideoItems(livingRoomAudioVideoItems);

        return livingroom;
    }
}
