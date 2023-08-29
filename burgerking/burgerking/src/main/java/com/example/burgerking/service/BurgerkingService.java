package com.example.burgerking.service;

import com.example.burgerking.entity.Login;
import java.util.Optional;

public interface BurgerkingService {
    Iterable<Login> selectAll();
    Optional<Login> selectOneById(Integer number);
    void insertLogin(Login login);
    void updateLogin(Login login);
    void deleteLogin(Integer number);
}
