
public class Employee {
	
	private String name;
	private int employeeId;
	
	private Department department; //aggregation
	
	public Employee(String name, int id, Department d) {
		this.setName(name);
		this.setEmployeeId(id);
		this.setDepartment(d);
		System.out.println("There is a new Employee: "+ name+", "+ id);
		
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	
}
