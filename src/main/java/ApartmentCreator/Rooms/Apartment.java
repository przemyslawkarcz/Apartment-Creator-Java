package ApartmentCreator.Rooms;

import java.util.Arrays;

public class Apartment {

    public Room[] apartment;
    public static Integer apartmentHeight;

    public Room[] getApartment() {
        return apartment;
    }

    public void setApartment(Room[] apartment) {
        this.apartment = apartment;
    }

    public static Integer getApartmentHeight() {
        return apartmentHeight;
    }

    public static void setApartmentHeight(Integer apartmentHeight) {
        Apartment.apartmentHeight = apartmentHeight;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "apartment=" + Arrays.toString(apartment) +
                ", apartmentHeight=" + apartmentHeight +
                '}';
    }

}
