package employee.details;

public class Employee {
	public void empid() {
	System.out.println("Emp id: 786");
	
}
	private void empname() {
	System.out.println("empname:loganathan");

	}
	private void empsalary() {
	System.out.println("empsalary: 21000");

	}
	public static void main(String[] args) {
		Employee em = new Employee();
		em.empid();
		em.empname();
		em.empsalary();
		
	}
}
