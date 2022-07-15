package com.dhathika.components;

public class MutableNature {

	public static void main(String[] args) {
		String str = "java";
		System.out.println(str.hashCode());
		str = "java" + 8;
		System.out.println(str.hashCode());
		str = "java" + " " + 7.635989;
		System.out.println(str);
		System.out.println(str.hashCode());
       
		String str1 = new String("mahesh");
		System.out.println(str1.hashCode());
		str1 = str1+"babu";
		System.out.println(str1.hashCode());
	
		String str3 = new String();
		System.out.println("hear is the object " + str3);
		
		
		StringBuffer sb;
		sb= new StringBuffer("pawan");
		System.out.println(sb.hashCode());
		sb.append(" kalyan");
		System.out.println(sb.hashCode());
		sb= new StringBuffer("pawan");
		System.out.println(sb.hashCode());
		
		sb.append(true);
		System.out.println(sb);
		
		// StringBuffer is thread safe  // low performance
		// StringBuilder is not thread safe // high performance 
		
	
	}

}
