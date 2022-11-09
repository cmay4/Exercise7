import java.util.ArrayList;

public class Course {
	
	private int id;
	private String name;
	private int maxCapacity;
	private Boolean isFull;
	
	private Professor[] professors = new Professor[3];
	private ArrayList<Exam> exams;
	
//	public Course() {
//		
//	}
	
	public Course(int id, String name, int cap, Professor prof) {
		this.id=id;
		this.name=name;
		this.maxCapacity=cap;
		professors[0]=prof;
	}
	
	public void addProf(Professor prof) {
		
	}
	
	public void enroll(Student student) {
		
	}
	
	public void apply(TA ta) {
		
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
