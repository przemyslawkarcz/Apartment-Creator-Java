package ApartmentCreator;

import ApartmentCreator.Colors.Colors;
import ApartmentCreator.Rooms.Kitchen;

public class KitchenRebuilder extends Kitchen {

    // default kitchen's values
    public static String defaultKitchenName = "Kitchen";
    public static Integer defaultKitchenLength = 10;
    public static Integer defaultKitchenWidth = 10;
    public static Colors defaultKitchenColor = Colors.Grey20;

    public static String defaultWindowsAccessories_Blinds = "Blind";
    public static String defaultWindowsAccessories_VerticalBlinds = "";
    public static String defaultWindowsAccessories_Curtain = "";
    public static String defaultWindowsAccessories_Shutter = "";

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

    public static String getDefaultWindowsAccessories_Blinds() {
        return defaultWindowsAccessories_Blinds;
    }

    public static void setNewWindowsAccessories_Blinds(String defaultWindowsAccessories) {
        KitchenRebuilder.defaultWindowsAccessories_Blinds = defaultWindowsAccessories;
    }

    public static String getDefaultWindowsAccessories_VerticalBlinds() {
        return defaultWindowsAccessories_VerticalBlinds;
    }

    public static void setNewWindowsAccessories_VerticalBlinds(String defaultWindowsAccessories_VerticalBlinds) {
        KitchenRebuilder.defaultWindowsAccessories_VerticalBlinds = defaultWindowsAccessories_VerticalBlinds;
    }

    public static String getDefaultWindowsAccessories_Curtain() {
        return defaultWindowsAccessories_Curtain;
    }

    public static void setNewWindowsAccessories_Curtain(String defaultWindowsAccessories_Curtain) {
        KitchenRebuilder.defaultWindowsAccessories_Curtain = defaultWindowsAccessories_Curtain;
    }

    public static String getDefaultWindowsAccessories_Shutter() {
        return defaultWindowsAccessories_Shutter;
    }

    public static void setNewWindowsAccessories_Shutter(String defaultWindowsAccessories_Shutter) {
        KitchenRebuilder.defaultWindowsAccessories_Shutter = defaultWindowsAccessories_Shutter;
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
