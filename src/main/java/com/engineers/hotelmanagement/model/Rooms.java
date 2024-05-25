package com.engineers.hotelmanagement.model;

//Encapsulation

public class Rooms {

    public Rooms(){

    }

    public Rooms(String name, String bedSize, int roomSize) {
        this.name = name;
        this.bedSize = bedSize;
        this.roomSize = roomSize;
    }


    //State / attribute
    private String name;
    private String bedSize;
    private int roomSize;

    //Behaviors
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getBedSize() {
        return bedSize;
    }

    public void setBedSize(String bedSize) {
        this.bedSize = bedSize;
    }

    public int getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(int roomSize) {
        this.roomSize = roomSize;
    }
}
