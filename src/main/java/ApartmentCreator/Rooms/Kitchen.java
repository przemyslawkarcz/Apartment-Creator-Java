package ApartmentCreator.Rooms;

import ApartmentCreator.Colors.Colors;
import ApartmentCreator.Equipment.*;
import ApartmentCreator.KitchenRebuilder;

import java.util.ArrayList;

public class Kitchen extends Room{

    public String kitchenName;
    public Integer kitchenHeight;
    public Integer kitchenWidth;
    public Integer kitchenLength;
    public Colors wallColors;

    public ArrayList<String> kitchenWindowAccessoriesList = new ArrayList<>();
    public ArrayList<String> kitchenHousePlantsList = new ArrayList<>();
    public ArrayList<String> kitchenDecorativeAccessoriesList = new ArrayList<>();
    public ArrayList<String> kitchenFurnitureList = new ArrayList<>();
    public ArrayList<String> kitchenLightingAccessoriesList = new ArrayList<>();
    public ArrayList<String> kitchenHouseholdItemsList = new ArrayList<>();
    public ArrayList<String> kitchenUtensilList = new ArrayList<>();

    public Kitchen() {}

    public Kitchen(String kitchenName) {
        this.kitchenName = kitchenName;
    }

    public Kitchen(String kitchenName, Integer kitchenHeight, Integer kitchenWidth, Integer kitchenLength, Colors wallColors,
                   ArrayList<String> kitchenWindowAccessoriesList, ArrayList<String> kitchenHousePlantsList,
                   ArrayList<String> kitchenDecorativeAccessoriesList, ArrayList<String> kitchenFurnitureList, ArrayList<String> kitchenLightingAccessoriesList,
                   ArrayList<String> kitchenHouseholdItemsList, ArrayList<String> kitchenUtensilList) {
        this.kitchenName = kitchenName;
        this.kitchenHeight = kitchenHeight;
        this.kitchenWidth = kitchenWidth;
        this.kitchenLength = kitchenLength;
        this.wallColors = wallColors;
        this.kitchenWindowAccessoriesList = kitchenWindowAccessoriesList;
        this.kitchenHousePlantsList = kitchenHousePlantsList;
        this.kitchenDecorativeAccessoriesList = kitchenDecorativeAccessoriesList;
        this.kitchenFurnitureList = kitchenFurnitureList;
        this.kitchenLightingAccessoriesList = kitchenLightingAccessoriesList;
        this.kitchenHouseholdItemsList = kitchenHouseholdItemsList;
        this.kitchenUtensilList = kitchenUtensilList;
    }

    public String getKitchenName() {
        return kitchenName;
    }

    public void setKitchenName(String kitchenName) {
        this.kitchenName = kitchenName;
    }

    public Integer getKitchenHeight() {
        return kitchenHeight;
    }

    public void setKitchenHeight(Integer kitchenHeight) {
        this.kitchenHeight = kitchenHeight;
    }

    public Integer getKitchenWidth() {
        return kitchenWidth;
    }

    public void setKitchenWidth(Integer kitchenWidth) {
        this.kitchenWidth = kitchenWidth;
    }

    public Integer getKitchenLength() {
        return kitchenLength;
    }

    public void setKitchenLength(Integer kitchenLength) {
        this.kitchenLength = kitchenLength;
    }

    @Override
    public Colors getWallColors() {
        return wallColors;
    }

    @Override
    public void setWallColors(Colors wallColors) {
        this.wallColors = wallColors;
    }

    public ArrayList<String> getKitchenWindowAccessoriesList() {
        return kitchenWindowAccessoriesList;
    }

    public void setKitchenWindowAccessoriesList(ArrayList<String> kitchenWindowAccessoriesList) {
        this.kitchenWindowAccessoriesList = kitchenWindowAccessoriesList;
    }

    public ArrayList<String> getKitchenHousePlantsList() {
        return kitchenHousePlantsList;
    }

