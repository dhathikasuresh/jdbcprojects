package com.dhathika.clone;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
	
	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
		Address add = new Address();
		add.hno=13;
		add.street="BoseStreet";
		add.city="Hyd";
		add.country="India";
		add.pin=515571;
		
		Subject subject = new Subject();
		subject.sub1="maths";
		subject.sub2="physics";
		subject.sub3="chem";
		Student std1 = new Student();
		std1.sno=1050;
		std1.sname = "Mahesh";
		std1.address=add;
		std1.subjects=subject;
		
	
		
	    File file = new File("C:\\logs\\myfile.txt");
//	   FileOutputStream fos = new FileOutputStream(file);
//	  ObjectOutputStream oos = new ObjectOutputStream(fos);
//	  oos.writeObject(std1);
//	  oos.close();
	    
	  FileInputStream fis = new FileInputStream(file);
	  ObjectInputStream ois = new ObjectInputStream(fis);
	  Student std2 = (Student) ois.readObject();
	  System.out.println(std2);
			
				
				
	}

}
