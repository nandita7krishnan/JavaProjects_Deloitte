package com.deloitte.payroll;

public class Accounts {
	public void processSalary(Employee employee) {
		if(employee instanceof ConfirmedEmployee) {
//Downcast
			ConfirmedEmployee cE = (ConfirmedEmployee)employee; //known as Restoring the full functionality of the object
			cE.transportFacility();
		
		}
		
		employee.netSalary();
	}
}
