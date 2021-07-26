package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Grapes");
		fruits.add("Strawberry");
		fruits.add("Blueberry");
		fruits.add("Guava");
		System.out.println("=============================");
		System.out.println("in the way they were added");
		System.out.println("=============================");

		fruits.get(1);           // Accessing the element at index 1
		fruits.set(1, "Banana"); // changing the element at index 1
		Iterator<String> itr= fruits.iterator();  //looping through elements
		while(itr.hasNext()) {
			System.out.println(itr.next());   //printing each element in the list
		}
		
		System.out.println("=============================");
		System.out.println("In Sorted Order");
		System.out.println("=============================");

		Collections.sort(fruits);
		for(String fruit: fruits) {
			System.out.println(fruit); 
		}
		System.out.println("=============================");
		System.out.println("In reverse Order");
		System.out.println("=============================");

		ListIterator<String> reverseItr = fruits.listIterator(fruits.size());
		while(reverseItr.hasPrevious()) {
			System.out.println(reverseItr.previous());
		}
		
	}

}
