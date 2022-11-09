import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student carlotta = new Student(1111, "Carlotta May");
		Student marlon = new Student(1112, "Malon Spiess");
		Professor prof = new Professor("Vogelsang", 1);
		
//		ArrayList<Employee> informaticsProfs = new ArrayList();
//		informaticsProfs.add(prof);
		Department informatics = new Department("Informatics");
		informatics.addEmployee(prof);
		
		Course softwareTechnik = new Course(121, "Software Engineering",9, prof);
		
		
		ArrayList<Student> stStudents = new ArrayList();
		stStudents.add(carlotta);
		stStudents.add(marlon);
	}

}
