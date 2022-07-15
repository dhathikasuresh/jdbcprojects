package com.dhathika.inter;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
	
	
	Employee emp1 = new Employee(1010, "suresh", 56000);
	Employee emp2 = new Employee(1011, "mahesh", 10000);
	Employee emp3 = new Employee(1012, "naresh", 70000);
	Employee emp4 = new Employee(1013, "hareesh", 40000);
	Employee emp6 = new Employee(1014, "vipina", 30000);
	
	Employee emp5 = new Employee(1015, "manoj", 90000);
	Employee emp7 = new Employee(1016, "nandini", 75000);
	Employee emp8 = new Employee(1017, "sriman", 54000);
	Employee emp9 = new Employee(1018, "srikrishna", 46000);
	Employee emp10 = new Employee(1019, "pradeesh", 28000);
	
	Employee[] arrayOfemp = new Employee[10];
	arrayOfemp[0] = emp1;
	arrayOfemp[1] = emp2;
	arrayOfemp[2] = emp3;
	arrayOfemp[3] = emp4;
	arrayOfemp[4] = emp6;
	arrayOfemp[5] = emp5;
	arrayOfemp[6] = emp7;
	arrayOfemp[7] = emp8;
	arrayOfemp[8] = emp9;
	arrayOfemp[9] = emp10;
	
	Employee[] returnedArray  = getEmployeesmorethen50k(arrayOfemp);
	for(Employee emp:returnedArray) {
		System.out.println(emp);
	}
	
	}
	
	public static Employee[] getEmployeesmorethen50k(Employee[] arrayOfEmp) {
		
		
		int count =0;
		for(int i = 0 ; i<arrayOfEmp.length; i++) {
			if(arrayOfEmp[i].salary>50000) {
				count++;
			}
		}
		Employee[] newEmpArray = new Employee[count];
		int j=0;
		for(int i = 0 ; i<arrayOfEmp.length; i++) {
			if(arrayOfEmp[i].salary>50000) {
				newEmpArray[j] = arrayOfEmp[i];
				j++;
			}
		}
		return newEmpArray;
	}
 	
// method which takes employee array adn returns all employees who recieves salary more than 50000
	
}
