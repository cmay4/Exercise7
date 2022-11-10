import java.util.ArrayList;

public class Course {
	
	private int id;
	private String name;
	private int maxCapacity, currentCap=0;
	private Boolean isFull=false;
	
	private Professor[] professors = new Professor[3];
	private ArrayList<Exam> exams;
	private ArrayList<Student> students = new ArrayList<>();

	
	public Course(int id, String name, int cap, Professor prof) {
		this.id=id;
		this.name=name;
		this.maxCapacity=cap;
		professors[0]=prof;
	}
	
	public void addProf(Professor prof) {
		
	}
	
	public void enroll(Student student) {
		if(!isFull) {
			students.add(student);
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
	public void apply(TA ta) {
		
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
}
