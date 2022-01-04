package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.StudentData;

public interface IStudentRepository extends JpaRepository<StudentData , Integer> {

}
