package ApartmentCreator;

import ApartmentCreator.Colors.Colors;
import ApartmentCreator.Equipment.*;
import ApartmentCreator.Rooms.BathRoom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class BathRoomTest {

    @Test
    public void createsBathRoom(){

        ArrayList<String> bathRoomWindowAccessoriesList = new ArrayList<>();
        ArrayList<String> bathRoomHousePlantsList = new ArrayList<>();
        ArrayList<String> bathRoomDecorativeAccessoriesList = new ArrayList<>();
        ArrayList<String> bathRoomFurnitureList = new ArrayList<>();
        ArrayList<String> bathRoomLightingAccessoriesList = new ArrayList<>();
        ArrayList<String> bathRoomHouseholdItemsList = new ArrayList<>();
        ArrayList<String> bathroomFittingsList = new ArrayList<>();
        ArrayList<String> bathroomToiletriesList = new ArrayList<>();
        ArrayList<String> bathRoomPersonalItemsList = new ArrayList<>();

        BathRoom new_bathroom = new BathRoom("New bathroom", 4, 6, 6, Colors.Grey20,
                bathRoomWindowAccessoriesList, bathRoomHousePlantsList, bathRoomDecorativeAccessoriesList,
                bathRoomFurnitureList, bathRoomLightingAccessoriesList, bathRoomHouseholdItemsList,
                bathroomFittingsList, bathroomToiletriesList, bathRoomPersonalItemsList);

        Assertions.assertEquals("New bathroom", new_bathroom.getBathRoomName());
        Assertions.assertEquals(4, new_bathroom.getBathRoomHeight());
        Assertions.assertEquals(6, new_bathroom.getBathRoomWidth());
        Assertions.assertEquals(6, new_bathroom.getBathRoomLength());
        Assertions.assertEquals(Colors.Grey20, new_bathroom.getWallColors());

        WindowAccessories windowAccessories = new WindowAccessories();
        windowAccessories.setVerticalBlinds("New vertical blinds");
        bathRoomWindowAccessoriesList.add(windowAccessories.getVerticalBlinds());
        Assertions.assertEquals("New vertical blinds", new_bathroom.getBathRoomWindowAccessoriesList().get(0));

        HousePlants housePlants = new HousePlants();
        housePlants.setFlowers("New flowers to bathroom");
        bathRoomHousePlantsList.add(housePlants.getFlowers());
        Assertions.assertEquals("New flowers to bathroom", new_bathroom.getBathRoomHousePlantsList().get(0));

        DecorativeAccessories decorativeAccessories = new DecorativeAccessories();
        decorativeAccessories.setPictures("New flowers to bathroom");
        bathRoomDecorativeAccessoriesList.add(decorativeAccessories.getPictures());
        Assertions.assertEquals("New flowers to bathroom", new_bathroom.getBathRoomDecorativeAccessoriesList().get(0));

        Furniture furniture = new Furniture();
        furniture.setHangingCabinets("New hanging cabinet");
        bathRoomFurnitureList.add(furniture.getHangingCabinets());
        Assertions.assertEquals("New hanging cabinet", new_bathroom.getBathRoomFurnitureList().get(0));

        LightingAccessories lightingAccessories = new LightingAccessories();
        lightingAccessories.setPendantLamp("New pendant lamp");
        bathRoomLightingAccessoriesList.add(lightingAccessories.getPendantLamp());
        Assertions.assertEquals("New pendant lamp", new_bathroom.getBathRoomLightingAccessoriesList().get(0));

        HouseholdItems householdItems = new HouseholdItems();
        householdItems.setWashingMachine("New washing machine");
        bathRoomHouseholdItemsList.add(householdItems.getWashingMachine());
        Assertions.assertEquals("New washing machine", new_bathroom.getBathRoomHouseholdItemsList().get(0));

        BathRoomFittings bathRoomFittings = new BathRoomFittings();
        bathRoomFittings.setShower("New shower");
        bathroomFittingsList.add(bathRoomFittings.getShower());
        Assertions.assertEquals("New shower", new_bathroom.getBathroomFittings().get(0));

        BathRoomToiletries bathRoomToiletries = new BathRoomToiletries();
        bathRoomToiletries.setSoaps("New liquid soap");
        bathroomToiletriesList.add(bathRoomToiletries.getSoaps());
        Assertions.assertEquals("New liquid soap", new_bathroom.getBathroomToiletries().get(0));

        BathRoomPersonalItems bathRoomPersonalItems = new BathRoomPersonalItems();
        bathRoomPersonalItems.setTowels("New towel");
        bathRoomPersonalItemsList.add(bathRoomPersonalItems.getTowels());
        Assertions.assertEquals("New towel", new_bathroom.getBathRoomPersonalItems().get(0));

    }

}
