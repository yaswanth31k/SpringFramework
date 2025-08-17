package in.careerit.resources;

import org.springframework.context.annotation.Bean;

import in.careerit.beans.Address;
import in.careerit.beans.Student;

public class JavaConfgFile {
	@Bean
	public Address add() {
		//Address ad = new Address("100","1-22","vani","3290","93");
		Address add = new Address();
		add.setPlotNo("62w");
		add.setHouseNo("4-3-13"); 
		add.setStreet("Ram Nagar");
		add.setCity("hyd");
		add.setPincode("50072");
		return add;
	}
	
	@Bean
	public Address add1() {
		//Address ad = new Address("100","1-22","vani","3290","93");
		Address add = new Address();
		add.setPlotNo("44");
		add.setHouseNo("90"); 
		add.setStreet("vani");
		add.setCity("bang");
		add.setPincode("50000");
		return add;
	}

	
	@Bean("st")
	public Student student() {
//		Student ad= new Student(131,"yash","skdj@gmail.com",add());
		Student st= new Student();
		st.setStuId(121); 
		st.setStuName("Babu"); 
		st.setEmailId("babu@gmail.com");
		//Address address=add(); 
		//st.setAddress(address);
		//st.setAddress(add());	//manuually injecting the dependecy
		return st;	
	}
	
}
