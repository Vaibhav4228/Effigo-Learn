package com.effigoLearn.Learning.website.repo;

import com.effigoLearn.Learning.website.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentModel, Integer> {

}
