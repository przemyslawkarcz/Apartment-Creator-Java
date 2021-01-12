package ApartmentCreator;

import ApartmentCreator.Rooms.Bedroom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BedRoomTest {

    @Test
    public void createsBedRoom(){

        Bedroom new_bedroom = new Bedroom("New bedroom");
        Assertions.assertEquals("New bedroom", new_bedroom.getBedroomName());

    }



}
