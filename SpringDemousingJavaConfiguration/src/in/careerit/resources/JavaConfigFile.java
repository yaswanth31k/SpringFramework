package in.careerit.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.careerit.beans.Employee;

@Configuration
public class JavaConfigFile {
	@Bean("emp")
	public Employee employee() {
		Employee emp= new Employee();
		emp.setEmpId(1000);
		emp.setEmpName("Arvind");
		emp.setEmailId("arvind@gmail.com");
		
		return emp;	
	}
	
}
	/*
	@Bean("emp1")
	public Employeee employee1() {
		Employeee emp1= new Employeee();
		emp1.setEmpId(1111);
		emp1.setEmpName("Vamsi");
		emp1.setEmailId("Vamsi@gmail.com");
		
		return emp1;	
	}
	@Bean("emp2")
	public Employeee employee2() {
		Employeee emp2= new Employeee();
		emp2.setEmpId(2222);
		emp2.setEmpName("Krishna");
		emp2.setEmailId("krishna@gmail.com");
		
		return emp2;
	}

*/

//<bean class="in.careerit.beans.Employeee" id="employee1">
//<bean class="in.careerit.beans.Employeee" id="employee2">