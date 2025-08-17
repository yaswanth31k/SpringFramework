package in.careerit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.careerit.beans.Employee;
import in.careerit.resources.JavaConfigFile;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigFile.class);
		
		
		/*
		//Employeee emp1=(Employeee)context.getBean("employee1");
		Employeee emp1=(Employeee)context.getBean("emp1");
		System.out.println("Employee Id : "+emp1.getEmpId());
		System.out.println("Employee Name : "+emp1.getEmpName());
		System.out.println("Email Id : "+emp1.getEmailId());
		
		//Employeee emp2=(Employeee)context.getBean("employee1");
		Employeee emp2=(Employeee)context.getBean("emp2");
		System.out.println("Employee Id : "+emp2.getEmpId());
		System.out.println("Employee Name : "+emp2.getEmpName());
		System.out.println("Email Id : "+emp2.getEmailId());
		*/
		Employee emp= context.getBean(Employee.class);
		System.out.println("Employee Id : "+emp.getEmpId());
		System.out.println("Employee Name : "+emp.getEmpName());
		System.out.println("Email Id : "+emp.getEmailId());
	}

}