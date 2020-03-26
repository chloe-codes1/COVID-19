package medical;

public class Organization {
	private String name;
	private int employeeCount;
	
	public Organization() {}
	public Organization(String name, int employeeCount) {
		this.name = name;
		this.employeeCount = employeeCount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeCount() {
		return employeeCount;
	}
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	@Override
	public String toString() {
		return "Organization [name=" + name + ", employeeCount=" + employeeCount + "]";
	}
	
	public void about() {
		System.out.println("Organization : " + name);
	}
}
