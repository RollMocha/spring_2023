package com.example.test_event.repository;

import com.example.test_event.entity.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event,Integer> {

}
