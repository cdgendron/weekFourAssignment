import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Class {

	public static void main(String[] args) {

		
	List<Integer> grades = new ArrayList<Integer>(); 
	grades.add(100);
	grades.add(92);
	grades.add(87);
	grades.add(55); 
	grades.add(75);
	
	for(int grade: grades) {
		System.out.println(grade);
	}
	
	Set<Integer> newGrades = new HashSet<Integer>(); 
	newGrades.add(100); 
	newGrades.add(92); 
	newGrades.add(82); 
	newGrades.add(92); 
	
	for(int grade: newGrades) {
		System.out.println(grade);
	}
		
	//first String is the first value and the second string is the next value
	Map<String,String> dictionary = new  HashMap<String, String>(); 
	dictionary.put("word", "definitions"); 
	//to show the value inside the dictionary you would need to use .get
	dictionary.get("word"); //this would return definition. 
	
	Map<Integer, String> raceHorses = new HashMap<Integer, String>(); 
	raceHorses.put(21,  "Happy Come Lately"); 
	raceHorses.put(3, "Charlie"); 
	raceHorses.put(7, "Mississippi Grind"); 
	raceHorses.put(5, "Sagi"); 
	raceHorses.put(18,  "Charlie"); 
	
	//create set of keys
	
	Set<Integer> raceKeys = raceHorses.keySet(); //this set is going to contain {3, 5, 7, 21}
	
	for(Integer key: raceKeys) {
		System.out.println(key + " " + raceHorses.get(key));
	}
	
	Collection<String> horses = raceHorses.values();  
	
	
//	for(int i=0; i<raceHorses.size(); i++) {
//		System.out.println(raceHorses.get(i));
//	}
	
//	for(Integer n: raceHorses) {
//		System.out.println();
//	}
//		
	}

}
