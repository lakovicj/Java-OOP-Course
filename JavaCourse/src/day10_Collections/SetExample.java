package day10_Collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		// Creating a set using the HashSet class
        Set<Integer> set1 = new HashSet<Integer>();

        // Add elements to the set1
        set1.add(2);
        set1.add(3);
        System.out.println("Set1: " + set1);

        // Creating another set using the HashSet class
        Set<Integer> set2 = new HashSet<>();

        // Add elements
        set2.add(1);
        set2.add(2);
        System.out.println("Set2: " + set2);

        // Union of two sets - no duplicates!
        set2.addAll(set1);
        System.out.println("Union is: " + set2);
        
        // trying to add duplicated value to set2:
        set2.add(2);
        System.out.println("Set2: " + set2);
        
        System.out.println("Number of Set2 elements: " + set2.size());
        
        for (Integer element : set2) {
        	System.out.println("Element: " + element);
        }
        
	}
}
