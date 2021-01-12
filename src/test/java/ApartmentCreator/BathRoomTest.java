package ApartmentCreator;

import ApartmentCreator.Rooms.BathRoom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BathRoomTest {

    @Test
    public void createsBathRoom(){

        BathRoom new_bathroom = new BathRoom("New bathroom");
        Assertions.assertEquals("New bathroom", new_bathroom.getBathRoomName());

    }

}
