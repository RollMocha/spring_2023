package com.example.burgerking.repository;

import com.example.burgerking.entity.Login;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface BurgerkingRepository extends CrudRepository<Login, Integer> {
    @Query("SELECT number FROM login ORDER BY RANDOM() limit 1")
    Integer getRandomId();
}
