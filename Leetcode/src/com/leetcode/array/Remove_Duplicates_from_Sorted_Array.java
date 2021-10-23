package com.leetcode.array;

public class Remove_Duplicates_from_Sorted_Array {

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4}; // Input array

		int k = removeDuplicates(nums); // Calls your implementation

		System.out.println(k);
		for (int i = 0; i < k; i++) {
			System.out.println(nums[i]);
		}
	}

	public static int removeDuplicates(int[] nums) {
		int beforeIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[beforeIndex] != nums[i]) {
				beforeIndex++;
				nums[beforeIndex] = nums[i];
			}
		}
		return nums.length == 0 ? 0 : beforeIndex+1;
	}

}
