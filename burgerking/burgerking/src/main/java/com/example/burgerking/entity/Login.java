package com.example.burgerking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Login {
    @Id
    private Integer number;

    private String id;

    private String password;

    private String name;

    private Boolean power;
}
