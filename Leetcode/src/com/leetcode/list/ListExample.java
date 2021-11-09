package com.leetcode.list;
// Java program to Demonstrate List Interface
// Importing all utility classes
import java.util.*;

class ListExample {

	public static void main(String[] args)
	{

		// Creating an object of List class
		List<Integer> l1 = new ArrayList<Integer>();
		// Adding elements to object of List class
		// Custom inputs
		l1.add(0, 1);
		l1.add(1, 2);
		// Print the elements inside the object
		System.out.println(l1);

		// Now creating another List class object
		// Declaring object of integer type
		List<Integer> l2 = new ArrayList<Integer>();
		// Again adding elements to object of List class
		// Custom inputs
		l2.add(1);
		l2.add(2);
		l2.add(3);

		// Will add list l2 from 1 index
		l1.addAll(1, l2);
		System.out.println(l1);

		// Removes element from index 1
		l1.remove(1);
		// Printing the updated List 1
		System.out.println(l1);

		// Prints element at index 3 in list 1
		// using get() method
		System.out.println(l1.get(3));

		// Replace 0th element with 5
		// in List 1
		l1.set(0, 5);
		// Again printing the updated List 1
		System.out.println(l1);

		
		// Creating List class object
        List<String> al = new ArrayList<>();
        // Adding elements to the object
        // Custom inputs
        al.add("Geeks");
        al.add("Geeks");
 
        // Adding For at 1st indexes
        al.add(1, "For");
 
        // Print the initialArrayList
        System.out.println("Initial ArrayList " + al);
 
        // Now remove element from the above list
        // present at 1st index
        al.remove(1);
 
        // Print the List after removal of element
        System.out.println("After the Index Removal " + al);
 
        // Now remove the current object from the updated
        // List
        al.remove("Geeks");
 
        // Finally print the updated List now
        System.out.println("After the Object Removal "
                           + al);
	}
}
