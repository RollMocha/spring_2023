package com.example.burgerking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    @Id
    private Integer number;

    private String in_image;

    private String out_image;

    private LocalDate open_day;

    private LocalDate close_day;

    private String question;

    private Boolean progress;
}
