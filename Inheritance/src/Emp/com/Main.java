package Emp.com;



	import java.util.Scanner;
	
	public class Main {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        EmployeeService service = new EmployeeService();

	        while (true) {
	            System.out.println("\n--- MENU ---");
	            System.out.println("1. Add Developer");
	            System.out.println("2. Add Manager");
	            System.out.println("3. Display All Employees");
	            System.out.println("4. Exit");
	            System.out.print("Enter choice: ");

	            int choice = sc.nextInt();

	            if (choice == 1) {
	                System.out.print("Enter ID: ");
	                int id = sc.nextInt();
	                sc.nextLine();

	                System.out.print("Enter Name: ");
	                String name = sc.nextLine();

	                System.out.print("Enter Salary: ");
	                double salary = sc.nextDouble();

	                System.out.print("Enter Bonus: ");
	                double bonus = sc.nextDouble();
	                sc.nextLine();

	                System.out.print("Enter Department: ");
	                String deptName = sc.nextLine();

	                Department dept = new Department(deptName);

	                Developer d = new Developer(id, name, salary, bonus, dept);
	                service.addEmployee(d);

	            } else if (choice == 2) {

	                System.out.print("Enter ID: ");
	                int id = sc.nextInt();
	                sc.nextLine();

	                System.out.print("Enter Name: ");
	                String name = sc.nextLine();

	                System.out.print("Enter Salary: ");
	                double salary = sc.nextDouble();

	                System.out.print("Enter Team Size: ");
	                int teamSize = sc.nextInt();
	                sc.nextLine();

	                System.out.print("Enter Department: ");
	                String deptName = sc.nextLine();

	                Department dept = new Department(deptName);

	                Manager m = new Manager(id, name, salary, teamSize, dept);
	                service.addEmployee(m);

	            } else if (choice == 3) {

	                service.displayAll();

	            } else if (choice == 4) {
	                System.out.println("Exiting...");
	                break;

	            } else {
	                System.out.println("Invalid Choice!");
	            }
	        }

	        sc.close();
	    }
	}


