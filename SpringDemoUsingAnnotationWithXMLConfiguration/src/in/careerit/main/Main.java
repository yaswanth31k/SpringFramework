package in.careerit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.careerit.beans.Course;

public class Main {

	public static void main(String[] args) {
		String config_loc="in/careerit/resources/applicationContext.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(config_loc);
		
		Course course= (Course)context.getBean("course");
		
		System.out.println("Course Id : "+course.getCourseId());
		System.out.println("Course Name : "+course.getCourseName());
		System.out.println("Course Fees : "+course.getCourseFees());

	}

}