package day10_Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		
	    // create a hashmap
	    HashMap<String, Integer> numbers = new HashMap<>();

	    System.out.println("Initial HashMap: " + numbers);
	    
	    // put() method to add elements
	    numbers.put("One", 1);
	    numbers.put("Two", 2);
	    numbers.put("Three", 3);
	    System.out.println("HashMap after put(): " + numbers);
	    
	    
	    // Example with languages and their indexes
	    
	    HashMap<Integer, String> languages = new HashMap<>();
	    languages.put(1, "Java");
	    languages.put(2, "Python");
	    languages.put(3, "JavaScript");
	    System.out.println("HashMap: " + languages);

	    // get() method to get value
	    String value = languages.get(1);
	    System.out.println("Value at index 1: " + value);
	    
	    
	    // return set view of keys
	    // using keySet()
	    System.out.println("Keys: " + languages.keySet());

	    // return set view of values
	    // using values()
	    System.out.println("Values: " + languages.values());

	    // return set view of key/value pairs
	    // using entrySet()
	    System.out.println("Key/Value mappings: " + languages.entrySet());
	    
	    
	    // change element with key 2
	    languages.replace(2, "C++");
	    System.out.println("HashMap using replace(): " + languages);
	    
	    // remove element associated with key 2
	    String removedValue = languages.remove(2);
	    System.out.println("Removed value: " + removedValue);

	    System.out.println("Updated HashMap: " + languages);
	    
	    
	    // ITERATION through Map
	    
	    // iterate through keys only
	    System.out.print("Keys: ");
	    for (Integer key : languages.keySet()) {
	      System.out.print(key);
	      System.out.print(", ");
	    }

	    // iterate through values only
	    System.out.print("\nValues: ");
	    for (String lang : languages.values()) {
	      System.out.print(lang);
	      System.out.print(", ");
	    }
	    
	    // iterate through key/value entries
	    System.out.print("\nEntries: ");
	    for (Entry<Integer, String> entry : languages.entrySet()) {
	      System.out.print(entry);
	      System.out.print(", ");
	    }
	}
}
