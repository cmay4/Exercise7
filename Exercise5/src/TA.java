import java.util.ArrayList;

public class TA {
	
	String name;
	
	private ArrayList<Exam> exams;
	private ArrayList<Course> courses;
	
	public TA(String name) {
		setName(name);
	}
	
	public Course getCourse() {
		Course c = courses.get(0);
		return c;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void extendCourse(Course course) {
		courses.add(course);
	}
}
