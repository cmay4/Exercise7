import java.util.ArrayList;

public class Student {
	
	private int id;
	private String name;
	
	private ArrayList<Exam> exams; //many-to-many
	private ArrayList<Course> courses;
	
	private Project project;
	
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
		System.out.println("There is a new Student: "+name+ " ,"+id);
	}
	
	public String getName() {
		return this.name;
	}
	
	public Project getProject() {
		return this.project;
	}
	
}
