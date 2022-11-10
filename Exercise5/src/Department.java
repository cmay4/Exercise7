import java.util.ArrayList;

public class Department {
	
	private String name;
	private ArrayList<Employee> employee; //aggregation
	
	public Department(String deptname) {
		name=deptname;
		this.employee=employee;
	}
	
	public void addEmployee(Employee e) {
		employee.add(e);
	}
}
