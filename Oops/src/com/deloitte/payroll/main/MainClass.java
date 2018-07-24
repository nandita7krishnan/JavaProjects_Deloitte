package com.deloitte.payroll.main;

import java.util.Scanner;

import com.deloitte.payroll.Accounts;
import com.deloitte.payroll.Employee;
import com.deloitte.payroll.HR;

public class MainClass {

	public static void main(String[] args) {

	//	Employee employee=new ConfirmedEmployee();
	//	employee.netSalary();
	
		
		Accounts accounts=new Accounts();

	// --------------------	
		System.out.println("Enter I P or C");
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		char ch = data.charAt(0);
		
		HR hr=new HR();
		Employee e=hr.recruit(ch);
		if(e!=null)
			accounts.processSalary(e);
		else
			System.out.println("invalid");
		
	}

}
