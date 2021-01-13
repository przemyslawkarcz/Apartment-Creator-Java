package ApartmentCreator;

import ApartmentCreator.Rooms.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApartmentBuilderTest {

    @Test
    public void createsApartment(){

        Bedroom bedroom = new Bedroom();
        Bedroom newBedRoom = bedroom.createsBedRoom();

        Kitchen kitchen = new Kitchen();
        Kitchen newKitchen = kitchen.createsKitchen();

        BathRoom bathRoom = new BathRoom();
        BathRoom newBathRoom = bathRoom.createsBathRoom();

        LivingRoom livingRoom = new LivingRoom();
        LivingRoom newLivingRoom = livingRoom.createsLivingroom();

        Assertions.assertEquals("Bedroom: 1", newBedRoom.getBedroomName());
        Assertions.assertEquals("Kitchen", newKitchen.getKitchenName());
        Assertions.assertEquals("Bathroom", newBathRoom.getBathRoomName());
        Assertions.assertEquals("Livingroom", newLivingRoom.getLivingRoomName());

        Room[] apartment = new Room[4];
        apartment[0] = newBedRoom;
        apartment[1] = newKitchen;
        apartment[2] = newBathRoom;
        apartment[3] = newLivingRoom;

        Assertions.assertEquals(apartment[0].hashCode(), newBedRoom.hashCode());
        Assertions.assertEquals(apartment[1].hashCode(), newKitchen.hashCode());
        Assertions.assertEquals(apartment[2].hashCode(), newBathRoom.hashCode());
        Assertions.assertEquals(apartment[3].hashCode(), newLivingRoom.hashCode());

    }

}
