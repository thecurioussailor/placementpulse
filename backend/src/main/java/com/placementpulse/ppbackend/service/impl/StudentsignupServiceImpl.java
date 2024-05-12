package com.placementpulse.ppbackend.service.impl;

import com.placementpulse.ppbackend.dto.Studentsignupdto;
import com.placementpulse.ppbackend.mapper.StudentsignupMapper;
import com.placementpulse.ppbackend.model.Studentsignup;
import com.placementpulse.ppbackend.repository.Studentsignuprepository;

public class StudentsignupServiceImpl implements StudentsignupService{


    private Studentsignuprepository studentsignuprepository;
    @Override
    public Studentsignupdto createStudentsignup(Studentsignupdto studentsignupdto) {

        Studentsignup studentsignup = StudentsignupMapper.mapToStudentsignup(studentsignupdto);
        Studentsignup savedStudentsignup = studentsignuprepository.save(studentsignup);
        return StudentsignupMapper.mapToStudentsignupDto(savedStudentsignup);
    }
}
