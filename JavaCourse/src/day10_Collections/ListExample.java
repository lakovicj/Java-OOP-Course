package day10_Collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		// initialize empty ArrayList of Strings
		List<String> listOfNames = new ArrayList<String>();
		
		// print length of the list
		System.out.println("Length of list: " + listOfNames.size());
		
		// add elements to a list
		listOfNames.add("Pera");
		listOfNames.add("Marko");
		listOfNames.add("Ana");
		
		// print length of the list
		System.out.println("Length of list: " + listOfNames.size());
		
		// get n-th element of a list (indexes start from 0)
		System.out.println("2nd element: " + listOfNames.get(1));
		
		// check if list contains an element
		System.out.println("Does list contains Ana? " + listOfNames.contains("Ana"));
		
		// remove element - removing Ana from the list
		listOfNames.remove(2);
		
		System.out.println("Does list contains Ana? " + listOfNames.contains("Ana"));
		
		// iterating over list elements
		for (String name : listOfNames) {
			System.out.println("Name: " + name);
		}
		
	}
}
