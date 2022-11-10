import java.util.ArrayList;

public class Exam {
	
	private int maxValue;
	
	private ArrayList<Student> students = new ArrayList<>(); //many-to-many association
	private Course course;
	
	//composition has-a relationship
	private ArrayList <Question> questions;; 
	
	/*
	 * @requires questions != null
	 */
	public Exam(Course course, ArrayList<Question> questions) { //composition 
		this.questions = questions; //min. one Question... infinite
		this.course = course; //exactly one course
	}
	
	public Boolean register(Student student){
		students.add(student);
		return true;
	}
	
	public void addQuestion(int id, String task, int value) {
		questions.add(new Question(id,task,value)); //composition, question does not exist alone
	}
	
	public ArrayList<Student> getRegisteredStudents() {
		return students;
	}
	
	public void setMaxValue(int max) {
		this.maxValue=max;
	}
}
