package ApartmentCreator.PrintClasses;

import ApartmentCreator.Rooms.*;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintOutBuilder {

    public static void printsWelcomeContent(){

        System.out.println("* * * Welcome to Apartment Creator * * *");
        System.out.println("A bathroom, kitchen and living room are automatically added to each apartment.");
        System.out.println("How many rooms (bedrooms) are there to be in this flat?");
        System.out.print("Rooms (bedrooms) number: ");

    }

    public void printsKitchenFeaturesAll(){

        ArrayList<Kitchen> kitchenArrayList = new ArrayList<>();

        Kitchen kitchen = new Kitchen();
        Kitchen kitchenReturned = kitchen.createsKitchen();

        kitchenArrayList.add(kitchenReturned);

        Iterator<Kitchen> kitchenIterator = kitchenArrayList.iterator();
        while (kitchenIterator.hasNext()){
            Kitchen next = kitchenIterator.next();
            System.out.println("\n* * * * * KITCHEN * * * * *");
            System.out.println("Kitchen name: " + next.getKitchenName());
            System.out.println("Kitchen height: " + Apartment.getApartmentHeight());
            System.out.println("Kitchen width: " + next.getKitchenWidth());
            System.out.println("Kitchen length: " + next.getKitchenLength());
            System.out.println("Kitchen wall colors: " + next.getWallColors());
            System.out.println("Kitchen window accessories: " + next.getKitchenWindowAccessoriesList());
            System.out.println("Kitchen plants: " + next.getKitchenHousePlantsList());
            System.out.println("Kitchen decorative accessories: " + next.getKitchenDecorativeAccessoriesList());
            System.out.println("Kitchen furniture: " + next.getKitchenFurnitureList());
            System.out.println("Kitchen lighting accessories: " + next.getKitchenLightingAccessoriesList());
            System.out.println("Kitchen households items: " + next.getKitchenHouseholdItemsList());
            System.out.println("Kitchen utensils: " + next.getKitchenUtensilList());
        }

    }

    public void printsBathRoomFeaturesAll(){

        ArrayList<BathRoom> bathRoomArrayList = new ArrayList<>();

        BathRoom bathRoom = new BathRoom();
        BathRoom bathRoomReturned = bathRoom.createsBathRoom();

        bathRoomArrayList.add(bathRoomReturned);

        Iterator<BathRoom> bathRoomIterator = bathRoomArrayList.iterator();
        while (bathRoomIterator.hasNext()){
            BathRoom next = bathRoomIterator.next();
            System.out.println("\n* * * * * BATHROOM * * * * *");
            System.out.println("Bathroom name: " + next.getBathRoomName());
            System.out.println("Bathroom height: " + Apartment.getApartmentHeight());
            System.out.println("Bathroom width: " + next.getBathRoomWidth());
            System.out.println("Bathroom length: " + next.getBathRoomLength());
            System.out.println("Bathroom wall colors: " + next.getWallColors());
            System.out.println("Bathroom window accessories: " + next.getBathRoomWindowAccessoriesList());
            System.out.println("Bathroom plants: " + next.getBathRoomHousePlantsList());
            System.out.println("Bathroom decorative accessories: " + next.getBathRoomDecorativeAccessoriesList());
            System.out.println("Bathroom furniture: " + next.getBathRoomFurnitureList());
            System.out.println("Bathroom lighting accessories: " + next.getBathRoomLightingAccessoriesList());
            System.out.println("Bathroom households items: " + next.getBathRoomHouseholdItemsList());
            System.out.println("Bathroom fittings: " + next.getBathroomFittings());
            System.out.println("Bathroom toiletries: " + next.getBathroomToiletries());
            System.out.println("Bathroom personal items: " + next.getBathRoomPersonalItems());

        }

    }

    public void printsLivingroomFeaturesAll(){

        ArrayList<LivingRoom> livingRoomArrayList = new ArrayList<>();

        LivingRoom livingRoom = new LivingRoom();
        LivingRoom livingRoomReturned = livingRoom.createsLivingroom();

        livingRoomArrayList.add(livingRoomReturned);

        Iterator<LivingRoom> livingRoomIterator = livingRoomArrayList.iterator();
        while (livingRoomIterator.hasNext()){
            LivingRoom next = livingRoomIterator.next();
            System.out.println("\n* * * * * LIVINGROOM * * * * *");
            System.out.println("Living room name: " + next.getLivingRoomName());
            System.out.println("Living room height: " + Apartment.getApartmentHeight());
            System.out.println("Living room width: " + next.getLivingRoomWidth());
            System.out.println("Living room length: " + next.getLivingRoomLength());
            System.out.println("Living room wall colors: " + next.getWallColors());
            System.out.println("Living room window accessories: " + next.getLivingRoomWindowAccessoriesList());
            System.out.println("Living room plants: " + next.getLivingRoomHousePlantsList());
            System.out.println("Living room decorative accessories: " + next.getLivingRoomDecorativeAccessoriesList());
            System.out.println("Living room furniture: " + next.getLivingRoomFurnitureList());
            System.out.println("Living room lighting accessories: " + next.getLivingRoomLightingAccessoriesList());
            System.out.println("Living room households items: " + next.getLivingRoomAudioVideoItems());

        }

    }

    public void printsBedroomFeaturesAll(){

        ArrayList<Bedroom> bedroomArrayList = new ArrayList<>();

        Bedroom bedroom = new Bedroom();
        Bedroom bedroomReturned = bedroom.createsBedRoom();

        bedroomArrayList.add(bedroomReturned);

        Iterator<Bedroom> bedroomIterator = bedroomArrayList.iterator();
        while (bedroomIterator.hasNext()){
            Bedroom next = bedroomIterator.next();
            System.out.println("\n* * * * * BEDROOM * * * * *");
            System.out.println("Bedroom name: " + next.getBedroomName());
            System.out.println("Bedroom height: " + Apartment.getApartmentHeight());
            System.out.println("Bedroom width: " + next.getBedroomWidth());
            System.out.println("Bedroom length: " + next.getBedroomLength());
            System.out.println("Bedroom wall colors: " + next.getWallColors());
            System.out.println("Bedroom window accessories list: " + next.getBedroomWindowAccessoriesList());
            System.out.println("Bedroom house plants list: " + next.getBedroomHousePlantsList());
            System.out.println("Bedroom furniture list: " + next.getBedroomFurnitureList());
            System.out.println("Bedroom lighting accessories list: " + next.getBedroomLightingAccessoriesList());

        }

    }

}
