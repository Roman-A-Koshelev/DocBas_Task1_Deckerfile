package com.example.demo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
public class Profile {

    @Id
    private Long id;

    private String firstName;

    private String lastName;

    private LocalDate birthDate;
}
