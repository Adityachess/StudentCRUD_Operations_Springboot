package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.dto.ResponseDTO;
import com.example.project.dto.StudentDTO;
import com.example.project.model.StudentData;
import com.example.project.service.IStudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private IStudentService studentService;

	@RequestMapping(value = { "/getAll" })
	public ResponseEntity<ResponseDTO> getAllStudentData() {
		List<StudentData> studentList = null;
		studentList = studentService.getAllStudentData();
		ResponseDTO respDTO = new ResponseDTO("Get call successful", studentList);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@GetMapping("/get/{rollNo}")
	public ResponseEntity<ResponseDTO> getStudentDataById(@PathVariable("rollNo") int rollNo) {
		StudentData studentData = null;
		studentData = studentService.getStudentById(rollNo);
		ResponseDTO respDTO = new ResponseDTO("Get call By ID successful", studentData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);

	}

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> createStudentData(@RequestBody StudentDTO studentDTO){
		StudentData studentData = null;
		studentData = studentService.createStudentData(studentDTO);
		ResponseDTO respDTO = new ResponseDTO("Created student data Successfully", studentData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);

	}
	@PutMapping("/update/{rollNo}")
	public ResponseEntity<ResponseDTO> updateStudentData(@PathVariable("rollNo") int rollNo, @RequestBody StudentDTO studentDTO){
		StudentData studentData = null;
		studentData = studentService.createStudentData(studentDTO);
		ResponseDTO respDTO = new ResponseDTO("Updated student data Successfully", studentData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);

	}
	@DeleteMapping("/remove/{rollNo}")
	public ResponseEntity<ResponseDTO> deleteStudentData(@PathVariable("rollNo") int rollNo){
		studentService.deleteStudentRollNo(rollNo);
		ResponseDTO respDTO = new ResponseDTO("Delete student data Successfully", "deletedId:" + rollNo);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);

		
	}
	
	

}
