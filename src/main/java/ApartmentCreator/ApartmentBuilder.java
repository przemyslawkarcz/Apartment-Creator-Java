package ApartmentCreator;

import java.util.Scanner;
import static ApartmentCreator.ControlClass.controlsDataFormat;
import static ApartmentCreator.ControlClass.controlsRoomsNumber;
import static ApartmentCreator.PrintOutBuilder.printsWelcomeContent;

public class ApartmentBuilder {

    public static Integer counter = 0;
    public static Integer returnedEnteredRoomsNumberInTermsOfFormat;
    public static Integer returnedInspectedRoomsNumber;

    public static void createsApartment(){

        // It is welcome content with choice of number of rooms
        printsWelcomeContent();

        Scanner roomsNumber = new Scanner(System.in);
        String enteredRoomsNumber = roomsNumber.nextLine();

        // Control block - - - - - - - - - - - - - - - - - - -
        try {
            returnedEnteredRoomsNumberInTermsOfFormat = controlsDataFormat(enteredRoomsNumber);
        } catch (ApartmentCreatorDataFormatException e) {
            e.getMessage();
        }

        if (returnedEnteredRoomsNumberInTermsOfFormat == null){
            return;
        }

        returnedInspectedRoomsNumber = controlsRoomsNumber(returnedEnteredRoomsNumberInTermsOfFormat);

        if (returnedInspectedRoomsNumber == 7778){
            return;
        }
        // End of control block - - - - - - - - - - - - - - - -

        // Creates new apartment. New Apartment is an array.
        Room [] newApartment = new Room[returnedInspectedRoomsNumber + 3];

        Apartment apartment = new Apartment();
        apartment.setApartment(newApartment);

        Apartment.setApartmentHeight(4);

        // Creates bedrooms with number according to 'enteredRoomsNumber'
        for (int i = 0; i < returnedInspectedRoomsNumber; i++) {
            Bedroom bedroom = new Bedroom();
            Bedroom bedroomReturned = bedroom.createsBedRoom();

            PrintOutBuilder printOutBuilderForBedroom = new PrintOutBuilder();
            printOutBuilderForBedroom.printsBedroomFeaturesAll();

            newApartment[counter] = bedroomReturned;
            counter++;

        }

        // Creates kitchen - - - - - - - - - - - - - - - - - - - - - -
        Kitchen kitchen = new Kitchen();
        Kitchen kitchenReturned = kitchen.createsKitchen();

        // Loads kitchen into the apartment at index 0
        for (int i = 0; i < 2; i++) {
            newApartment[returnedInspectedRoomsNumber] = kitchenReturned;
        }

        PrintOutBuilder printOutBuilder = new PrintOutBuilder();
        printOutBuilder.printsKitchenFeaturesAll();
        // Kitchen end - - - - - - - - - - - - - - - - - - - - - -

        // Creates bathroom - - - - - - - - - - - - - - - - - - - - - -
        BathRoom bathRoom = new BathRoom();
        BathRoom bathRoomReturned = bathRoom.createsBathRoom();

        // Loads bathroom into the apartment at index 1
        for (int i = 0; i < 2; i++) {
            newApartment[returnedInspectedRoomsNumber + 1] = bathRoomReturned;
        }

        PrintOutBuilder printOutBuilderForBathroom = new PrintOutBuilder();
        printOutBuilderForBathroom.printsBathRoomFeaturesAll();
        // Bathroom end - - - - - - - - - - - - - - - - - - - - - - - -

        // Creates living room
        LivingRoom livingRoom = new LivingRoom();
        LivingRoom livingRoomReturned = livingRoom.createsLivingroom();

        // Loads living room into the apartment at index 2
        for (int i = 0; i < 2; i++) {
            newApartment[returnedInspectedRoomsNumber + 2] = livingRoomReturned;
        }

        PrintOutBuilder printOutBuilderForLivingRoom = new PrintOutBuilder();
        printOutBuilderForLivingRoom.printsLivingroomFeaturesAll();
        // Living room end - - - - - - - - - - - - - - - - - - - - - - -

        // Control printout the whole apartment through an apartment array
        System.out.print("\n* * * * * Control printout through apartment array: * * * * * \n");
        for (Room nA:newApartment) {
            System.out.println(nA);
        }

        // Control printout the whole apartment through an apartment field
        System.out.println("\n* * * * * Control printout through apartment field: * * * * * ");
        System.out.println(apartment);

    }

}
