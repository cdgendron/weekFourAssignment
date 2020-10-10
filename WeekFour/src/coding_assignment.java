import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class coding_assignment {

	static List<String> empoyeeNames = new ArrayList<String>();
	static Set<Integer> ids = new HashSet<Integer>(); 
	static Map<Integer, String> employeeMap = new HashMap<Integer, String>(); 
	static Scanner s = new Scanner(System.in); 
	
	public static void main(String[] args) {
		
		int choice = 0; 
		
		while(choice != -1) {
			showMenu(); 
			choice = s.nextInt(); 
			
			if((0 <= choice) && (choice <=5)) {
				System.out.println("Pick a valid option.");
			}else if(choice == 1) {
				showEmployeeNames();
			}else if(choice == 2) {
				showIDs();
			}else if(choice == 3) {
				showDictionary(); 
			}else if(choice == 4) {
				addEmployee(); 
			}else if(choice == 5) {
				removeEmployee(); 
			}else {
				System.out.println("Thank for playing!");
			}
		}
	}

	public static void showMenu() {
		System.out.println("1) Show list of employee names.");
		System.out.println("2) Show list of employee I.D.s");
		System.out.println("3) Show list of employees and their I.D.s");
		System.out.println("4) Add an employee to the dictionary.");
		System.out.println("5) Remove an employee from the dictionary.");
	}
	
	public static void showEmployeeNames() {
		
	}
	
	public static void showIDs() {
		Set<Integer> ids = employeeMap.keySet();
	}
	
	public static void showDictionary() {
		
	}
	
	public static void addEmployee() {
		System.out.println("Enter Employee name: ");
		String name = s.next(); 
		System.out.print("Enter employee ID: ");
		int iD = s.nextInt(); 
		
		employeeMap.put(iD, name); 
		
		System.out.println("Added Employee: " + name + " ID: " + iD);
	}
	
	public static void removeEmployee() {
		System.out.print("Enter employee ID to remove: ");
		int iD = s.nextInt(); 
		
		employeeMap.remove(iD); 
		System.out.println("Employee removed: " + iD);
		
		
	}
}
