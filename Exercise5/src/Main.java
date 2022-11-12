import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//Department
		Department informatics = new Department("Informatics");
		
		//Students
		Student carlotta = new Student(1111, "Carlotta May");
		Student marlon = new Student(1112, "Malon Spiess");
		Student jonas = new Student (1323, "Jonal Walter");
		
		//Profs
		Professor prof1 = new Professor("Vogelsang", 1, informatics); //each Employeee/Prof belongs to one Department
		prof1.publicCourse();
		Professor prof2 = new Professor("Rosenkranz", 27, informatics);

		
		//Courses
		Course dataBase = new Course(155, "Database Systems", 6);
		dataBase.addProf(prof2); //each course can have 0...3 Profs
		Course softwareTechnik = new Course(121, "Software Engineering",9);
		softwareTechnik.addProf(prof1);
		
		dataBase.enroll(carlotta);//students can have multiple courses at least one; Course can have 0...* students
		softwareTechnik.enroll(marlon);
		softwareTechnik.enroll(carlotta);
		
		//Constructing list for examquestions, because they do not exist alone; 
		ArrayList<Question> examQuestions = new ArrayList<>();
		examQuestions.add(new Question(1, "Task 1", 9));
		Exam softwareEngineering = new Exam(softwareTechnik, examQuestions);
		softwareEngineering.addQuestion(2, "Task 2", 4); //Exam can have infinite number of Exam Questions
		
		//Exams can have 0...* Students registered; Students can have 0...* Exams
		softwareEngineering.register(marlon);
		softwareEngineering.register(carlotta);

		//Projects for softwareTechnik
		Project p1 = new Project("Project1", softwareTechnik);
		Project p2 = new Project("Project2", softwareTechnik);
		
		p1.addMember(marlon);
		p2.addMember(carlotta);
		p2.addMember(jonas);
		
	}

}
