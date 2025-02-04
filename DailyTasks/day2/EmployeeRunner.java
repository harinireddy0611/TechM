package day2;

public class EmployeeRunner {
	public static void main(String args[]) {
		Employee e=new Employee();
		e.setEmployeeDetails(1,"harini", 1000000);
		e.getEmployeeDetails();
		System.out.println(e.getLoanEligiblity());
	}
}
