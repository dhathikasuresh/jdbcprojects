package com.dhathika.ui;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dhathika.dao.StudentDao;
import com.dhathika.pojo.Student;

public class WebSiteClient {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Student std = new Student();
		Scanner sc = new Scanner(System.in);
		StudentDao dao = new StudentDao();

		do {
			System.out.println("select the operation you want to perform");
			System.out.println("1.insert student");
			System.out.println("2.update student");
			System.out.println("3.select student");
			System.out.println("4.delete student");
			System.out.println("5.select all students");
			System.out.println("6.execute batch of statements");
			System.out.println("7.insert a record using prepared stmt");
			System.out.println("8.update a record using prepared stmt");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter student roll Number ");
				std.setrNo(sc.nextInt());
				System.out.println("Enter student name");
				sc.nextLine();
				String sname = sc.next();
				sc.nextLine();
				std.setsName(sname);
				System.out.println("enter student marks");
				std.setMarks(sc.nextInt());
				dao.createStudentRecord(std);
				break;
			case 2:
				System.out.println("Enter student number you wnat to update");
				std.setrNo(sc.nextInt());
				System.out.println("Enter student name");
				std.setsName(sc.next());
				dao.updateStudentRecord(std);
				break;
			case 3:
				System.out.println("Enter a sno to select a student");
				int sno = sc.nextInt();
				Student std1 = dao.selectStudentRecord(sno);
				System.out.println("the selcted student record is below");
				System.out.println(std1);
				break;
			case 4:
				System.out.println("enter a sno to delete a student record");
				int sno1 = sc.nextInt();
				dao.deleteStudentRecord(sno1);
				System.out.println(sno1 + "is deleted from the db");
				break;
			case 5:
				System.out.println("You selected option of selecting all the student records");
				List<Student> stdList = dao.selectAllStudentRecords();
				for (Student std2 : stdList) {
					System.out.println(std2);
				}
				break;
			case 6:
				System.out.println("execute batch staments");
				int[] in = dao.executeBatchOfQueries();
				for (int i : in) {
					System.out.println(i);
				}

				break;
			case 7:
				System.out.println("execute preparedstament ");
				System.out.println("Enter student roll Number ");
				std.setrNo(sc.nextInt());
				System.out.println("Enter student name");
				std.setsName(sc.next());
				System.out.println("enter student marks");
				std.setMarks(sc.nextInt());
				dao.createAStudentRecordUsingPStmt(std);
				break;
			case 8:
				System.out.println("Enter student number you wnat to update");
				std.setrNo(sc.nextInt());
				System.out.println("Enter student name");
				std.setsName(sc.next());
				System.out.println("Enter marks too");
				std.setMarks(sc.nextInt());
				dao.updateAStudentRecordUsingPStmt(std);
				break;
			default:
				System.out.println("your choice is not present");
				System.exit(0);

			}
		} while (1 != 0);

	}

}
