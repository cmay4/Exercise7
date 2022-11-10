import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student carlotta = new Student(1111, "Carlotta May");
		Student marlon = new Student(1112, "Malon Spiess");
		Professor prof = new Professor("Vogelsang", 1);
		
//		Department informatics = new Department("Informatics");
//		informatics.addEmployee(prof);
		
		Course softwareTechnik = new Course(121, "Software Engineering",9, prof);
		softwareTechnik.enroll(marlon);
		softwareTechnik.enroll(carlotta);
		
		//Constructing list of Students for Softwaretechnik exam
		ArrayList<Student> stStudents = new ArrayList();
		stStudents.add(carlotta);
		stStudents.add(marlon);
		
		ArrayList<Question> examQuestions = new ArrayList<>();
		Exam softwareEngineering = new Exam(softwareTechnik, examQuestions);
	}

}
