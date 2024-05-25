package com.engineers.hotelmanagement.controller;

import com.engineers.hotelmanagement.model.Rooms;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookingsController {


    @GetMapping("/booking/rooms")

    public ResponseEntity<List<Rooms>> bookings() {

        List<Rooms> rooms = new ArrayList<>();
        Rooms room1 = new Rooms("Colonial Bungalows with Machaan1", "Queen", 50);
        Rooms room2 = new Rooms("Colonial Bungalows with Machaan2", "King", 50);
        Rooms room3 = new Rooms("Colonial Bungalows with Machaan3", "Twin", 50);

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("hello", "world");

        ResponseEntity<List<Rooms>> listResponseEntity = new ResponseEntity<>(rooms, httpHeaders, HttpStatusCode.valueOf(200) );
        return listResponseEntity;

    }

}
