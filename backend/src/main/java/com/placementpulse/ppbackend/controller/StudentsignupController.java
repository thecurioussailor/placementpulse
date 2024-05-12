package com.placementpulse.ppbackend.controller;

import com.placementpulse.ppbackend.dto.Studentsignupdto;
import com.placementpulse.ppbackend.service.impl.StudentsignupService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class StudentsignupController {


    private StudentsignupService studentsignupService;

    @PostMapping("studentsignup")
    public ResponseEntity<Studentsignupdto> createStudentsignup(@RequestBody Studentsignupdto studentsignupdto){
        Studentsignupdto savedStudentsignup = studentsignupService.createStudentsignup(studentsignupdto);
        return new ResponseEntity<>(savedStudentsignup, HttpStatus.CREATED);
    }
}
