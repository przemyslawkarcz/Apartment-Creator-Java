package ApartmentCreator;

import ApartmentCreator.Colors.Colors;
import static ApartmentCreator.ApartmentBuilder.createsApartment;
import static ApartmentCreator.KitchenRebuilder.*;

public class Main {

    public static void main(String[] args) {

        //  * * * Set of methods responsible for redecoration of kitchen * * *
        //  default values for kitchen are:
        //          name = Kitchen, length = 10, width = 10, color = Grey20%
        //          windows accessories = blinds, house plants = orchids
        //          decorative accessories = Moraine Lake picture,
        //          default values for height is 4, this value is constant for whole apartment

        //  setNewKitchenName("Kitchen 5");
        //  setNewKitchenLength(5);
        //  setNewKitchenWidth(5);
        //  setNewKitchenColor(Colors.Grey50);
        //  setNewWindowsAccessories("Curtains with a pattern of 5");
        //  setNewHousePlants("5 orchids");
        //  setNewDecorativeAccessories("5 palms picture");

        // * * * Main method * * *
        // The method creates apartment which by default consists of 1 bathroom, 1 kitchen and 1 living room
        // with other default features and with certain number of bedrooms given by user
        createsApartment();

    }

}
