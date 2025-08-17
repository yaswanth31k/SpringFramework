package in.careerit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {
	@Value("1001")
	private int courseId;
	@Value("Java")
	private String courseName;
	@Value("5000")
	private int courseFees;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseFees=" + courseFees + "]";
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseFees() {
		return courseFees;
	}
	public void setCourseFees(int courseFees) {
		this.courseFees = courseFees;
	}
	
}