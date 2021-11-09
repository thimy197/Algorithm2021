package com.leetcode.array;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * 
 * @author daoth
 *
 */
public class Longest_Common_Prefix {

	public static void main(String[] args) {

//		String test1 = "flower";
//		String test2 = "flow1";
//		System.out.println(findCommonStr(test1, test2));
		String[] strs1 = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs1));// result: "fl"
		
		String[] strs2 = {"dog","racecar","car"};
		System.out.println(longestCommonPrefix(strs2));// result: ""
		
		String[] strs3 = {"c","acc","ccc"};
		System.out.println(longestCommonPrefix(strs3));// result: ""
	}
	
	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) return "";
        // default result 
		String result = strs[0];
        // find common string between result vs strs[1]
        for(int i=1; i<strs.length; i++) {
        	result = findCommonStr(result, strs[i]);
        	if(result.isEmpty()) {
        		return result;
        	}
        }
		return result;
    }

	private static String findCommonStr(String result, String str) {
		while(str.indexOf(result) != 0) {
			result = result.substring(0, result.length()-1);
		}
		return result;
	}

}
