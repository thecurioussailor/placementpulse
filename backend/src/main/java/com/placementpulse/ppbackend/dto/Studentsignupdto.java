package com.placementpulse.ppbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Studentsignupdto {

    private Long studentId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
