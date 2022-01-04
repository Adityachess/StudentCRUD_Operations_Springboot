package com.example.project.service;

import java.util.List;

import com.example.project.dto.StudentDTO;
import com.example.project.model.StudentData;

public interface IStudentService {

	List<StudentData> getAllStudentData();

	StudentData getStudentById(int rollNo);

	StudentData createStudentData(StudentDTO studentDTO);

	StudentData updateStudentData(int rollNo, StudentDTO studentDTO);

	void deleteStudentRollNo(int rollNo);

}
