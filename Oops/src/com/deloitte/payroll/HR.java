package com.deloitte.payroll;

public class HR {
	public Employee recruit(char empType) {
		Employee employee=null;
		if(empType=='I') {
			employee=new Interns();						//UPCAST
		}
		else if(empType=='P') {
			employee=new ConfirmedEmployee();			//UPCAST		
		}
		else if(empType=='C') {
			employee=new ContractEmployee();			//UPCAST
		}
		return employee;
	}
}
