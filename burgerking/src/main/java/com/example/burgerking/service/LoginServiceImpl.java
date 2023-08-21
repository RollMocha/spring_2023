package com.example.burgerking.service;

import com.example.burgerking.entity.Login;
import com.example.burgerking.repository.BurgerkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class LoginServiceImpl implements BurgerkingService {
    @Autowired
    BurgerkingRepository repository;

    @Override
    public Iterable<Login> selectAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Login> selectOneById(Integer number) {
        return repository.findById(number);
    }

    @Override
    public void insertLogin(Login login) {
        repository.save(login);
    }

    @Override
    public void updateLogin(Login login) {
        repository.save(login);
    }

    @Override
    public void deleteLogin(Integer number) {
        repository.deleteById(number);
    }
}
