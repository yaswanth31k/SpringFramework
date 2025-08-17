package in.careerit.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.careerit.beans.Course;
import in.careerit.resources.JavaConfigFile;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfigFile.class);
		
		Course course= (Course)context.getBean("course");
		
		System.out.println("Course Id : "+course.getCourseId());
		System.out.println("Course Name : "+course.getCourseName());
		System.out.println("Course Fees : "+course.getCourseFees());

	}

}