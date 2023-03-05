package com.dhathika.controller;

import java.util.List;
import java.util.Scanner;

import com.dhathika.dto.Student;
import com.dhathika.service.StudentService;

public class StudentController {
	StudentService service;
	StudentController controller;

	

	public StudentController(StudentService service, StudentController controller) {
	
		this.service = service;
		this.controller = controller;
	}
	public StudentController() {
		

	}

	public static void main(String[] args) {
 StudentController stdController = new StudentController();
		System.out.println("welcome to student crud operations ");
		do {
			System.out.println("1. create student record ");
			System.out.println("2. read all student records ");
			System.out.println("3. update student record ");
			System.out.println("4. delete student record ");
			System.out.println("5. read one student record ");
			System.out.println("6. exit from application ");
			System.out.println("Enter your choice");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				stdController.createStudentRecord();
				break;
			case 2:
				stdController.readAllStudentRecord();
				break;
			case 3:
				stdController.updateStudentRecord();
				break;
			case 4:
				stdController.deleteStudentRecord();
				break;
//			case 5:
//				System.out.println("Enter a student number");
//				int sno = sc.nextInt();
//				Student student = stdcon.selectStudentByNumber(sno);
//				System.out.println(student);
//				break;

			default:
				System.exit(0);
			}

		} while (1 >= 0);

	}

	public  void createStudentRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student info");
		System.out.println("Enter student number");
		Student student = new Student();
		student.setSno(sc.nextInt());
		System.out.println("Enter student name");
		student.setSname(sc.next());
		System.out.println("enter student marks");
		student.setSmarks(sc.nextInt());
		System.out.println(service.createStudentRecord(student));

	}

	public  void readAllStudentRecord() {
		List<Student> stdList = service.readStudentRecord();
		for (Student std : stdList) {
			System.out.println(std);
		}
	}

	public  void updateStudentRecord() {
		readAllStudentRecord();
		System.out.println("Select a student record to update");
		Scanner sc = new Scanner(System.in);
		int stdNo = sc.nextInt();
		Student std = service.selectStudentByNumber(stdNo);
		System.out.println("the below object is selected for update now enter new details for the same object" + std);
		System.out.println("Enter new stduent name");
		std.setSname(sc.next());
		System.out.println("Enter new marks");
		std.setSmarks(sc.nextInt());
		String result = service.updateStudentRecord(std);
		System.out.println(result);
	}

	public  void deleteStudentRecord() {
		readAllStudentRecord();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a student number to delete from student table");
		int sno = sc.nextInt();
		String res = service.deleteStudentRecord(sno);
		System.out.println(res);
		readAllStudentRecord();
	}

}
