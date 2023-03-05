package studentmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
static ApplicationContext context = new ClassPathXmlApplicationContext("com/dhathika/spring/config/spring.xml");

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

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
				createStudentRecord();
				break;
			case 2:
				readAllStudentRecord();
				break;
			case 3:
				updateStudentRecord();
				break;
			case 4:
				deleteStudentRecord();
				break;
			case 5: System.out.println("Enter the student number to select one record");
			        int sno =  sc.nextInt();
			        readOneStudentRecord(sno);
			        break;
			default:
				System.exit(0);
			}

		} while (1 >= 0);

	}

	public static void createStudentRecord() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student info");
		System.out.println("Enter student number");
		int sno = sc.nextInt();
		System.out.println("Enter student name");
		String sname = sc.next();
		System.out.println("enter student marks");
		int smarks = sc.nextInt();
		// insert into student values(1010,'suresh',85);
		String query = "insert into student values (" + sno + "," + "'" + sname + "'" + "," + smarks + ")";
		System.out.println(query);
		Connection connection = getConnection();
		Statement stmt = connection.createStatement();
		stmt.execute(query);
	}

	public  void readAllStudentRecord() throws ClassNotFoundException, SQLException {
		String selectQuery = "select * from student";
		Connection connection = getConnection();
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(selectQuery);
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));

		}
	}
	
	public static void readOneStudentRecord(int stdno) throws ClassNotFoundException, SQLException {
		  Connection con = getConnection();
		  Statement stmt = con.createStatement();
		  ResultSet rs = stmt.executeQuery("select * from student where sno=" + stdno);
		  while(rs.next()) {
			  System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
		  }
	}

	public static void updateStudentRecord() throws ClassNotFoundException, SQLException {
		readAllStudentRecord();
		System.out.println("Select a student record to update");
		Scanner sc = new Scanner(System.in);
		int stdNo = sc.nextInt();
		System.out.println("Enter a new name for " + stdNo);
		String newName = sc.next();
		System.out.println("Enter new marks for " + stdNo);
		int newMarks = sc.nextInt();
		String updateQuery = "update student set sname=" + "'" + newName + "'" + ",smarks=" + newMarks + " where sno="
				+ stdNo;
		System.out.println(updateQuery);
		Connection connection = getConnection();
		Statement stmt = connection.createStatement();
		stmt.execute(updateQuery);
		readAllStudentRecord();
	}

	public static void deleteStudentRecord() throws ClassNotFoundException, SQLException {
		readAllStudentRecord();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a student number to delete from student table");
		int sno = sc.nextInt();
		String deleteQuery = "delete from student where sno=" + sno;
		System.out.println(deleteQuery);
		Connection connection = getConnection();
		Statement stmt = connection.createStatement();
		stmt.execute(deleteQuery);
		readAllStudentRecord();
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
				"dhathika");
		return connection;
	}
}
