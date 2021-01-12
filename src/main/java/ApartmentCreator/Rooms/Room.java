package ApartmentCreator.Rooms;

import ApartmentCreator.Colors.Colors;

import java.util.ArrayList;

public class Room extends Apartment {

    public String roomName;
    public Integer roomHeight;
    public Integer roomWidth;
    public Integer roomLength;

    public Colors roomColors;

    public ArrayList<String> roomWindowAccessoriesList;
    public ArrayList<String> roomHousePlantsList;
    public ArrayList<String> roomDecorativeAccessoriesList;
    public ArrayList<String> roomFurnitureList;
    public ArrayList<String> roomLightingAccessoriesList;

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getRoomHeight() {
        return roomHeight;
    }

    public void setRoomHeight(Integer roomHeight) {
        this.roomHeight = roomHeight;
    }

    public Integer getRoomWidth() {
        return roomWidth;
    }

    public void setRoomWidth(Integer roomWidth) {
        this.roomWidth = roomWidth;
    }

    public Integer getRoomLength() {
        return roomLength;
    }

    public void setRoomLength(Integer roomLength) {
        this.roomLength = roomLength;
    }

    public Colors getWallColors() { return roomColors;}

    public void setWallColors(Colors wallColors) { this.roomColors = wallColors;}

    public ArrayList<String> getRoomWindowAccessoriesList() {
        return roomWindowAccessoriesList;
    }

    public void setRoomWindowAccessoriesList(ArrayList<String> roomWindowAccessoriesList) {
        this.roomWindowAccessoriesList = roomWindowAccessoriesList;
    }

    public ArrayList<String> getRoomHousePlantsList() {
        return roomHousePlantsList;
    }

    public void setRoomHousePlantsList(ArrayList<String> roomHousePlantsList) {
        this.roomHousePlantsList = roomHousePlantsList;
    }

    public ArrayList<String> getRoomDecorativeAccessoriesList() {
        return roomDecorativeAccessoriesList;
    }

    public void setRoomDecorativeAccessoriesList(ArrayList<String> roomDecorativeAccessoriesList) {
        this.roomDecorativeAccessoriesList = roomDecorativeAccessoriesList;
    }

    public ArrayList<String> getRoomFurnitureList() {
        return roomFurnitureList;
    }

    public void setRoomFurnitureList(ArrayList<String> roomFurnitureList) {
        this.roomFurnitureList = roomFurnitureList;
    }

    public ArrayList<String> getRoomLightingAccessoriesList() {
        return roomLightingAccessoriesList;
    }

    public void setRoomLightingAccessoriesList(ArrayList<String> roomLightingAccessoriesList) {
        this.roomLightingAccessoriesList = roomLightingAccessoriesList;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomName='" + roomName + '\'' +
                ", roomHeight=" + roomHeight +
                ", roomWidth=" + roomWidth +
                ", roomLength=" + roomLength +
                ", roomColors=" + roomColors +
                ", roomWindowAccessoriesList=" + roomWindowAccessoriesList +
                ", roomHousePlantsList=" + roomHousePlantsList +
                ", roomDecorativeAccessoriesList=" + roomDecorativeAccessoriesList +
                ", roomFurnitureList=" + roomFurnitureList +
                ", roomLightingAccessoriesList=" + roomLightingAccessoriesList +
                '}';
    }

}
