import java.util.ArrayList;

public class Department {
	
	private String name;
	private ArrayList<Employee> employee;
	
	public Department(String deptname) {
		name=deptname;
		this.employee=employee;
	}
	
	public void addEmployee(Employee e) {
		employee.add(e);
	}
}
