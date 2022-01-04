package com.example.project.dto;

public class StudentDTO {

	public String name;
	public String department;

	public StudentDTO(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}

	@Override
	public String toString() {
		return "StudentDTO [name=" + name + ", department=" + department + "]";
	}

}
