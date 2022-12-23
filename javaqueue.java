
package day37;

import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {
	public static void main(String[] args) {
		// Queue in java represents a data structure 
		// with first in first out (FIFO) style
		
		// Queue
		// 1. LinkedList
		// 2. PriorityQueue
		
		Queue<String> qInDmv = new LinkedList<>();
		// add elements to queue
		qInDmv.offer("Alex");
		qInDmv.offer("Misha");
		qInDmv.offer("Boris");
		qInDmv.offer("John");
		System.out.println(qInDmv); // [Alex, Misha, Boris, John]
		
		// poll() method will return first element from the queue
		//        and remove it.
		String currentCustomer = qInDmv.poll();
		System.out.println("Working with customer: " + currentCustomer);
		System.out.println("Customers in line: " + qInDmv);
		System.out.println("---");
		
		currentCustomer = qInDmv.poll();
		System.out.println("Working with customer: " + currentCustomer);
		System.out.println("Customers in line: " + qInDmv);
		System.out.println("---");
		
		currentCustomer = qInDmv.poll();
		System.out.println("Working with customer: " + currentCustomer);
		System.out.println("Customers in line: " + qInDmv);
		System.out.println("---");
		
		qInDmv.offer("Alex");
		qInDmv.offer("Kuba");
		
		currentCustomer = qInDmv.poll();
		System.out.println("Working with customer: " + currentCustomer);
		System.out.println("Customers in line: " + qInDmv);
		System.out.println("---");
	}
}