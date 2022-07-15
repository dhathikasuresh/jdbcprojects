package com.dhathika.filecreation;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// enter a paragraph and remove the chacter given form the paragraph. 
	
		
		System.out.println("Enter a paragraph");
		Scanner sc = new Scanner(System.in);
		String para = sc.nextLine();
		System.out.println("Enter the character you want remove/ omit from the paragraph");
		char c = sc.next().charAt(0);
		String paraWithoutCharacter = characterRemover(para,c);		
			System.out.print(paraWithoutCharacter);
}

	private static String characterRemover(String para, char c) {
		StringBuffer sb = new StringBuffer("");
	    for(int i =0 ; i<para.length(); i++) {
	    	 if(para.charAt(i)==c) {
	    		 continue;
	    	 }
	    	 else{
	    		sb.append(para.charAt(i)); 
	    		 }
	     }
		return sb.toString();
	}

}