    public void setKitchenHousePlantsList(ArrayList<String> kitchenHousePlantsList) {
        this.kitchenHousePlantsList = kitchenHousePlantsList;
    }

    public ArrayList<String> getKitchenDecorativeAccessoriesList() {
        return kitchenDecorativeAccessoriesList;
    }

    public void setKitchenDecorativeAccessoriesList(ArrayList<String> kitchenDecorativeAccessoriesList) {
        this.kitchenDecorativeAccessoriesList = kitchenDecorativeAccessoriesList;
    }

    public ArrayList<String> getKitchenFurnitureList() {
        return kitchenFurnitureList;
    }

    public void setKitchenFurnitureList(ArrayList<String> kitchenFurnitureList) {
        this.kitchenFurnitureList = kitchenFurnitureList;
    }

    public ArrayList<String> getKitchenLightingAccessoriesList() {
        return kitchenLightingAccessoriesList;
    }

    public void setKitchenLightingAccessoriesList(ArrayList<String> kitchenLightingAccessoriesList) {
        this.kitchenLightingAccessoriesList = kitchenLightingAccessoriesList;
    }

    public ArrayList<String> getKitchenHouseholdItemsList() {
        return kitchenHouseholdItemsList;
    }

    public void setKitchenHouseholdItemsList(ArrayList<String> kitchenHouseholdItemsList) {
        this.kitchenHouseholdItemsList = kitchenHouseholdItemsList;
    }

    public ArrayList<String> getKitchenUtensilList() {
        return kitchenUtensilList;
    }

    public void setKitchenUtensilList(ArrayList<String> kitchenUtensilList) {
        this.kitchenUtensilList = kitchenUtensilList;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "kitchenName='" + kitchenName + '\'' +
                ", kitchenHeight=" + kitchenHeight +
                ", kitchenWidth=" + kitchenWidth +
                ", kitchenLength=" + kitchenLength +
                ", wallColors=" + wallColors +
                ", kitchenWindowAccessoriesList=" + kitchenWindowAccessoriesList +
                ", kitchenHousePlantsList=" + kitchenHousePlantsList +
                ", kitchenDecorativeAccessoriesList=" + kitchenDecorativeAccessoriesList +
                ", kitchenFurnitureList=" + kitchenFurnitureList +
                ", kitchenLightingAccessoriesList=" + kitchenLightingAccessoriesList +
                ", kitchenHouseholdItemsList=" + kitchenHouseholdItemsList +
                ", kitchenUtensilList=" + kitchenUtensilList +
                '}';
    }

