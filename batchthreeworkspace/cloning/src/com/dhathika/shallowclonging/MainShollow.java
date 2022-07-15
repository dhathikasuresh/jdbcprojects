package com.dhathika.shallowclonging;

public class MainShollow {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp1 = new Employee(1010, "Vipina", 
				new Address(13,"PawanNagar"));
		
		
		System.out.println(emp1.empNo);
		System.out.println(emp1.empName);
		System.out.println(emp1.address);		
		System.out.println(emp1);
		
		System.out.println("------------------------");
		
		Employee emp2 = (Employee) emp1.clone();
		System.out.println(emp2.empNo);
		System.out.println(emp2.empName);
		System.out.println(emp2.address);		
	
	    System.out.println(emp2);
	    
	    Employee emp3 = (Employee) emp2.clone();
		System.out.println(emp3.empNo);
		System.out.println(emp3.empName);
		System.out.println(emp3.address);	
		System.out.println(emp3);
	    
	    
	    

	}

}
