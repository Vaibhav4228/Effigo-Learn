package com.effigoLearn.Learning.website.controler;

import com.effigoLearn.Learning.website.model.StudentModel;

import com.effigoLearn.Learning.website.repo.StudentRepo;


import org.springframework.beans.factory.annotation.Autowired;

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
    StudentModel  createStudent(@RequestBody StudentModel newStudent ){
        return studentRepo.save(newStudent);

    }

    @PutMapping("/{id}")
    StudentModel update(@RequestBody StudentModel updatedStudent, @PathVariable Long id){
      StudentModel existStudent = studentRepo.findById(id).orElse(null);
      if(existStudent != null){
          existStudent.setName(updatedStudent.getName());
          existStudent.setId(updatedStudent.getId());
          existStudent.setEmail(updatedStudent.getEmail());
          existStudent.setPassword(updatedStudent.getPassword());
          return studentRepo.save(existStudent);
      }
       return null;
    }


  @GetMapping("/{id}")
  StudentModel studentById(@PathVariable Long id){
       return studentRepo.findById(id).orElse(null);
  }

    @DeleteMapping("/{id}")
    String removeStudent(@PathVariable Long id){
       if(!studentRepo.existsById (id) ){
           return "user not found";
       }
       studentRepo.deleteById(id);
       return "Student id: " + id + "Removed....";
    }








}

