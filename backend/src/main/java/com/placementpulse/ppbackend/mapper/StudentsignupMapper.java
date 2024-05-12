package com.placementpulse.ppbackend.mapper;

import com.placementpulse.ppbackend.dto.Studentsignupdto;
import com.placementpulse.ppbackend.model.Studentsignup;

public class StudentsignupMapper {

    public static Studentsignupdto mapToStudentsignupDto(Studentsignup studentsignup){
        return new Studentsignupdto(
                studentsignup.getStudentId(),
                studentsignup.getFirstName(),
                studentsignup.getLastName(),
                studentsignup.getEmail(),
                studentsignup.getPassword()
        );
    }

    public static Studentsignup mapToStudentsignup(Studentsignupdto studentsignupdto){
        return new Studentsignup(
                studentsignupdto.getStudentId(),
                studentsignupdto.getFirstName(),
                studentsignupdto.getLastName(),
                studentsignupdto.getEmail(),
                studentsignupdto.getPassword()
        );
    }
}
