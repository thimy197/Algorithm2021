package com.leetcode;

import java.util.Arrays;
import java.util.Date;

public class Template {

	public static void main(String[] args) {
		// START: code check time
		// TODO: prepare test case
		
		long startTime = System.nanoTime();

		// TODO: run code

		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("run with: "+totalTime);
		// END: code check time
		
		// test feature
		System.out.println(reverseString("string need reverse"));
	}
	
	// In mảng 1 chiều
	public static void printArr(int[] oneDArr) {
//		for(int i=0;i<oneDArr.length;i++) {
//			System.out.println(oneDArr[i]);
//		}
		System.out.println(Arrays.toString(oneDArr)); // Output : [40, 50, 60, 70]
	}
	
	// In mảng đa chiều
	public static void printArr(int[][] twoDArray) {
		System.out.println(Arrays.deepToString(twoDArray)); // Output : [[ONE, TWO, THREE, FOUR], [FIVE, SIX, SEVEN], [EIGHT, NINE, TEN, ELEVEN, TWELVE]]
	}
	
	/**
	 * Sắp xếp các phần tử tăng dần,<br>
	 * 	- sử dụng thuật toán <b>QuickSort</b> cho mảng kiểu <b>nguyên thủy</b>,<br>
	 * 	- sử dụng <b>MergeSort</b> cho mảng kiểu <b>Object</b> <br>
	 * <br>
	 * Notes: <br>
	 * 	Collections.sort hoặc Arrays.sort() objects: sử dụng giải thuật MergeSort. <br>
	 * 		Bởi vì, MergeSort sắp xếp tương đối nhanh và ổn định với độ phức tạp là O(nlog(n)),<br> 
	 * 		trong khi QuickSort không đảm bảo sắp xếp các đối tượng luôn ổn định với độ phức tạp O(nlog(n)).<br> 
	 * 		Với QuickSort, trong trường hợp tốt nhất là O(nlog2n), trường hợp trung bình O(nlog2n), trường hợp xấu nhất là O(n2).<br>
	 *  Arrays.sort() cho primitive values sử dụng giải thuật QuickSort.<br>
	 * 
	 * @param arr
	 */
	public static void sortArr(int[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	/**
	 * Dưới đây là một cách để đảo ngược chuỗi
	 * 
	 * @param str
	 * @return string reversed
	 */
	private static String reverseString(String str) {
		return new StringBuilder(str).reverse().toString();
	}

}
