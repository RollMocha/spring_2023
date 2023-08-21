package com.example.test_event.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    @Id
    private Integer id;

    private LocalDate open_day;

    private LocalDate close_day;

    private String in_image;

    private String out_image;

    private String question;

    private Boolean progress;
}
