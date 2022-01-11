package ApartmentCreator;

import static ApartmentCreator.KitchenRebuilder.*;

public class MainKitchenRedecoration {

    public static void main(String[] args) {

        //  * * * Set of methods responsible for redecoration of kitchen * * *
        // Uncommenting a given method runs it

        //  * * * Default values for kitchen are: * * *
        //          name = Kitchen, length = 10, width = 10, color = Grey20%
        //          windows accessories = blind
        //          house plants = orchids
        //          decorative accessories = Moraine Lake picture
        //          furniture = hanging kitchen cabinets, undercounter kitchen cabinets, kitchen chair, kitchen table
        //          lighting accessories = pendant lamp
        //          households = food processor, fridge, kettle, kitchen hood, kitchen oven, induction hob
        //          utensils = cup
        //          default values for height is 4, this value is constant for whole apartment

        // setNewKitchenName("Kitchen 5");
        //  setNewKitchenLength(5);
        //  setNewKitchenWidth(5);
        //  setNewKitchenColor(Colors.Grey50);

        //  setNewKitchenWindowsAccessories_Blinds("Blinds with 5");
        //  setNewKitchenWindowsAccessories_VerticalBlinds("V.blinds with 5");
        //  setNewKitchenWindowsAccessories_Curtain("Curtain with 5");
        //  setNewKitchenWindowsAccessories_Shutter("Shutter with 5");

        // setNewKitchenHousePlants("5 orchids");

        // setNewKitchenDecorativeAccessories_Pictures("5 palms picture");
        //  setNewKitchenDecorativeAccessories_Posters("Star Wars 5th episode poster");
        //  setNewKitchenDecorativeAccessories_Paintings("5th Element painting");

        //  setNewKitchenFurniture_HangingKitchenCabinets("5 kitchen hanging cabinets");
        //  setNewKitchenFurniture_UndercounterKitchenCabinets("5 kichen undercounter cabinets");
        //  setNewKitchenFurniture_KitchenChairs("5 kitchen chairs");
        //  setNewKitchenFurniture_KitchenTable("5 kitchen tables");

        //  setNewKitchenLightingAccessories_floorLamp("floor lamp with 5 diodes");
        //  setNewKitchenLightingAccessories_pendantLamp("pendant lamp with 5 diodes");
        //  setNewKitchenLightingAccessories_wallLamp("wall lamp with 5 diodes");

        //  setNewKitchenHouseHoldsItems_washingMachine("5A washing machine");
        //  setNewKitchenHouseHoldsItems_foodProcessor("5A food processor");
        //  setNewKitchenHouseHoldsItems_fridge("5A fridge");
        //  setNewKitchenHouseHoldsItems_kettle("5A kettle");
        //  setNewKitchenHouseHoldsItems_kitchenHood("5A kitchen hood");
        //  setNewKitchenHouseHoldsItems_kitchenOven("5A kitchen oven");
        //  setNewKitchenHouseHoldsItems_inductionHob("5A induction hob");

        //  setNewKitchenUtensils_cups("5 cups");
        //  setNewKitchenUtensils_cutlery("5 sets of cutlers");
        //  setNewKitchenUtensils_dishes("5 set of dishes");
        //  setNewKitchenUtensils_glasses("5 glasses");
        //  setNewKitchenUtensils_mugs("5 mugs");
        //  setNewKitchenUtensils_pans("5 pans");
        //  setNewKitchenUtensils_pots("5 pots");
        //  setNewKitchenUtensils_heatResistantDishes("5 heat resistant dishes");

        ApartmentBuilder apartmentBuilder = new ApartmentBuilder();
        apartmentBuilder.createsApartment();

    }

}
