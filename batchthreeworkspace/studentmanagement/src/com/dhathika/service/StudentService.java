package com.dhathika.service;

import java.util.List;

import com.dhathika.dto.Student;
import com.dhathika.repository.StudentRepository;

public class StudentService {
       StudentRepository repository ;
       
	public StudentService(StudentRepository repository) {
	
		this.repository = repository;
	}

	public String createStudentRecord(Student student) {
     return repository.createStudentRecord(student);
	}

	public List<Student> readStudentRecord()  {
		System.out.println("entered into service layer ");
         List<Student> stdList = repository.readStudentRecords();
		return stdList;
	}

	public String updateStudentRecord(Student student) {
		String result = repository.updateStudentRecord(student);
		return result;
	}

	public String deleteStudentRecord(int sno) {
		return repository.deleteStudentRecord(sno);

	}

	public Student selectStudentByNumber(int stdNo) {
		Student std = repository.selectOneStudentByNumber(stdNo);
		return std;
	}
}
