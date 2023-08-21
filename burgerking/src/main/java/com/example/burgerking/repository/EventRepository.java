package com.example.burgerking.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.burgerking.entity.Event;

public interface EventRepository extends CrudRepository<Event, Integer> {

}
