package com.example.burgerking;

import com.example.burgerking.entity.Login;
import com.example.burgerking.repository.BurgerkingRepository;
import com.example.burgerking.service.BurgerkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class BurgerkingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BurgerkingApplication.class, args);
	}

	@Autowired
	BurgerkingService service;
}
