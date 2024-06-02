package com.engineers.hotelmanagement.controller;

import com.engineers.hotelmanagement.entity.RoomEntity;
import com.engineers.hotelmanagement.model.Rooms;
import com.engineers.hotelDepartment.service.RoomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingsController {

    private RoomsService roomsService;

    public BookingsController(@Autowired RoomsService roomsService) {
        this.roomsService = roomsService; //Prefer way to autowire
    }

    @GetMapping("/booking/rooms")
    public ResponseEntity<List<Rooms>> bookings() {
        List<Rooms> allRooms = roomsService.getAllRooms(); //IOC

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("hello", "world");

        ResponseEntity<List<Rooms>> listResponseEntity = new ResponseEntity<>(allRooms, httpHeaders, HttpStatusCode.valueOf(200) );
        return listResponseEntity;

    }

    @PostMapping("/booking/rooms")
    public void bookingsDeleteme(@RequestBody Rooms rooms) {
        roomsService.createRoom(rooms);
    }

    @GetMapping("/booking/roomswithId")
    public ResponseEntity<List<RoomEntity>> getRoomsWithIds() {
        List<RoomEntity> allRooms = roomsService.getAllRoomsIds();

        ResponseEntity<List<RoomEntity>> listResponseEntity = new ResponseEntity<>(allRooms, HttpStatusCode.valueOf(200) );
        return listResponseEntity;

    }
}
