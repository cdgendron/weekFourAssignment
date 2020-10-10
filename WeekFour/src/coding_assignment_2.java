import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class coding_assignment_2 {

	static List<String> employeeNames = new ArrayList<String>();
	static Set<Integer> ids = new HashSet<Integer>(); 
	static Map<Integer, String> employeeMap = new HashMap<Integer, String>(); 
	
	public static void main(String[] args) {
	
		createKeySet(); 
		createEmployeeList(); 
		createMap(); 	
		seeMap(); 
		createStringBuilder(); 
		createNamesBuilder(); 
	}

	public static void createKeySet() {
		ids.add(23421);
		ids.add(12355);
		ids.add(12332);
		ids.add(23378); 
		ids.add(13582); 
	}
	
	public static void createEmployeeList() {
		employeeNames.add("Thomas");
		employeeNames.add("Curtis"); 
		employeeNames.add("Amaar");
		employeeNames.add("Kevin");
		employeeNames.add("Dax"); 
	}
	
	public static void createMap() {
		int i = 0; 
		
		for(int id: ids) {
			employeeMap.put(id, employeeNames.get(i + employeeMap.size())); 	
		}
	}
	
	public static void seeMap() {
		Set<Integer> iDs = employeeMap.keySet(); 
		for (int iD : iDs) {
			System.out.println("Employee ID: " + iD + ", " + "Employee Name: " +employeeMap.get(iD));
		}
	}

	public static void createStringBuilder() {
		
		Set<String> idString = transform(ids, String::valueOf); 
		
		for (String id: idString) {
			StringBuilder idsBuilder = new StringBuilder(id);
			idsBuilder.append("-"); 
			System.out.println(idsBuilder);
		}
		
	}
	
	public static <T, U> Set<U> transform(Set<T> set, Function<T, U> function) {
		return set.stream()
		.map(function)
		.collect(Collectors.toSet());
	}

	public static void createNamesBuilder() {
		for(int i=0; i<employeeNames.size(); i++) {
			StringBuilder namesBuilder = new StringBuilder(employeeNames.get(i)); 
			namesBuilder.append(" "); 
			System.out.println(namesBuilder);
		}
	}
}
