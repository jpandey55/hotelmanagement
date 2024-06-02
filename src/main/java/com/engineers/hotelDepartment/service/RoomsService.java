package com.engineers.hotelDepartment.service;

import com.engineers.hotelmanagement.entity.RoomEntity;
import com.engineers.hotelmanagement.model.Rooms;
import com.engineers.hotelmanagement.repository.RoomsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service //@Controller/RestController/Repository/Component/Config/Service
public class RoomsService {

    private RoomsRepository roomsRepository; //Instance variable autowire

    public RoomsService(@Autowired RoomsRepository roomsRepository) {
        this.roomsRepository = roomsRepository;
    }
    public void createRoom(Rooms rooms) {
        RoomEntity roomEntity = new RoomEntity();
        roomEntity.setRoomSize(rooms.getRoomSize());
        roomEntity.setName(rooms.getName());
        roomEntity.setBedSize(rooms.getBedSize());

        roomsRepository.save(roomEntity);
    }

    public List<Rooms> getAllRooms() {
        List<RoomEntity> all = roomsRepository.findAll();

        List<Rooms> collect = all.stream().map(s -> new Rooms(s.getName(), s.getBedSize(), s.getRoomSize())).collect(Collectors.toList());

        return collect;
    }

    public List<RoomEntity> getAllRoomsIds() {
       return roomsRepository.findAll();
    }
}
