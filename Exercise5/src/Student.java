import java.util.ArrayList;

public class Student {
	
	private int id;
	private String name;
	
	private ArrayList<Exam> exams = new ArrayList<>(); //many-to-many association
	private ArrayList<Course> courses = new ArrayList<>();
	
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
	
	public void addProject(Project project) {
		this.project=project; //Student can have 0...1 Projects
	}
	
	public void addCourse(Course c) {
		courses.add(c);
	}
	
	public void addExam(Exam exam) {
		exams.add(exam);
	}
	
}
