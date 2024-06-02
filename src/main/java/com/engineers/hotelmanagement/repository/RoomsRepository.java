package com.engineers.hotelmanagement.repository;

import com.engineers.hotelmanagement.entity.RoomEntity;
import com.engineers.hotelmanagement.model.Rooms;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface RoomsRepository extends JpaRepository<RoomEntity, UUID> {
}