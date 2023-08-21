package com.example.burgerking.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BurgerkingForm {

    private Integer number;

    @NotBlank
    private String id;

    @NotBlank
    private String password;

    private String name;

    private Boolean power;

    private Boolean newLogin;
}
