package com.dhathika.filecreation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileCreate {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("C:\\files\\naresh.txt");
//		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
//		out.writeObject(new Employee(1060, "naresh", 560000, "madanapalli", 8970373795l));
//		out.flush();
//	    out.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		Employee emp1 = (Employee) ois.readObject();
		System.out.println(emp1);
	    ois.close();

	}

}
