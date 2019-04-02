package com.services.reservations.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "ROOM")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Room {

    @Id
    @Column(name = "ROOM_ID", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long roomId;

    public Room() {

    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public long getRoomId() {
        return roomId;
    }
}