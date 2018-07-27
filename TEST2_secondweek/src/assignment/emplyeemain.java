

package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class emplyeemain {


public static void main(String[] args)
{
	EmplyeeBo bo = new EmplyeeBo();
	Emplyeesort sort = new Emplyeesort();

	Scanner sc = new Scanner(System.in);

	System.out.println("enter the number of Employees");
	int num = sc.nextInt();
	
	
	
	EmplyeeVo[]  employees = new EmplyeeVo[num];  
	
	for(int counter=0;counter<num;counter++) {
		employees[counter]= new EmplyeeVo();
		System.out.println("empid"+"\t"+(counter+1));
		int id = sc.nextInt();
		employees[counter].setEmpid(id);
		
		System.out.println("empname"+"\t"+(counter+1));
		String name = sc.next();
		employees[counter].setEmpname(name);
		
		System.out.println("annualincome"+"\t"+(counter+1));
		double inc = sc.nextDouble();
		employees[counter].setAnnualincome(inc);
		
	  bo.calincomeTax(employees[counter]);
	  
	}
	
	
	for(int i=0;i<num;i++) {
	System.out.print(employees[i].getEmpid()+"");
	System.out.print(employees[i].getEmpname());
	System.out.print(employees[i].getAnnualincome());
	System.out.println("\n");
	
	
	}
	
	
	Arrays.sort(employees, new Emplyeesort());
	
	

	for(int i=0;i<num;i++) {
	System.out.print(employees[i].getEmpid()+" ");
	System.out.print(employees[i].getEmpname()+" ");
	System.out.print(employees[i].getAnnualincome()+" ");
	System.out.print(employees[i].getIncometax());
	System.out.println("\n");
	
	
	}
	
	
	
	
	
	
	
}






}
