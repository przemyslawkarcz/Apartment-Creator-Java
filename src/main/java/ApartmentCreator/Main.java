package ApartmentCreator;

import static ApartmentCreator.ApartmentBuilder.createsApartment;
import static ApartmentCreator.KitchenRebuilder.*;

public class Main {

    public static void main(String[] args) {

        //  * * * Set of methods responsible for redecoration of kitchen * * *
        //  default values for kitchen are:
        //          name = Kitchen, length = 10, width = 10, color = Grey20%
        //          windows accessories = blind, house plants = orchids
        //          decorative accessories = Moraine Lake picture,
        //          furniture = hanging kitchen cabinets, undercounter kitchen cabinets, kitchen chair, kitchen table]
        //
        //          default values for height is 4, this value is constant for whole apartment

        //  setNewKitchenName("Kitchen 5");
        //  setNewKitchenLength(5);
        //  setNewKitchenWidth(5);
        //  setNewKitchenColor(Colors.Grey50);
        //  setNewKitchenWindowsAccessories_Blinds("Blinds with 5");
        //  setNewKitchenWindowsAccessories_VerticalBlinds("V.blinds with 5");
        //  setNewKitchenWindowsAccessories_Curtain("Curtain with 5");
        //  setNewKitchenWindowsAccessories_Shutter("Shutter with 5");
        //  setNewKitchenHousePlants("5 orchids");
        //  setNewKitchenDecorativeAccessories_Pictures("5 palms picture");
        //  setNewKitchenDecorativeAccessories_Posters("Star Wars 5th episode poster");
        //  setNewKitchenDecorativeAccessories_Paintings("5th Element painting");
        //  setNewKitchenFurniture_HangingKitchenCabinets("5 kitchen hanging cabinets");
        //  setNewKitchenFurniture_UndercounterKitchenCabinets("5 kichen undercounter cabinets");
        //  setNewKitchenFurniture_KitchenChairs("5 kitchen chairs");
        //  setNewKitchenFurniture_KitchenTable("5 kitchen tables");

        // * * * Main method * * *
        // The method creates apartment which by default consists of 1 bathroom, 1 kitchen and 1 living room
        // with other default features and with certain number of bedrooms given by user
        createsApartment();

    }

}
