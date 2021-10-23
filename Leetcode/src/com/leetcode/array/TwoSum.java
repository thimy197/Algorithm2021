package com.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// testcase
		//		int[] arr = new int[] {3,3};
		//		int target = 6;
		int[] arr = new int[] {2,7,11,15};
		int target = 9;

		long startTime = System.nanoTime();

		// run code
		//		printArr(twoSum(arr, target));
		//		printArr(twoSumTwoHashMap(arr, target));
		printArr(twoSumOneHashMap(arr, target));

		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("run with: "+totalTime);
	}

	// O(n^2)
	public static int[] twoSum(int[] nums, int target) {
		for(int i=0;i<nums.length-1;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i]+nums[j] == target){
					return new int[]{i,j};
				}
			}
		}
		return null;
	}

	// O(2n)
	// 1. tạo 1 hashMap lưu các <value, index>
	// 2. Loop lại value trong arr tìm phần bù của value đó trong hashMap 
	public static int[] twoSumTwoHashMap(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[] { i, map.get(complement) };
			}
		}
		// In case there is no solution, we'll just return null
		return null;
	}

	// O(n) 
	// 1. loop các value trong arr
	// 2. Kiểm tra phần bù của value tương ứng xem có nằm trong hashMap không
	// 2.1 Nếu có thì return cặp index hiện tại và index trong hashMah tương ứng
	// 2.2 Nếu không put <value, index> vào hashMap
	public static int[] twoSumOneHashMap(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		// In case there is no solution, we'll just return null
		return null;
	}

	public static void printArr(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}
