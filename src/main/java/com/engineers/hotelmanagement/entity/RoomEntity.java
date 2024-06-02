package com.engineers.hotelmanagement.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity(name = "rooms")
@Data
@NoArgsConstructor
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID roomId;

    @Column
    private String name;

    @Column
    private String bedSize;

    @Column
    private int roomSize;

}
