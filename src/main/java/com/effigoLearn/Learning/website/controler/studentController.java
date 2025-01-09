package com.effigoLearn.Learning.website.controler;

import com.effigoLearn.Learning.website.model.StudentModel;

import com.effigoLearn.Learning.website.repo.StudentRepo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/student")
public class studentController {

    @Autowired
    private StudentRepo studentRepo;


   @GetMapping
    public List<StudentModel> getAll() {
       return studentRepo.findAll();
    }

    @PostMapping
    public StudentModel  createStudent(@RequestBody StudentModel stud ){
        return studentRepo.save(stud);

    }







}

