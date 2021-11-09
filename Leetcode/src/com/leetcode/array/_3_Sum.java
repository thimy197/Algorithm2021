package com.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * Given an integer array nums, 
 * 	- return all the triplets [nums[i], nums[j], nums[k]] 
 * 	- such that i != j, i != k, and j != k, 
 * 	and nums[i] + nums[j] + nums[k] == 0.
 * Notice that the solution set must not contain duplicate triplets.
 * 
 * @author daoth
 *
 */

public class _3_Sum {

	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-1,-4};
		List<List<Integer>> resultList = threeSum(nums);
		
		for(List<Integer> list: resultList) {
			System.out.println(list.toString());
		}
	}

	// simple solution
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> results = new ArrayList<>();
		Arrays.sort(nums);
		for(int x=0; x < nums.length-2; x++) {
			for (int y=x+1; y<nums.length-1; y++) {
				for(int z=y+1; z<nums.length; z++) {
					if(nums[x]+nums[y]+nums[z] == 0) {
						List<Integer> subResult = addElementByOrder(nums[x], nums[y], nums[z]);
						// check duplicate
						if(!results.contains(subResult)) {							
							results.add(subResult);
						}
						break;
					}
				}
			}
		}
		return results;
	}
	public static List<Integer> addElementByOrder(int x, int y, int z){
		List<Integer> numOrder = new ArrayList<>();
		numOrder.add(x);
		numOrder.add(y);
		numOrder.add(z);
		return numOrder;
	}

}
