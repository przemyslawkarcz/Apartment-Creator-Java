package ApartmentCreator;

public class BedroomRestorer {

    // If you want to change anything in your bedroom use this class
    // and adequate methods in it

    public static void main(String[] args) {

        Bedroom bedroom = new Bedroom();

        changesColors(bedroom, Colors.Grey60);

    }

    // changes wall color
    public static Colors changesColors(Room someRoom, Colors someColor){

        //bedRoomReturned;
        someRoom.setWallColors(someColor);

        return someColor;
    }


}
