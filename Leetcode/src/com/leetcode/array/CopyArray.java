package com.leetcode.array;

public class CopyArray {

	public static void main(String[] args) {
		// Java program to demonstrate 
		// cloning of one-dimensional arrays
		int intArray[] = {1,2,3};
		int cloneArray[] = intArray.clone();
		// will print false as deep copy is created
		// for one-dimensional array
		System.out.println(intArray == cloneArray);
		for (int i = 0; i < cloneArray.length; i++) {
			System.out.print(cloneArray[i]+" ");
		}
		System.out.println("\n");

		// Java program to demonstrate 
		// cloning of multi-dimensional arrays
		int intArray1[][] = {{1,2,3},{4,5}};
		int cloneArray1[][] = intArray1.clone();
		// will print false
		System.out.println(intArray1 == cloneArray1);
		// will print true as shallow copy is created
		// i.e. sub-arrays are shared
		System.out.println(intArray1[0] == cloneArray1[0]);
		System.out.println(intArray1[1] == cloneArray1[1]);
	}

}
