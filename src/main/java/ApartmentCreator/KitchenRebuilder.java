package ApartmentCreator;

import ApartmentCreator.Colors.Colors;
import ApartmentCreator.Rooms.Kitchen;

public class KitchenRebuilder extends Kitchen {

    // default kitchen's values
    public static String defaultKitchenName = "Kitchen";
    public static Integer defaultKitchenLength = 10;
    public static Integer defaultKitchenWidth = 10;
    public static Colors defaultKitchenColor = Colors.Grey20;
    public static String defaultWindowsAccessories = "Blind";
    public static String defaultHousePlants = "Orchids";
    public static String defaultDecorativeAccessories = "Moraine Lake picture";

    public static String getDefaultKitchenName() {
        return defaultKitchenName;
    }

    public static void setNewKitchenName(String defaultKitchenName) {
        KitchenRebuilder.defaultKitchenName = defaultKitchenName;
    }

    public static Integer getDefaultKitchenLength() {
        return defaultKitchenLength;
    }

    public static void setNewKitchenLength(Integer defaultKitchenLength) {
        KitchenRebuilder.defaultKitchenLength = defaultKitchenLength;
    }

    public static Integer getDefaultKitchenWidth() {
        return defaultKitchenWidth;
    }

    public static void setNewKitchenWidth(Integer defaultKitchenWidth) {
        KitchenRebuilder.defaultKitchenWidth = defaultKitchenWidth;
    }

    public static Colors getDefaultKitchenColor() {
        return defaultKitchenColor;
    }

    public static void setNewKitchenColor(Colors defaultKitchenColor) {
        KitchenRebuilder.defaultKitchenColor = defaultKitchenColor;
    }

    public static String getDefaultWindowsAccessories() {
        return defaultWindowsAccessories;
    }

    public static void setNewWindowsAccessories(String defaultWindowsAccessories) {
        KitchenRebuilder.defaultWindowsAccessories = defaultWindowsAccessories;
    }

    public static String getDefaultHousePlants() {
        return defaultHousePlants;
    }

    public static void setNewHousePlants(String defaultHousePlants) {
        KitchenRebuilder.defaultHousePlants = defaultHousePlants;
    }

    public static String getDefaultDecorativeAccessories() {
        return defaultDecorativeAccessories;
    }

    public static void setNewDecorativeAccessories(String defaultDecorativeAccessories) {
        KitchenRebuilder.defaultDecorativeAccessories = defaultDecorativeAccessories;
    }


}
