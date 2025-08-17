package in.careerit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.careerit.beans.Student;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String config_loc="in/careerit/resources/applicationContext.xml";

		ApplicationContext context=new ClassPathXmlApplicationContext(config_loc);

		
		Student s1 = context.getBean(Student.class);
		System.out.println("Student details : "+s1);

	}

}
