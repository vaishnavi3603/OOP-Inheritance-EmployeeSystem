package Emp.com;


	public class Manager extends Employee {
	    private int teamSize;

	    public Manager(int id, String name, double salary, int teamSize, Department dept) {
	        super(id, name, salary, dept);
	        this.teamSize = teamSize;
	    }

	    @Override
	    public void display() {
	        System.out.println("\n--- Manager Details ---");
	        super.display();
	        System.out.println("Team Size: " + teamSize);
	    }
	}


