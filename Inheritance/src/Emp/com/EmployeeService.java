package Emp.com;


	import java.util.ArrayList;
	

	public class EmployeeService {

	    private ArrayList<Employee> list = new ArrayList<>();

	    public void addEmployee(Employee e) {
	        list.add(e);
	        System.out.println("Employee Added Successfully!");
	    }

	    public void displayAll() {
	        if (list.isEmpty()) {
	            System.out.println("No Employees Found!");
	            return;
	        }

	        for (Employee e : list) {
	            e.display();   
	        }
	    }
	}
