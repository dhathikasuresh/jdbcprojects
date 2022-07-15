package com.dhathika.task;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1010, "suresh");
		Employee emp2 = new Employee(1020, "Naresh");
		Employee emp3 = new Employee(10101, "Mahesh");
		Employee emp4 = new Employee(10103, "Suman");
		Employee emp5 = new Employee(10104, "seshu");
		Employee emp6 = new Employee(10107, "Nandini");
		Employee emp7 = new Employee(10108, "vipina");
		Employee emp8 = new Employee(101016, "Sriman");
		Employee emp9 = new Employee(101014, "manoj");
		Employee emp10 = new Employee(101019, "karthik");
		
		Employee empArray[] = new Employee[10];
		empArray[0] =  emp1;
		empArray[1] =  emp2;
		empArray[2] =  emp3;
		empArray[3] =  emp4;
		empArray[4] =  emp5;
		empArray[5] =  emp6;
		empArray[6] =  emp7;
		empArray[7] =  emp8;
		empArray[8] =  emp9;
		empArray[9] =  emp10;
//		empArray[9] = "String";
		// Collection frame work. 
		// Collection frame work is to deal only objects 
		// Collection means object collection
		
		Object obhj;
		Scanner sc = new Scanner(System.in);
		sc.next();
		
		
		Employee[] employeesWhoseNameStartWithS = aMethodToCollectEmployeeObjectWhoseNameStartWithS(empArray);
		for(Employee emp : employeesWhoseNameStartWithS) {
			System.out.println(emp);
		}
	}

	private static Employee[] aMethodToCollectEmployeeObjectWhoseNameStartWithS(Employee[] empArray) {
		int count = 0;
		for (int i = 0; i < empArray.length; i++) {
			if(empArray[i].getEmpName().charAt(0) == 's' || empArray[i].getEmpName().charAt(0) == 'S' ) {
				count++;
			}
		}
		Employee empA[] = new Employee[count];
		int j = 0;
		for (int i = 0; i < empArray.length; i++) {
			if(empArray[i].getEmpName().charAt(0) == 's' || empArray[i].getEmpName().charAt(0) == 'S') {
				empA[j] = empArray[i];
				j++;
			}
		}
		return empA;
	}

}
