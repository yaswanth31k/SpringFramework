package in.careerit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.careerit.beans.Student;
import in.careerit.resources.JavaConfgFile;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfgFile.class);
		
		Student s1 = context.getBean(Student.class);
		System.out.println("Student details : "+s1);

	}

}
