import java.util.ArrayList;

public class Department {
	
	private String name;
	private ArrayList<Employee> employee = new ArrayList<>(); //aggregation
	private ArrayList <Course> courses;
	
	public Department(String deptname) {
		name=deptname;
	}
	
	public void addEmployee(Employee e) {
		employee.add(e);
	}
	
	public void addCourse(Course c) {
		courses.add(c);
	}

	public ArrayList <Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList <Course> courses) {
		this.courses = courses;
	}

	public String getName() {
		return name;
	}
	
}
