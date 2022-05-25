package day10_Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		// initialize a Queue - PriorityQueue
		Queue<String> queueElements = new PriorityQueue<String>();
		
		// add elements to a Queue (they are added to the end of a queue)
		queueElements.add("5");
		queueElements.add("4");
		queueElements.add("3");
		
		
		// however, the PriorityQueue is different in a way
		// when removing elements from a PriorityQueue - elements are sorted
		// right before removing
		System.out.println("Removing: " + queueElements.remove());
		System.out.println("Removing: " + queueElements.remove());
		
		queueElements.add("8");
		
		for (String element : queueElements) {
			System.out.println("Element: " + element);
		}
		
	}
}
