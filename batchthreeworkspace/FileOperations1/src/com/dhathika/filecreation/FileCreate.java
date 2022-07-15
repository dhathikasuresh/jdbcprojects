package com.dhathika.filecreation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreate {

	public static void main(String[] args) throws IOException {

		File file = new File(
				"C:\\Suresh Dhathika\\sdcodebase\\batchthreeworkspace\\FileOperations1\\src\\com\\dhathika\\files\\file1.txt");
		FileWriter fileWriter = new FileWriter(file,true);
		char[] newChar = {'n','a','v','e','e','n'};
		fileWriter.write(newChar, 5, 1);
	    fileWriter.write(" Hello java, I am string writng on to a file ");
	    fileWriter.write(new Employee().toString());
		fileWriter.flush();
	}

}
