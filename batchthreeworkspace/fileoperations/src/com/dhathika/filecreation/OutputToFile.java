package com.dhathika.filecreation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OutputToFile {

	public static void main(String[] args) throws IOException {
	
	File file = new File("ajay.txt");
	if(file.exists()) {
		System.out.println(file.getCanonicalPath());
	}
	else {
		file.createNewFile();
	}
	
	
	 FileOutputStream fos = new FileOutputStream(file);
     ObjectOutputStream oos = new ObjectOutputStream(fos);
     Employee emp1 = new Employee(1010, "abcd",56000);
//     oos.writeObject(emp1);
//     oos.writeObject(new Integer(151));
     oos.writeObject(new Character('s'));
     new Double(5689566);
     new Long(7411872687l);
     // Employee object is not elible for the serialization 
     // what is serialization 
     // writing an object to the external location like file, db, network(another computer is called serilization)
     // is it mean that we already written String 
     // if your class want to get eligibility for writing to exteanla locatin then that class should implement serializable interface 
    
     
	}

}
