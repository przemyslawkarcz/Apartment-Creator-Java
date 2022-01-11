package ApartmentCreator;

import ApartmentCreator.Colors.Colors;
import ApartmentCreator.Equipment.*;
import ApartmentCreator.Rooms.LivingRoom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class LivingRoomTest {

    @Test
    public void createsLivingRoom(){

        ArrayList<String> livingRoomWindowAccessoriesList = new ArrayList<>();
        ArrayList<String> livingRoomHousePlantsList = new ArrayList<>();
        ArrayList<String> livingRoomDecorativeAccessoriesList = new ArrayList<>();
        ArrayList<String> livingRoomFurnitureList = new ArrayList<>();
        ArrayList<String> livingRoomLightingAccessoriesList = new ArrayList<>();
        ArrayList<String> livingRoomAudioVideoItems = new ArrayList<>();

        LivingRoom new_livingroom = new LivingRoom("New livingroom", 4, 10, 10, Colors.Grey20,
                livingRoomWindowAccessoriesList, livingRoomHousePlantsList, livingRoomDecorativeAccessoriesList,
                livingRoomFurnitureList, livingRoomLightingAccessoriesList, livingRoomAudioVideoItems);

        Assertions.assertEquals("New livingroom", new_livingroom.getLivingRoomName());
        Assertions.assertEquals(4, new_livingroom.getLivingRoomHeight());
        Assertions.assertEquals(10, new_livingroom.getLivingRoomWidth());
        Assertions.assertEquals(10, new_livingroom.getLivingRoomLength());
        Assertions.assertEquals(Colors.Grey20, new_livingroom.getWallColors());

        WindowAccessories windowAccessories = new WindowAccessories();
        windowAccessories.setCurtain("New curtain");
        livingRoomWindowAccessoriesList.add(windowAccessories.getCurtain());
        Assertions.assertEquals("New curtain", new_livingroom.getLivingRoomWindowAccessoriesList().get(0));

        HousePlants housePlants = new HousePlants();
        housePlants.setFlowers("New flowers");
        livingRoomHousePlantsList.add(housePlants.getFlowers());
        Assertions.assertEquals("New flowers", new_livingroom.getLivingRoomHousePlantsList().get(0));

        DecorativeAccessories decorativeAccessories = new DecorativeAccessories();
        decorativeAccessories.setPosters("New poster");
        livingRoomDecorativeAccessoriesList.add(decorativeAccessories.getPosters());
        Assertions.assertEquals("New poster", new_livingroom.getLivingRoomDecorativeAccessoriesList().get(0));

        //livingRoomAudioVideoItems
        Furniture furniture = new Furniture();
        furniture.setSofa("New sofa");
        livingRoomFurnitureList.add(furniture.getSofa());
        Assertions.assertEquals("New sofa", new_livingroom.getLivingRoomFurnitureList().get(0));

        LightingAccessories lightingAccessories = new LightingAccessories();
        lightingAccessories.setFloorLamp("New floor lamp");
        livingRoomLightingAccessoriesList.add(lightingAccessories.getFloorLamp());
        Assertions.assertEquals("New floor lamp", new_livingroom.getLivingRoomLightingAccessoriesList().get(0));

        AudioVideoItems audioVideoItems = new AudioVideoItems();
        audioVideoItems.setTvSet("New Tv set");
        livingRoomAudioVideoItems.add(audioVideoItems.getTvSet());
        Assertions.assertEquals("New Tv set", new_livingroom.getLivingRoomAudioVideoItems().get(0));

    }

}
