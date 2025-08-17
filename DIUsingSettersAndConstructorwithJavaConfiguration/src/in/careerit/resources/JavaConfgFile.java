package in.careerit.resources;

import org.springframework.context.annotation.Bean;

import in.careerit.beans.Address;
import in.careerit.beans.Student;

public class JavaConfgFile {
	@Bean
	public Address add() {
		Address ad = new Address("100","1-22","vani","3290","93");
		return ad;
	}
	
	@Bean("st")
	public Student student() {
		Student ad= new Student(131,"yash","skdj@gmail.com",add());
				
		return ad;	
	}
	
}
