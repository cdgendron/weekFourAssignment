import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Videos {

	public static void main(String[] args) {
		
		/*
		 * List 
		 * 
		 * Allows duplicates
		 * It also keeps an index. The order at which you add data to a list are kept as an index.
		 *It keeps elements ordered by index
		 *It also allows null values 
		 *Common implementations: ArrayList, LinkedList, Vector 
		 */
		List<String> students = new ArrayList<String>(); 
		students.add("Rob");
		students.add("Rob");
		students.add("Sam"); 
		
		for (String student : students) {
			System.out.println(student);
		}
		
		System.out.println(students.get(2)); //Sam
		System.out.println(students.get(0)); //Rob
		
		/*
		 * Set
		 * 
		 * No duplicates
		 * A set cannot guarantee the order of the elements | it is unordered
		 * Allows for null value
		 * Common implementations: HashSet, LinkedHashSet, TreeSet 
		 */
		
		
		Set<String> states = new HashSet<String>(); 
		states.add("Alabama"); 
		states.add("Alabama"); 
		states.add("Arizona"); 
		states.add("Arkansas"); 
		states.add("California"); 
		
		System.out.println(states.size());
		System.out.println(states.contains("Delaware")); 
		if (states.contains("Alabama")) {
			states.remove("Alabama");
		}
		
		
		
		for (String state : states) {
			System.out.println(state);
		}
		
		/*
		 * Map
		 * 
		 * Map<K,V> where K is the Key, and V is the Value
		 * 
		 * Key values pairs (dictionary)
		 * Values can be duplicate, but not keys 
		 * The first position is a key, the second value is the value. 
		 * Common Implementations: HashMap, LinkedHashMap, TreeMap, Hashtable
		 * 
		 * Useful methods are .get (allowing you to find a specific element in the map) and .remove()
		 */
		
		Map<Integer, String> racerPlacements = new HashMap<Integer, String>(); 
		racerPlacements.put(1, "Tommy"); 
		racerPlacements.put(2,  "Sally"); 
		racerPlacements.put(3, "John"); 
		
		System.out.println(racerPlacements.get(1));
		
		racerPlacements.remove(1); 
		
		Set<Integer> racerKeys = racerPlacements.keySet(); 
		for (Integer key : racerKeys) {
			System.out.println(key + " : " + racerPlacements.get(key));
		}
		
		Collection<String> racers = racerPlacements.values(); 
		for (String racer : racers) {
			System.out.println(racer);
		}
		
		Map<String, String> dictionary = new HashMap<String, String>(); 
		dictionary.put("Augment",  "make (something) greater by adding to it; increase."); 
		dictionary.put("diminish", "make or become less."); 
		dictionary.put("ostentatious", "characterized by vulgar or pretentious display; designed to impress or attract notice."); 
		
		
	}
	
}
