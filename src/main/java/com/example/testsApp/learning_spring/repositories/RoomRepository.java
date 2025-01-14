package com.example.testsApp.learning_spring.repositories;

import com.example.testsApp.learning_spring.model.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
