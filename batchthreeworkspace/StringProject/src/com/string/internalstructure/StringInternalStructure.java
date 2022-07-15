package com.string.internalstructure;

import java.util.stream.Stream;

public class StringInternalStructure {

	public static void main(String[] args) {
		// string is a collection of characters

		// String methods
		// how to process an array
//		int ar[] = {1,6,9,8,5,4,6,7};
//	   for(int i=0;i<ar.length;i++) {
//		   System.out.println(ar[i]);
//	   }
//		System.out.println(str.length());
//	        for(int i=str.length()-1;i>=0;i--) {
//	        	System.out.print(str.charAt(i));
//	        }
//         System.out.println(str.codePointAt(0));
//         byte[]  byteArray = str.getBytes();
//         for(int i =0; i<byteArray.length;i++) {
//        	 System.out.println((char)byteArray[i] + "    " +    byteArray[i]);
//         }

//       char charArray[] =   str.toCharArray();
//       for(int i=0;i<charArray.length;i++) {
//    	   System.out.println(charArray[i]  +  "   " + (int)charArray[i]);
//       }


		String str = "India is my country ";
		
		for(int i=str.length()-1;i>=0;i--) 
			System.out.print(str.charAt(i));
		
		
//		char[] charArray = str.toCharArray();
//		for(int i =charArray.length-1;i>=0;i--) {
//			System.out.print(charArray[i]);
//		}
		StringBuffer sb = new StringBuffer("suresh");
	StringBuffer sbinreverse = sb.reverse();
		System.out.println(sbinreverse);
		
		

		// either insertion/ adding the elements or accessing/reading the elements is
		// only possible throught the indexes.

	}

}
