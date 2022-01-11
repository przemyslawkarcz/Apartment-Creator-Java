package ApartmentCreator;

import ApartmentCreator.Colors.Colors;
import ApartmentCreator.Equipment.Furniture;
import ApartmentCreator.Equipment.HousePlants;
import ApartmentCreator.Equipment.LightingAccessories;
import ApartmentCreator.Equipment.WindowAccessories;
import ApartmentCreator.Rooms.Bedroom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class BedRoomTest {

    @Test
    public void createsBedRoom(){

        ArrayList<String> bedroomWindowAccessoriesList = new ArrayList<>();
        ArrayList<String> bedroomHousePlantsList = new ArrayList<>();
        ArrayList<String> bedroomFurnitureList = new ArrayList<>();
        ArrayList<String> bedroomLightingAccessoriesList = new ArrayList<>();

        Bedroom new_bedroom = new Bedroom("New bedroom", 4, 10, 10, Colors.Grey40,
                bedroomWindowAccessoriesList, bedroomHousePlantsList,
                bedroomFurnitureList, bedroomLightingAccessoriesList);

        Assertions.assertEquals("New bedroom", new_bedroom.getBedroomName());
        Assertions.assertEquals(4, new_bedroom.getBedroomHeight());
        Assertions.assertEquals(10, new_bedroom.getBedroomWidth());
        Assertions.assertEquals(10, new_bedroom.getBedroomLength());
        Assertions.assertEquals(Colors.Grey40, new_bedroom.getWallColors());

        WindowAccessories windowAccessories = new WindowAccessories();
        windowAccessories.setBlind("New blind");
        windowAccessories.setCurtain("New curtain");
        bedroomWindowAccessoriesList.add(windowAccessories.getBlind());
        bedroomWindowAccessoriesList.add(windowAccessories.getCurtain());
        Assertions.assertEquals("New blind", new_bedroom.getBedroomWindowAccessoriesList().get(0));
        Assertions.assertEquals("New curtain", new_bedroom.getBedroomWindowAccessoriesList().get(1));

        HousePlants housePlants = new HousePlants();
        housePlants.setFlowers("New bedroom flowers");
        bedroomHousePlantsList.add(housePlants.getFlowers());
        Assertions.assertEquals("New bedroom flowers", new_bedroom.getBedroomHousePlantsList().get(0));

        Furniture furniture = new Furniture();
        furniture.setChestOfDrawers("New chest of drawers");
        bedroomFurnitureList.add(furniture.getChestOfDrawers());
        Assertions.assertEquals("New chest of drawers", new_bedroom.getBedroomFurnitureList().get(0));

        LightingAccessories lightingAccessories = new LightingAccessories();
        lightingAccessories.setWallLamp("New bedroom wall lamp");
        bedroomLightingAccessoriesList.add(lightingAccessories.getWallLamp());
        Assertions.assertEquals("New bedroom wall lamp", new_bedroom.getBedroomLightingAccessoriesList().get(0));

    }

}
