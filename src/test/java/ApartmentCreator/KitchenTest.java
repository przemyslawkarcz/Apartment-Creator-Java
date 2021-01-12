package ApartmentCreator;

import ApartmentCreator.Colors.Colors;
import ApartmentCreator.Equipment.*;
import ApartmentCreator.Rooms.Kitchen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class KitchenTest {

    @Test
    public void createsKitchen(){

        ArrayList<String> kitchenWindowAccessoriesList = new ArrayList<>();
        ArrayList<String> kitchenHousePlantsList = new ArrayList<>();
        ArrayList<String> kitchenDecorativeAccessoriesList = new ArrayList<>();
        ArrayList<String> kitchenFurnitureList = new ArrayList<>();
        ArrayList<String> kitchenLightingAccessoriesList = new ArrayList<>();
        ArrayList<String> kitchenHouseholdItemsList = new ArrayList<>();
        ArrayList<String> kitchenUtensilList = new ArrayList<>();

        Kitchen new_kitchen = new Kitchen("New kitchen", 4, 8, 8, Colors.Grey30,
                kitchenWindowAccessoriesList, kitchenHousePlantsList,
                kitchenDecorativeAccessoriesList, kitchenFurnitureList,
                kitchenLightingAccessoriesList, kitchenHouseholdItemsList,
                kitchenUtensilList);

        Assertions.assertEquals("New kitchen", new_kitchen.getKitchenName());
        Assertions.assertEquals(4, new_kitchen.getKitchenHeight());
        Assertions.assertEquals(8, new_kitchen.getKitchenWidth());
        Assertions.assertEquals(8, new_kitchen.getKitchenLength());
        Assertions.assertEquals(Colors.Grey30, new_kitchen.getWallColors());

        WindowAccessories windowAccessories = new WindowAccessories();
        windowAccessories.setShutter("New shutter");
        kitchenWindowAccessoriesList.add(windowAccessories.getShutter());
        Assertions.assertEquals("New shutter", new_kitchen.getKitchenWindowAccessoriesList().get(0));

        HousePlants housePlants = new HousePlants();
        housePlants.setFlowers("New kitchen flowers");
        kitchenHousePlantsList.add(housePlants.getFlowers());
        Assertions.assertEquals("New kitchen flowers", new_kitchen.getKitchenHousePlantsList().get(0));

        DecorativeAccessories decorativeAccessories = new DecorativeAccessories();
        decorativeAccessories.setPaintings("New kitchen paintings");
        kitchenDecorativeAccessoriesList.add(decorativeAccessories.getPaintings());
        Assertions.assertEquals("New kitchen paintings", new_kitchen.getKitchenDecorativeAccessoriesList().get(0));

        Furniture furniture = new Furniture();
        furniture.setKitchenTable("New kitchen table");
        kitchenFurnitureList.add(furniture.getKitchenTable());
        Assertions.assertEquals("New kitchen table", new_kitchen.getKitchenFurnitureList().get(0));

        LightingAccessories lightingAccessories = new LightingAccessories();
        lightingAccessories.setWallLamp("New kitchen wall lamp");
        kitchenLightingAccessoriesList.add(lightingAccessories.getWallLamp());
        Assertions.assertEquals("New kitchen wall lamp", new_kitchen.getKitchenLightingAccessoriesList().get(0));

        HouseholdItems householdItems = new HouseholdItems();
        householdItems.setKettle("New kettle");
        kitchenHouseholdItemsList.add(householdItems.getKettle());
        Assertions.assertEquals("New kettle", new_kitchen.getKitchenHouseholdItemsList().get(0));

        KitchenUtensil kitchenUtensil = new KitchenUtensil();
        kitchenUtensil.setGlasses("New glasses");
        kitchenUtensilList.add(kitchenUtensil.getGlasses());
        Assertions.assertEquals("New glasses", new_kitchen.getKitchenUtensilList().get(0));

    }

}
