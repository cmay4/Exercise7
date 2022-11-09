
public class Employee {
	
	private String name;
	private int employeeId;
	
	private Department department; //aggregation
	
	public Employee(String name, int id) {
		this.name = name;
		this.employeeId = id;
		//this.setDepartment(new Department(departmentname));
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
