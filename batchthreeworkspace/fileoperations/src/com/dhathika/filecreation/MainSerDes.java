package com.dhathika.filecreation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainSerDes {

	public static void main(String[] args) throws IOException, ClassNotFoundException {	
		
		File file = new File("employee.ser");
		if(file.exists()) {
			System.out.println("file already exists, no need to create again");
		}
		else {
			file.createNewFile();
		}
//		Employee emp1 = new Employee(1010, "Naresh", 56000);
//		serialize(file, emp1);
		Employee emp2 = deSerialize(file);
		System.out.println(emp2);
	
	}
	
	
	public static void serialize(File file, Employee e) throws IOException {
		
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		System.out.println("Object is serialized successfully");
	}
	
	public static Employee deSerialize(File file) throws IOException, ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp1 = (Employee) ois.readObject();
		System.out.println("deserialized successfully");
		return emp1;
		
	}
		    
		
}
