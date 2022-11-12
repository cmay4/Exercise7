import java.util.ArrayList;

public class Course {
	
	private int id;
	private String name;
	private int maxCapacity, currentCap=0;
	private Boolean isFull=false;
	
	private Professor[] professors = new Professor[3]; 
	
	private ArrayList<Exam> exams; //one-to-many; course can have multiple exams
	
	private ArrayList<Student> students = new ArrayList<>();
	
	private ArrayList<Project> project; //one-to-many association, 0...* multiplicity; one course can have many projects
	
	public Course(int id, String name, int cap) {
		this.id=id;
		this.name=name;
		this.maxCapacity=cap;
		
	}
	
	public void addProf(Professor prof) {
		if(professors[0]==null) {
			professors[0]=prof;
		}
		else if(professors[1]==null) {
			professors[1]=prof;
		}
		else if(professors[2]==null) {
			professors[2]=prof;
		}
		else {
			System.out.println("There are already 3 Profs for this course! No one needed!");
		}
	}
	
	public void enroll(Student student) {
		isFull();
		if(!isFull) {
			students.add(student);
			student.addCourse(this);
			isFull=this.isFull();
		}
		
	}
	
	public Boolean isFull() {
		if(students.size()==maxCapacity) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public int getMaxCap() {
		return maxCapacity;
	}
	public void setMaxCap(int max) {
		this.maxCapacity=max;
	}
	
	public TA getTa() {
		return null;
	}
	
	public void setTa(TA ta) {
		//TA erstellen und setzen
	}
	
	public void setName(String name) {
		this.name=name;
	}

	public ArrayList<Project> getProject() {
		return project;
	}

	public void setProject(ArrayList<Project> project) {
		this.project = project;
	}
	
	public void apply(TA ta) {}
}
