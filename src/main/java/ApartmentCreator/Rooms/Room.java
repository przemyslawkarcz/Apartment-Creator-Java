package ApartmentCreator.Rooms;

import ApartmentCreator.Colors.Colors;

import java.util.ArrayList;

public class Room extends Apartment {

    public String roomName;
    public Integer roomHeight;
    public Integer roomWidth;
    public Integer roomLength;

    public Colors roomColors;

    public ArrayList roomWindowAccessoriesList;
    public ArrayList roomHousePlantsList;
    public ArrayList roomDecorativeAccessoriesList;
    private ArrayList roomFurnitureList;
    public ArrayList roomLightingAccessoriesList;

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

    public ArrayList getRoomFurnitureList() {
        return roomFurnitureList;
    }

    public void setRoomFurnitureList(ArrayList roomFurnitureList) {
        this.roomFurnitureList = roomFurnitureList;
    }

    public ArrayList getRoomLightingAccessoriesList() {
        return roomLightingAccessoriesList;
    }

    public void setRoomLightingAccessoriesList(ArrayList roomLightingAccessoriesList) {
        this.roomLightingAccessoriesList = roomLightingAccessoriesList;
    }

    public ArrayList getRoomWindowAccessoriesList() {
        return roomWindowAccessoriesList;
    }

    public void setRoomWindowAccessoriesList(ArrayList roomWindowAccessoriesList) {
        this.roomWindowAccessoriesList = roomWindowAccessoriesList;
    }

    public ArrayList getRoomHousePlantsList() {
        return roomHousePlantsList;
    }

    public void setRoomHousePlantsList(ArrayList roomHousePlantsList) {
        this.roomHousePlantsList = roomHousePlantsList;
    }

    public ArrayList getRoomDecorativeAccessoriesList() {
        return roomDecorativeAccessoriesList;
    }

    public void setRoomDecorativeAccessoriesList(ArrayList roomDecorativeAccessoriesList) {
        this.roomDecorativeAccessoriesList = roomDecorativeAccessoriesList;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Room{");
        sb.append("roomName='").append(roomName).append('\'');
        sb.append(", roomHeight=").append(roomHeight);
        sb.append(", roomWidth=").append(roomWidth);
        sb.append(", roomLength=").append(roomLength);
        sb.append(", wallColors=").append(roomColors);
        sb.append(", roomWindowAccessoriesList=").append(roomWindowAccessoriesList);
        sb.append(", roomHousePlantsList=").append(roomHousePlantsList);
        sb.append(", roomDecorativeAccessoriesList=").append(roomDecorativeAccessoriesList);
        sb.append(", roomFurnitureList=").append(getRoomFurnitureList());
        sb.append(", roomLightingAccessoriesList=").append(roomLightingAccessoriesList);
        sb.append('}');
        return sb.toString();
    }
}
