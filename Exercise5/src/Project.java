
public class Project {

	private String name;
	
	private Course course; //one-to-many & 0...1
	
	public Project(String name, Course course) {
		setName(name);
		this.course=course; //one-to-many association
	}
	
	public String getName() {
		return this.name;
	}
	
	private void setName(String name) {
		this.name=name;
	}
	
	public void addMember(Student student) {
		
	}
	
	public Student getMembers() {
		return null;
	}
	
}
