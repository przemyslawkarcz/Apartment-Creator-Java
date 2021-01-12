package ApartmentCreator;

import ApartmentCreator.Colors.Colors;
import ApartmentCreator.Rooms.Kitchen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KitchenTest {

    @Test
    public void createsKitchen(){

        Kitchen new_kitchen = new Kitchen("New kitchen");
        Assertions.assertEquals("New kitchen", new_kitchen.getKitchenName());

        new_kitchen.setKitchenHeight(4);
        Assertions.assertEquals(4, new_kitchen.getKitchenHeight());

        new_kitchen.setKitchenWidth(6);
        Assertions.assertEquals(6, new_kitchen.getKitchenWidth());

        new_kitchen.setKitchenLength(6);
        Assertions.assertEquals(6, new_kitchen.getKitchenLength());

        new_kitchen.setWallColors(Colors.Grey10);
        Assertions.assertEquals(Colors.Grey10, new_kitchen.getWallColors());
    }

}
