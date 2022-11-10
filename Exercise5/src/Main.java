import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//Department
		Department informatics = new Department("Informatics");
		
		//Students
		Student carlotta = new Student(1111, "Carlotta May");
		Student marlon = new Student(1112, "Malon Spiess");
		
		//Profs
		Professor prof1 = new Professor("Vogelsang", 1, informatics);
		prof1.publicCourse();
		Professor prof2 = new Professor("Rosenkranz", 27, informatics);

		
		//Courses
		Course dataBase = new Course(155, "Database Systems", 6);
		dataBase.addProf(prof2);
		Course softwareTechnik = new Course(121, "Software Engineering",9);
		softwareTechnik.addProf(prof1);
		
		dataBase.enroll(carlotta);
		softwareTechnik.enroll(marlon);
		softwareTechnik.enroll(carlotta);
		
		
		//Constructing list of Students for Softwaretechnik exam
		ArrayList<Student> stStudents = new ArrayList();
		stStudents.add(carlotta);
		stStudents.add(marlon);
		
		ArrayList<Question> examQuestions = new ArrayList<>();
		examQuestions.add(new Question(1, "Task 1", 9));
		Exam softwareEngineering = new Exam(softwareTechnik, examQuestions);
		softwareEngineering.addQuestion(2, "Task 2", 4);
		
	}

}
