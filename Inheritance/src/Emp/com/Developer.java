package Emp.com;



	public class Developer extends Employee {
	    private double bonus;

	    public Developer(int id, String name, double salary, double bonus, Department dept) {
	        super(id, name, salary, dept);
	        this.bonus = bonus;
	    }

	    @Override
	    public void display() {
	        System.out.println("\n--- Developer Details ---");
	        super.display();
	        System.out.println("Bonus: " + bonus);
	    }
	}


