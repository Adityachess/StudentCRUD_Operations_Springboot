package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.dto.StudentDTO;
import com.example.project.model.StudentData;
import com.example.project.repository.IStudentRepository;

@Service
public class StudentService implements IStudentService {

	@Autowired
	private IStudentRepository studentRepository;
	
	@Override
	public List<StudentData> getAllStudentData(){
		return studentRepository.findAll();
	}
	
	
	@Override
	public StudentData getStudentById(int rollNo) {
		return studentRepository.findById(rollNo).get();
	}
	
	
	@Override
	public StudentData createStudentData(StudentDTO studentDTO) {
		StudentData studentData = null;
		studentData = new StudentData(studentDTO);
		return studentRepository.save(studentData);
	}
	
	
	@Override
	public StudentData updateStudentData(int rollNo,StudentDTO studentDTO) {
		StudentData studentData = this.getStudentById(rollNo);
		studentData.updateStudentData(studentDTO);
		return studentRepository.save(studentData);
		
	}
	
	
	@Override
	public void deleteStudentRollNo(int rollNo) {
		StudentData studentData = this.getStudentById(rollNo);
		studentRepository.delete(studentData);
	}
}
