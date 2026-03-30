package Emp.com;

public class Employee {
	
	    protected int id;
	    protected String name;
	    protected double salary;
	    protected Department dept;   // HAS-A ✔️

	    public Employee(int id, String name, double salary, Department dept) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	        this.dept = dept;
	    }

	    public void display() {
	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Salary: " + salary);
	        dept.showDept();
	    }
	}

