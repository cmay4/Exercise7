import java.util.ArrayList;
import java.util.List;

public class Professor extends Employee { //inheritance
	

	private List<Course> courses = new ArrayList<>();
	private ArrayList <Exam> exams = new ArrayList<>();
	private Course course;

	public Professor(String name, int id, Department d){
		super(name, id, d); //generalization
		this.course = course;
		courses.add(course); //one-to-many
	}
	
	public void publicCourse() {
		
	}
	
	public void assignTA() {
		
	}
	
	public void addCourse() {
		//courses.add(new Course());
	}
}
