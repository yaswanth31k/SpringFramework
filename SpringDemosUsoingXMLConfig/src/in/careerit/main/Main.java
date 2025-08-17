package in.careerit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.careerit.beans.Employee;
import in.careerit.beans.Student;

public class Main {

	public static void main(String[] args) {
		String config_loc="in/careerit/resources/applicationContext.xml";

		ApplicationContext context=new ClassPathXmlApplicationContext(config_loc);

		Student s1=(in.careerit.beans.Student)context.getBean("student1");

		System.out.println("Student Id : "+s1.getStudId());
		System.out.println("Student Name : "+s1.getStudName());
		System.out.println("Email Id : "+s1.getEmailId());

		Student s2=(in.careerit.beans.Student)context.getBean("student2");

		System.out.println("Student Id : "+s2.getStudId());
		System.out.println("Student Name : "+s2.getStudName());
		System.out.println("Email Id : "+s2.getEmailId());
		
		Employee emp=(in.careerit.beans.Employee)context.getBean("employee1");
		System.out.println("Emp Id : "+emp.getEmpId());
		System.out.println("Emp Name : "+emp.getEmpName());
		System.out.println("Emp Sal : "+emp.getEmpSal());
	}

}