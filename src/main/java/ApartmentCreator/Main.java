package ApartmentCreator;

import static ApartmentCreator.ApartmentBuilder.createsApartment;

public class Main {

    public static void main(String[] args) {

        // * * * Main method * * *

        // The method creates apartment which by default consists of 1 bathroom, 1 kitchen and 1 living room
        // with other default features and with certain number of bedrooms given by user
        createsApartment();

        // In this demo if user would like to rebuild some room, must go to 'MainKitchenRedecoration' class
        // where appropriates set of methods has been prepared for redecoration of kitchen

    }

}
