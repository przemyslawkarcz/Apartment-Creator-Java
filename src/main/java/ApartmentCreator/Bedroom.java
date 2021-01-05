package ApartmentCreator;

import java.util.ArrayList;

public class Bedroom extends Room {

    public String bedroomName;
    public Integer bedroomHeight;
    public Integer bedroomWidth;
    public Integer bedroomLength;
    public Colors wallColors;

    public ArrayList<String> bedroomWindowAccessoriesList = new ArrayList<>();
    public ArrayList<String> bedroomHousePlantsList = new ArrayList<>();
    public ArrayList<String> bedroomFurnitureList = new ArrayList<>();
    public ArrayList<String> bedroomLightingAccessoriesList = new ArrayList<>();

    public Bedroom () {}

    public Bedroom(String bedroomName, Integer bedroomHeight, Integer bedroomWidth, Integer bedroomLength, Colors wallColors,
                   ArrayList<String> bedroomWindowAccessoriesList, ArrayList<String> bedroomHousePlantsList,
                   ArrayList<String> bedroomFurnitureList, ArrayList<String> bedroomLightingAccessoriesList) {
        this.bedroomName = bedroomName;
        this.bedroomHeight = bedroomHeight;
        this.bedroomWidth = bedroomWidth;
        this.bedroomLength = bedroomLength;
        this.wallColors = wallColors;
        this.bedroomWindowAccessoriesList = bedroomWindowAccessoriesList;
        this.bedroomHousePlantsList = bedroomHousePlantsList;
        this.bedroomFurnitureList = bedroomFurnitureList;
        this.bedroomLightingAccessoriesList = bedroomLightingAccessoriesList;
    }

    public String getBedroomName() {
        return bedroomName;
    }

    public void setBedroomName(String bedroomName) {
        this.bedroomName = bedroomName;
    }

    public Integer getBedroomHeight() {
        return bedroomHeight;
    }

    public void setBedroomHeight(Integer bedroomHeight) {
        this.bedroomHeight = bedroomHeight;
    }

    public Integer getBedroomWidth() {
        return bedroomWidth;
    }

    public void setBedroomWidth(Integer bedroomWidth) {
        this.bedroomWidth = bedroomWidth;
    }

    public Integer getBedroomLength() {
        return bedroomLength;
    }

    public void setBedroomLength(Integer bedroomLength) {
        this.bedroomLength = bedroomLength;
    }

    @Override
    public Colors getWallColors() {
        return wallColors;
    }

    @Override
    public void setWallColors(Colors wallColors) {
        this.wallColors = wallColors;
    }

    public ArrayList<String> getBedroomWindowAccessoriesList() {
        return bedroomWindowAccessoriesList;
    }

    public void setBedroomWindowAccessoriesList(ArrayList<String> bedroomWindowAccessoriesList) {
        this.bedroomWindowAccessoriesList = bedroomWindowAccessoriesList;
    }

    public ArrayList<String> getBedroomHousePlantsList() {
        return bedroomHousePlantsList;
    }

    public void setBedroomHousePlantsList(ArrayList<String> bedroomHousePlantsList) {
        this.bedroomHousePlantsList = bedroomHousePlantsList;
    }

    public ArrayList<String> getBedroomFurnitureList() {
        return bedroomFurnitureList;
    }

    public void setBedroomFurnitureList(ArrayList<String> bedroomFurnitureList) {
        this.bedroomFurnitureList = bedroomFurnitureList;
    }

    public ArrayList<String> getBedroomLightingAccessoriesList() {
        return bedroomLightingAccessoriesList;
    }

    public void setBedroomLightingAccessoriesList(ArrayList<String> bedroomLightingAccessoriesList) {
        this.bedroomLightingAccessoriesList = bedroomLightingAccessoriesList;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "bedroomName='" + bedroomName + '\'' +
                ", bedroomHeight='" + bedroomHeight + '\'' +
                ", bedroomWidth='" + bedroomWidth + '\'' +
                ", bedroomLength='" + bedroomLength + '\'' +
                ", wallColors=" + wallColors +
                ", bedroomWindowAccessoriesList=" + bedroomWindowAccessoriesList +
                ", bedroomHousePlantsList=" + bedroomHousePlantsList +
                ", bedroomFurnitureList=" + bedroomFurnitureList +
                ", bedroomLightingAccessoriesList=" + bedroomLightingAccessoriesList +
                '}';
    }

    public Bedroom createsBedRoom(){

        Integer bedRoomCounter = ApartmentBuilder.counter;
        bedRoomCounter++;

        Bedroom bedroom = new Bedroom("Bedroom: " + bedRoomCounter, Apartment.getApartmentHeight(), 4, 4, Colors.Grey40,
                bedroomWindowAccessoriesList, bedroomHousePlantsList,
                bedroomFurnitureList, bedroomLightingAccessoriesList);

        WindowAccessories windowAccessories = new WindowAccessories();
        windowAccessories.setVerticalBlinds("Vertical blinds");
        bedroomWindowAccessoriesList.add(windowAccessories.getVerticalBlinds());
        setBedroomWindowAccessoriesList(bedroomWindowAccessoriesList);

        HousePlants housePlants = new HousePlants();
        housePlants.setFlowers("Orchid purple");
        bedroomHousePlantsList.add(housePlants.getFlowers());
        housePlants.setFlowers("Orchid purple");
        bedroomHousePlantsList.add(housePlants.getFlowers());
        setBedroomHousePlantsList(bedroomHousePlantsList);

        Furniture furniture = new Furniture();
        furniture.setLargeBedKingSize("Bed large 'King size'");
        furniture.setBedsideCabinet("Bedside cabinet");
        furniture.setBedsideCabinet("Bedside cabinet");
        furniture.setLargeStandingWardrobe("Wardrobe large");
        bedroomFurnitureList.add(furniture.getLargeBedKingSize());
        bedroomFurnitureList.add(furniture.getBedsideCabinet());
        bedroomFurnitureList.add(furniture.getBedsideCabinet());
        bedroomFurnitureList.add(furniture.getLargeStandingWardrobe());
        setBedroomFurnitureList(bedroomFurnitureList);

        LightingAccessories lightingAccessories = new LightingAccessories();
        lightingAccessories.setPendantLamp("Pendant lamp");
        lightingAccessories.setFloorLamp("Floor lamp");
        bedroomLightingAccessoriesList.add(lightingAccessories.getPendantLamp());
        bedroomLightingAccessoriesList.add(lightingAccessories.getFloorLamp());
        setBedroomLightingAccessoriesList(bedroomLightingAccessoriesList);

        return bedroom;
    }

}
