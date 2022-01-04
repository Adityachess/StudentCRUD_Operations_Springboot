package com.example.project.model;

import com.example.project.dto.StudentDTO;

public class StudentData {

	private int rollNo;
	private String name;
	private String department;

	public StudentData() {

	}

	public StudentData(int rollNo, String name, String department) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		department = department;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getdepartment() {
		return department;
	}

	public void setDepartment(String department) {
		department = department;
	}

	@Override
	public String toString() {
		return "StudentData [rollNo=" + rollNo + ", name=" + name + ", Department=" + department + "]";
	}

	public StudentData(StudentDTO studentDTO) {
		this.updateStudentData(studentDTO);
	}

	public void updateStudentData(StudentDTO studentDTO) {
		this.name = name;
		this.department = department;

	}

}