    // main method that builds a kitchen
    public Kitchen createsKitchen(){

        Kitchen kitchen = new Kitchen(KitchenRebuilder.getDefaultKitchenName(), Apartment.getApartmentHeight(),
                KitchenRebuilder.getDefaultKitchenWidth(), KitchenRebuilder.getDefaultKitchenLength(),
                KitchenRebuilder.getDefaultKitchenColor(),
                kitchenWindowAccessoriesList, kitchenHousePlantsList, kitchenDecorativeAccessoriesList,
                kitchenFurnitureList, kitchenLightingAccessoriesList, kitchenHouseholdItemsList, kitchenUtensilList);

        WindowAccessories windowAccessories = new WindowAccessories();
        windowAccessories.setBlind(KitchenRebuilder.getDefaultKitchenWindowsAccessories_Blinds());
        windowAccessories.setVerticalBlinds(KitchenRebuilder.getDefaultKitchenWindowsAccessories_VerticalBlinds());
        windowAccessories.setCurtain(KitchenRebuilder.getDefaultKitchenWindowsAccessories_Curtain());
        windowAccessories.setShutter(KitchenRebuilder.getDefaultKitchenWindowsAccessories_Shutter());
        kitchenWindowAccessoriesList.add(windowAccessories.getBlind());
        kitchenWindowAccessoriesList.add(windowAccessories.getVerticalBlinds());
        kitchenWindowAccessoriesList.add(windowAccessories.getCurtain());
        kitchenWindowAccessoriesList.add(windowAccessories.getShutter());
        setKitchenWindowAccessoriesList(kitchenWindowAccessoriesList);

        HousePlants housePlants = new HousePlants();
        housePlants.setFlowers(KitchenRebuilder.getDefaultKitchenHousePlants());
        kitchenHousePlantsList.add(housePlants.getFlowers());
        setKitchenHousePlantsList(kitchenHousePlantsList);

        DecorativeAccessories decorativeAccessories = new DecorativeAccessories();
        decorativeAccessories.setPictures(KitchenRebuilder.getDefaultKitchenDecorativeAccessories_Pictures());
        decorativeAccessories.setPosters(KitchenRebuilder.getDefaultKitchenDecorativeAccessories_Posters());
        decorativeAccessories.setPaintings(KitchenRebuilder.getDefaultKitchenDecorativeAccessories_Paintings());
        kitchenDecorativeAccessoriesList.add(decorativeAccessories.getPictures());
        kitchenDecorativeAccessoriesList.add(decorativeAccessories.getPosters());
        kitchenDecorativeAccessoriesList.add(decorativeAccessories.getPaintings());
        setKitchenDecorativeAccessoriesList(kitchenDecorativeAccessoriesList);

        Furniture furniture = new Furniture();
        furniture.setHangingKitchenCabinets(KitchenRebuilder.getDefaultKitchenFurniture_HangingKitchenCabinets());
        furniture.setUndercounterKitchenCabinets(KitchenRebuilder.getDefaultKitchenFurniture_UndercounterKitchenCabinets());
        furniture.setKitchenChairs(KitchenRebuilder.getDefaultKitchenFurniture_KitchenChairs());
        furniture.setKitchenTable(KitchenRebuilder.getDefaultKitchenFurniture_KitchenTable());
        kitchenFurnitureList.add(furniture.getHangingKitchenCabinets());
        kitchenFurnitureList.add(furniture.getUndercounterKitchenCabinets());
        kitchenFurnitureList.add(furniture.getKitchenChairs());
        kitchenFurnitureList.add(furniture.getKitchenTable());
        setKitchenFurnitureList(kitchenFurnitureList);

        LightingAccessories lightingAccessories = new LightingAccessories();
        lightingAccessories.setPendantLamp("Pendant lamp");
        kitchenLightingAccessoriesList.add(lightingAccessories.getPendantLamp());
        setKitchenLightingAccessoriesList(kitchenLightingAccessoriesList);

        HouseholdItems householdItems = new HouseholdItems();
        householdItems.setWashingMachine("Washing machine");
        householdItems.setFoodProcessor("Food processor");
        householdItems.setFridge("Fridge");
        householdItems.setKettle("Kettle");
        householdItems.setKitchenHood("Kitchen hood");
        householdItems.setOven("Kitchen oven");
        kitchenHouseholdItemsList.add(householdItems.getWashingMachine());
        kitchenHouseholdItemsList.add(householdItems.getFoodProcessor());
        kitchenHouseholdItemsList.add(householdItems.getFridge());
        kitchenHouseholdItemsList.add(householdItems.getKettle());
        kitchenHouseholdItemsList.add(householdItems.getKitchenHood());
        kitchenHouseholdItemsList.add(householdItems.getOven());
        setKitchenHouseholdItemsList(kitchenHouseholdItemsList);

        KitchenUtensil kitchenUtensil = new KitchenUtensil();
        kitchenUtensil.setCups("Cup");
        kitchenUtensil.setCups("Cup");
        kitchenUtensilList.add(kitchenUtensil.getCups());
        kitchenUtensilList.add(kitchenUtensil.getCups());
        setKitchenUtensilList(kitchenUtensilList);

        return kitchen;
    }
}
