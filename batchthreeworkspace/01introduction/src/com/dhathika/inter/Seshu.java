package com.dhathika.inter;

public class Seshu {	
	// write a method which takes a sentence as a string and returns all the words in it as a string array
	// write a method which takes integer array and returns character array of each integer ascii value 
	
public String[] wordFinder(String str) {
	
	String strArray[] = str.split(" ");
	return strArray;

	
}

public static void main(String[] args) {
	Seshu seshu = new Seshu();
//	String[] str =  seshu.wordFinder("Once upon a time there lived a king called Midas");
//	for(String i : str)
//		System.out.println(i);	
	char[] result = seshu.asciiPrinter(new int[] {97,98,99,100,101,102});
	for(char c : result) {
		System.out.println(c);
	}
}

public char[] asciiPrinter(int array[]) {
	char[] charArray = new char[array.length]; 
	for(int i=0;i<array.length;i++)
	charArray[i] = (char)array[i];	
	return charArray;
}
}
